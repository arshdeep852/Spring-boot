package com.arshdeep.demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class BaseMetricV2 {

    @JsonProperty("severity")
    private String severity;

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }


}
