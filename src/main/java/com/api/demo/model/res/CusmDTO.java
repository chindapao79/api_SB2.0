package com.api.demo.model.res;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "customers")
@Data
public class CusmDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerid;
    private String customername;
    private String contactname;
    private String address;
    private String city;
    private String postalcode;
    private String country;
}
