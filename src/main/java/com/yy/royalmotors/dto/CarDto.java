package com.yy.royalmotors.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarDto {

    private Integer id;
    private String plate;
    private Date registerDate;
    private String model;
    private Date productionYear;
    private List<ServiceDto> serviceList = new ArrayList<>();



    ///////////////////////////////////////////////////////////////////////
    ///////////////////////// GETTERS AND SETTERS /////////////////////////
    ///////////////////////////////////////////////////////////////////////


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Date productionYear) {
        this.productionYear = productionYear;
    }

    public List<ServiceDto> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<ServiceDto> serviceList) {
        this.serviceList = serviceList;
    }
}
