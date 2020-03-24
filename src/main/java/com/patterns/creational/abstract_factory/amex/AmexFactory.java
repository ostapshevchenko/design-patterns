package com.patterns.creational.abstract_factory.amex;

import com.patterns.creational.abstract_factory.*;
import com.patterns.creational.abstract_factory.validator.Validator;

public class AmexFactory extends CreditCardAbstractFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD: return new AmexGoldCreditCard();
            case PLATINUM: return new AmexBlackCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
