package com.hikuley.patterns.creational.abstractfactory;

/**
 * Created by hikuley on 5/22/2017.
 */
public class AmexFactory extends CreditCardFactory {

    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType){
            case GOLD:

                return new AmexGoldCreditCard();

            case PLATINUM:

                return new AmexPlatinumCreditCard();
        }

        return null;
    }

    public Validator getValidator(CardType cardType) {

        switch (cardType){
            case GOLD:

                return new AmexGoldValidator();

            case PLATINUM:

                return new AmexGoldValidator();
        }

        return null;
    }
}
