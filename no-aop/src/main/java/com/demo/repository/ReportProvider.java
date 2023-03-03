package com.demo.repository;

import com.demo.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportProvider {
    public Report reportProvide(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            //e.getMessage();
            throw new RuntimeException();
        }


        System.out.println("Report Provider provider.");
        return new Report();
    }
}
