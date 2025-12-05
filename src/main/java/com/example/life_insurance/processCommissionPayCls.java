package com.example.life_insurance;

public class processCommissionPayCls {
    private Float salesData;
    private String agentName;
    private Float commissionAmount;
    private String status;

    public processCommissionPayCls(Float salesData, String agentName, Float commissionAmount, String status) {
        this.salesData = salesData;
        this.agentName = agentName;
        this.commissionAmount = commissionAmount;
        this.status = status;
    }

    public Float getSalesData() {
        return salesData;
    }

    public void setSalesData(Float salesData) {
        this.salesData = salesData;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Float getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Float commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "processCommissionPayCls{" +
                "salesData=" + salesData +
                ", agentName='" + agentName + '\'' +
                ", commissionAmount=" + commissionAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
