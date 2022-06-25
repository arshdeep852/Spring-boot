package com.arshdeep.demo.Controller;

import com.arshdeep.demo.Entities.Severity;
import com.arshdeep.demo.Models.Model;
import com.arshdeep.demo.Services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController("testAbc")
public class TestController {


    @Autowired
    private TestServices testServices;

    @Autowired
    private Model model;



    @PostMapping("/test")
    public List<Severity> createSeverity(@RequestBody Model model){
        List<Severity> severity = testServices.addSeverity(model);
        return severity;

    }


    @GetMapping("/test")
    public Map getSeverity(){
        Map severity = testServices.getSeverity();
        return severity;

    }

}
