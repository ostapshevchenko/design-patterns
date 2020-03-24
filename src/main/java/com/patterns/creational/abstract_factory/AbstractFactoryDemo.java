package com.patterns.creational.abstract_factory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        CreditCardAbstractFactory abstractFactory = CreditCardAbstractFactory.getCreditCardAbstractFactory(700);
        CreditCard creditCard = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(creditCard.getClass());

    }
}
