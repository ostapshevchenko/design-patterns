package com.patterns.creational.abstract_factory;

public abstract class CreditCard {

    protected int cardNumber;
    protected int cscNumber;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
