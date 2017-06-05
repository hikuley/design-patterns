package com.hikuley.patterns.creational.factory;

/**
 * Created by hikuley on 5/18/2017.
 */

public class Blog extends Website {


    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }


}
