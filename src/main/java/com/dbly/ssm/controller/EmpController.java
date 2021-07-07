package com.dbly.ssm.controller;

import com.dbly.ssm.dao.IEmpDAO;
import com.dbly.ssm.entity.Emp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private IEmpDAO empDAO;

    @RequestMapping("/toRegist.do")
    public String toRegist(){
        return "regist";
    }

    @RequestMapping("/regist.do")
    public String regist(Emp emp){
        empDAO.addEmp(emp);
        return "redirect:/list.do";
    }

    @RequestMapping("/toUpdate.do")
    public String toUpdate(Integer empno,ModelMap map){
        Emp emp=empDAO.findEmpByEmpno(empno);
        map.addAttribute("emp",emp);
        return "update";
    }
    @RequestMapping("/update.do")
    public String update(Emp emp){
        empDAO.updateEmp(emp);
        return "redirect:list.do";
    }

    @RequestMapping("/list.do")
    public String list(ModelMap map, @RequestParam(defaultValue = "1") Integer pageNum){
        Integer pageSize = 2;
        PageHelper.startPage(pageNum,pageSize);
        List<Emp> list=
        empDAO.listEmp();
        PageInfo<Emp> pageInfo = new PageInfo<Emp>(list);

        map.addAttribute("pageInfo",pageInfo);
        return "list";
    }

}
