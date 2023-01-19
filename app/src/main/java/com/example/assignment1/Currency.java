package com.example.assignment1;

public class Currency {

    private float currency;
    private  float Egyptian_Pound;

    public float getEgyptian_Pound() {
        return Egyptian_Pound;
    }

    public void setEgyptian_Pound(float egyptian_Pound) {
        Egyptian_Pound = egyptian_Pound;
    }

    public float getCurrency() {
        return currency;
    }

    public void setCurrency(float currency) {
        this.currency = currency;
    }

    public  float To_Currency(){
        return Egyptian_Pound/currency;
    }
    public  float To_EGP(){
        return Egyptian_Pound*currency;
    }
}
