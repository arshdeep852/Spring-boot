package com.arshdeep.demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Component
public class PostalAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private int id ;

    @JsonProperty("toName")
    private String toName = null;

    @JsonProperty("addressLine1")
    private String addressLine1 = null;
    @JsonProperty("addressLine2")
    private String addressLine2 = null;
    @JsonProperty("city")
    private String city = null;
    @JsonProperty("stateName")
    private String stateName = null;
    @JsonProperty("stateCode")
    private String stateCode = null;
    @JsonProperty("countryName")
    private String countryName = null;
    @JsonProperty("countryCode")
    private String countryCode = null;
    @JsonProperty("postalCode")
    private String postalCode = null;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
    private Person person;




}
