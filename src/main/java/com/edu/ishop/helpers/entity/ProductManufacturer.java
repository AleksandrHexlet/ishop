package com.edu.ishop.helpers.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

@Entity
//@IdClass(ProductManufactureId.class)
public class ProductManufacturer {

//    @Id
    private String name;
    @Id
    private String userName;
    private LocalDate dateRegistration;
    private double rating;
    private BigDecimal traderBill;
    private int rate;


//    @Id
    private String cityStorage;
    private boolean isActive = true;

    public ProductManufacturer() {
    }

    public ProductManufacturer(String name, String userName, LocalDate dateRegistration,
                               double rating, BigDecimal traderBill, int rate, String cityStorage,
                               boolean isActive) {
        this.name = name;
        this.userName = userName;
        this.dateRegistration = dateRegistration;
        this.rating = rating;
        this.traderBill = traderBill;
        this.rate = rate;
        this.cityStorage = cityStorage;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return cityStorage;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getDateRegistration() {
        return dateRegistration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public BigDecimal getTraderBill() {
        return traderBill;
    }

    public void setTraderBill(BigDecimal traderBill) {
        this.traderBill = traderBill;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getCityStorage() {
        return cityStorage;
    }

    public void setCityStorage(String cityStorage) {
        this.cityStorage = cityStorage;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setDateRegistration(LocalDate dateRegistration) {
        this.dateRegistration = dateRegistration;
    }
}

