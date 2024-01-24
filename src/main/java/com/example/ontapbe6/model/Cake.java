package com.example.ontapbe6.model;

public class Cake {
    private int id;
    private String detail;
    private double price;
    private String type;
    private boolean status;


    public Cake() {
    }

    public Cake(int id, String detail, double price, String type, boolean status) {
        this.id = id;
        this.detail = detail;
        this.price = price;
        this.type = type;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
