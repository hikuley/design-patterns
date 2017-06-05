package com.hikuley.patterns.creational.abstractfactory;

/**
 * Created by hikuley on 5/18/2017.
 */
public abstract class CreditCardFactory {


    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }

    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);


}
