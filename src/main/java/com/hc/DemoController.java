package com.hc;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ServletComponentScan
public class DemoController {
    @RequestMapping("/fun")
    public void fun(){
        System.out.println("fun");
    }
}
