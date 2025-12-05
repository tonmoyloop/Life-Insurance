package com.example.life_insurance;

import java.time.LocalDate;

public class RegisterContractsCls {
    private String companyName;
    private Float amount;
    private LocalDate startDate;
    private LocalDate endDate;

    public RegisterContractsCls(String companyName, Float amount, LocalDate startDate, LocalDate endDate) {
        this.companyName = companyName;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "RegisterContractsCls{" +
                "companyName='" + companyName + '\'' +
                ", amount=" + amount +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
