package com.patterns.creational.abstract_factory.visa;

import com.patterns.creational.abstract_factory.CardType;
import com.patterns.creational.abstract_factory.CreditCard;
import com.patterns.creational.abstract_factory.CreditCardAbstractFactory;
import com.patterns.creational.abstract_factory.validator.Validator;
import com.patterns.creational.abstract_factory.validator.VisaValidator;

public class VisaFactory extends CreditCardAbstractFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD: return new VisaGoldCreditCard();
            case PLATINUM: return new VisaBlackCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
