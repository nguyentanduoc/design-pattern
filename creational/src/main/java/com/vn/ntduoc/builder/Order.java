package com.vn.ntduoc.builder;

public class Order {

    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
        this.orderType = orderType;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public void setSauceType(SauceType sauceType) {
        this.sauceType = sauceType;
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public void setVegetableType(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
    }
}

enum BreadType {
    SIMPLE, OMELETTE, FRIED_EGG, GRILLED_FISH, PORK, BEEF,
}

enum OrderType {
    ON_SITE, TAKE_AWAY;
}

enum SauceType {
    SOY_SAUCE, FISH_SAUCE, OLIVE_OIL, KETCHUP, MUSTARD;
}

enum VegetableType {
    SALAD, CUCUMBER, TOMATO
}

