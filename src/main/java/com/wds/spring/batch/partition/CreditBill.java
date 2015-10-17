package com.wds.spring.batch.partition;

/**
 * Created by wds on 2015/9/13.
 */
public class CreditBill {

    private String id;

    private String accountID = "";

    private String name = "";

    private double amount = 0;

    private String date;

    private String address;

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountId) {
        this.accountID = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
