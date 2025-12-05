package com.example.life_insurance;

import java.io.Serializable;
import java.time.LocalDate;

public class RecordDailyTransactionsCls implements Serializable {
    private String policyholdername;
    private Float amount;
    private LocalDate paymentdate;
    private String status;

    public RecordDailyTransactionsCls(String policyholdername, Float amount, LocalDate paymentdate, String status) {
        this.policyholdername = policyholdername;
        this.amount = amount;
        this.paymentdate = paymentdate;
        this.status = status;
    }

    public String getPolicyholdername() {
        return policyholdername;
    }

    public void setPolicyholdername(String policyholdername) {
        this.policyholdername = policyholdername;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(LocalDate paymentdate) {
        this.paymentdate = paymentdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RecordDailyTransactions{" +
                "policyholdername='" + policyholdername + '\'' +
                ", amount=" + amount +
                ", paymentdate=" + paymentdate +
                ", status='" + status + '\'' +
                '}';
    }
}
