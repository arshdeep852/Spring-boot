package com.arshdeep.demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Impact {


    @JsonProperty("baseMetricV2")
    private BaseMetricV2 baseMetricV2;

    public BaseMetricV2 getBaseMetricV2() {
        return baseMetricV2;
    }


    public void setBaseMetricV2(BaseMetricV2 baseMetricV2) {
        this.baseMetricV2 = baseMetricV2;
    }

}
