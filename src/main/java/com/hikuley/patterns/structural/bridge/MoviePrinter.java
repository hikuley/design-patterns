package com.hikuley.patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hikuley on 6/5/2017.
 */
public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("RunTime", movie.getRuntime()));
        return details;
    }

    protected String getHeader() {
        return movie.getClassification();
    }
}
