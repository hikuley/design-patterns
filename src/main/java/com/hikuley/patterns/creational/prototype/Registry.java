package com.hikuley.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hikuley on 5/17/2017.
 */

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item= (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {

        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(12.00);
        movie.setRuntime("2 Hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Benim Adım Kırmızı");
        book.setPrice(25.25);
        book.setNumberOfPages(456);
        items.put("Book", book);
    }

}
