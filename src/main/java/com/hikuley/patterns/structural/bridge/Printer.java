package com.hikuley.patterns.structural.bridge;

import java.util.List;

/**
 * Created by hikuley on 6/5/2017.
 */
public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract String getHeader();

    protected abstract List<Detail> getDetails();

}
