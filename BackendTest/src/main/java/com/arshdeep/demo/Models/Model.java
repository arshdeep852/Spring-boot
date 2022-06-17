package com.arshdeep.demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class Model {

    @Autowired
    @JsonProperty("CVE_Items")
    private List<CVE_Items> cve_items;

    public List<CVE_Items> getCve_items() {
        return cve_items;
    }

    public void setCve_items(List<CVE_Items> cve_items) {
        this.cve_items = cve_items;
    }


    public Model() {
    }
}
