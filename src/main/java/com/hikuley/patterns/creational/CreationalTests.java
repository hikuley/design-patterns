package com.hikuley.patterns.creational;


import com.hikuley.patterns.creational.abstractfactory.CardType;
import com.hikuley.patterns.creational.abstractfactory.CreditCard;
import com.hikuley.patterns.creational.abstractfactory.CreditCardFactory;
import com.hikuley.patterns.creational.builder.LaunchOrder;
import com.hikuley.patterns.creational.factory.WebsiteFactory;
import com.hikuley.patterns.creational.factory.Website;
import com.hikuley.patterns.creational.factory.WebsiteType;
import com.hikuley.patterns.creational.prototype.Movie;
import com.hikuley.patterns.creational.prototype.Registry;
import org.junit.Test;

/**
 * Created by hikuley on 5/16/2017.
 */

public class CreationalTests {

    @Test
    public void builderPatternTest() {

        LaunchOrder.Builder builder = new LaunchOrder.Builder();
        builder
                .bread("Haşhaşlı ekmek")
                .condiments("tereyağlı salça")
                .dressing("köfte")
                .meat("eşşek eti");

        LaunchOrder launchOrder = builder.build();

        System.out.println(launchOrder.getBread());
        System.out.println(launchOrder.getCondiments());
        System.out.println(launchOrder.getDressing());
        System.out.println(launchOrder.getMeat());

    }

    @Test
    public void prototypePatternTest() {
        // when to use copy unique instance,
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());


        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
    }


    @Test
    public void factoryPatternTest() {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog.getPages());


        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shop.getPages());
    }


    @Test
    public void abstractFactoryDemo() {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard creditCard1 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(creditCard1);

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard creditCard2 = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(creditCard2);
    }

}
