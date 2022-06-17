package com.arshdeep.demo.Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CVE_Items {


    private String publishedDate;

    @Autowired
    @JsonProperty("impact")
    private Impact impact;

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }



    public Impact getImpact() {

        return impact;
    }

    public void setImpact(Impact impact) {
        this.impact = impact;
    }
}
