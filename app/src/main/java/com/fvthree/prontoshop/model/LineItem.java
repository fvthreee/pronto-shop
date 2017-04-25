package com.fvthree.prontoshop.model;

/**
 * Created by TELCOM03 on 4/25/2017.
 */

public class LineItem extends Product {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private double getSumPrice(){
        return getSalePrice() * quantity;
    }
}
