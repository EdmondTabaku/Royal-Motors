package com.yy.royalmotors.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "plate")
    private String plate;

    @Column(name = "register_date")
    private Date registerDate;

    @Column(name = "model")
    private String model;

    @Column(name = "production_year")
    private Date productionYear;

    @OneToMany(
            mappedBy = "car",
            cascade = CascadeType.ALL
    )
    private List<Service> serviceList = new ArrayList<>();


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

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }
}
