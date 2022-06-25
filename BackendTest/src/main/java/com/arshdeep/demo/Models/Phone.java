package com.arshdeep.demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("contactMechId")
    private int contactMechId ;


    @JsonProperty("countryCode")
    private String countryCode = null;

    @JsonProperty("areaCode")
    private String areaCode = null;

    @JsonProperty("phone")
    private String phone = null;

    @JsonProperty("extension")
    private String extension = null;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "phone")
    private Person person;


}
