package com.example.life_insurance;

public class GenerateSummaryCls {
    private String reportingperiod;
    private Float revenue;
    private Float expense;
    private Float net;

    public GenerateSummaryCls(String reportingperiod, Float revenue, Float expense, Float net) {
        this.reportingperiod = reportingperiod;
        this.revenue = revenue;
        this.expense = expense;
        this.net = net;
    }

    public String getReportingperiod() {
        return reportingperiod;
    }

    public void setReportingperiod(String reportingperiod) {
        this.reportingperiod = reportingperiod;
    }

    public Float getRevenue() {
        return revenue;
    }

    public void setRevenue(Float revenue) {
        this.revenue = revenue;
    }

    public Float getExpense() {
        return expense;
    }

    public void setExpense(Float expense) {
        this.expense = expense;
    }

    public Float getNet() {
        return net;
    }

    public void setNet(Float net) {
        this.net = net;
    }

    @Override
    public String toString() {
        return "GenerateSummaryCls{" +
                "reportingperiod='" + reportingperiod + '\'' +
                ", revenue=" + revenue +
                ", expense=" + expense +
                ", net=" + net +
                '}';
    }
}
