package com.yy.royalmotors.dto;

import com.yy.royalmotors.model.RoleEnum;

public class RoleDto {

    private Integer id;
    private RoleEnum name;


    ///////////////////////////////////////////////////////////////////////
    ///////////////////////// GETTERS AND SETTERS /////////////////////////
    ///////////////////////////////////////////////////////////////////////


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoleEnum getName() {
        return name;
    }

    public void setName(RoleEnum name) {
        this.name = name;
    }
}
