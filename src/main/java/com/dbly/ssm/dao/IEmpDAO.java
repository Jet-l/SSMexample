package com.dbly.ssm.dao;

import com.dbly.ssm.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmpDAO {
    void addEmp(Emp emp);

    List<Emp> listEmp();

    Emp findEmpByEmpno(Integer empno);

    void updateEmp(Emp emp);

}
