package com.patterns.creational.abstract_factory;

import com.patterns.creational.abstract_factory.amex.AmexFactory;
import com.patterns.creational.abstract_factory.validator.Validator;
import com.patterns.creational.abstract_factory.visa.VisaFactory;

public abstract class CreditCardAbstractFactory {

    public static CreditCardAbstractFactory getCreditCardAbstractFactory(int creditScore) {

        if(creditScore < 650)
            return new AmexFactory();
        else
            return new VisaFactory();
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
