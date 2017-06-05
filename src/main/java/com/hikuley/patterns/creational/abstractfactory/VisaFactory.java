package com.hikuley.patterns.creational.abstractfactory;

/**
 * Created by hikuley on 5/22/2017.
 */
public class VisaFactory extends CreditCardFactory {

    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType){
            case GOLD:

                return new VisaGoldCreditCard();

            case PLATINUM:

                return new VisaPlatinumCreditCard();

        }

        return null;
    }

    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLD:

                return new VisaValidator();

            case PLATINUM:

                return new VisaPlatinumValidator();
        }

        return new VisaValidator();
    }

}
