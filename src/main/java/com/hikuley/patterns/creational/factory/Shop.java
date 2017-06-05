package com.hikuley.patterns.creational.factory;

/**
 * Created by hikuley on 5/18/2017.
 */
public class Shop extends Website {

    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
