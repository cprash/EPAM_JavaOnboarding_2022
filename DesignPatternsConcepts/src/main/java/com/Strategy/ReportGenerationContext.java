package com.Strategy;

public class ReportGenerationContext {
    private ReportGenerator reportGenerator;

    public void setReportGenerator(ReportGenerator reportGenerator){
     this.reportGenerator=reportGenerator;
    }
    public void generateRequiredReport()
    {
        reportGenerator.generateReport();
    }
}
