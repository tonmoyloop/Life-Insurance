package com.example.life_insurance;

public class MonitorCashFlowCls {
    private String dateRange;
    private String paymentType;
    private Float amount;

    public MonitorCashFlowCls(String dateRange, String paymentType, Float amount) {
        this.dateRange = dateRange;
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "MonitorCashFlowCls{" +
                "dateRange='" + dateRange + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
