package com.zb.entity;

import java.io.Serializable;

public class Dept implements Serializable {
    private int id;
    private String deptname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

}


