package com.demo.format;

import com.demo.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportFormatter {
    public Report formatReport(Report report){
        System.out.println(report.getClass().getSimpleName() + " formatted.");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.getMessage();
        }
        return report;
    }


}
