package com.arshdeep.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.security.PrivateKey;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Component

public class Person implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private int id ;


    @JsonProperty("personalTitle")
    private String personalTitle = null;



    @JsonProperty("fullName")
    private String fullName = null;

    @Autowired
    @JsonProperty("phone")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "contactMechId" )
    private Phone phone;

    private int contactMechId;

    @Autowired
    @JsonProperty("address")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_fk")
    private PostalAddress address = null;


    @JsonProperty("email")
    private String email = null;

    @JsonProperty("gender")
    private String gender = null;

    @JsonProperty("maritalStatus")
    private String maritalStatus = null;

    @JsonProperty("birthDate")
    private Timestamp birthDate = null;



}
