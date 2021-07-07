package com.dbly.ssm.entity;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private int empno;
    private String ename;
    private String password;
    private Double sal;
    private String deptName;
}
