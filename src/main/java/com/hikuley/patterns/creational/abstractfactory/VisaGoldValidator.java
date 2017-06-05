package com.hikuley.patterns.creational.abstractfactory;

/**
 * Created by hikuley on 5/22/2017.
 */

public class VisaGoldValidator implements Validator {

    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
