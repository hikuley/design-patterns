package com.hikuley.patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hikuley on 5/18/2017.
 */
public abstract class Website {

    protected List<Page> pages = new ArrayList<Page>();

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }


}
