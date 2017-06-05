package com.hikuley.patterns.creational.factory;

/**
 * Created by hikuley on 5/18/2017.
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }

}
