package com.vivanchenko.heroku.dto;

public class StatementItem {
    private String id;
    private Integer time;
    private String description;
    private Integer mcc;
    private Integer originalMcc;
    private Boolean hold;
    private Integer amount;
    private Integer operationAmount;
    private String commissionRate;
    private  Integer cashbackAmount;
    private Integer balance;
    private String comment;
    private String receiptId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMcc() {
        return mcc;
    }

    public void setMcc(Integer mcc) {
        this.mcc = mcc;
    }

    public Integer getOriginalMcc() {
        return originalMcc;
    }

    public void setOriginalMcc(Integer originalMcc) {
        this.originalMcc = originalMcc;
    }

    public Boolean getHold() {
        return hold;
    }

    public void setHold(Boolean hold) {
        this.hold = hold;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getOperationAmount() {
        return operationAmount;
    }

    public void setOperationAmount(Integer operationAmount) {
        this.operationAmount = operationAmount;
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getCashbackAmount() {
        return cashbackAmount;
    }

    public void setCashbackAmount(Integer cashbackAmount) {
        this.cashbackAmount = cashbackAmount;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
}
