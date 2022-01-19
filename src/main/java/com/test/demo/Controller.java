package com.test.demo;

import com.test.demo.service.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private SandwichService sw;

    /*
    @RequestMapping(value="/BLT")
    public String broodjeBLT(){
        int kCal = sw.computeKcal("BLT");
        return "The amount of kCal in a BLT is "+ kCal;
    }
    @RequestMapping(value="/CLUB")
    public String broodjeCLUB(){
        int kCal = sw.computeKcal("CLUB");
        return "The amount of kCal in a CLUB is "+ kCal;
    }     */

    //met path variable een broodje bepalen, let op inversion of control bijhouden geen nieuwe component (new) maken
    @GetMapping("{sandwichName}")
    public String sandwichPathVariable(@PathVariable String sandwichName){
        int kCal = sw.computeKcal(sandwichName);
        return "The amount of kCal in a "+ sandwichName + "is "+ kCal;
    }

    // tijd voor verandering
}

