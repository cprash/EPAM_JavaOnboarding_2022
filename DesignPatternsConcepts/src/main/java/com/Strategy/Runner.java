package com.Strategy;

public class Runner {
    public static void main(String[] args) {
        ReportGenerationContext reportGenerationContext=new ReportGenerationContext();
        reportGenerationContext.setReportGenerator(new HTMLReportGenerater());
        reportGenerationContext.generateRequiredReport();
        reportGenerationContext.setReportGenerator(new XMLReportGenerater());
        reportGenerationContext.generateRequiredReport();
    }
}
