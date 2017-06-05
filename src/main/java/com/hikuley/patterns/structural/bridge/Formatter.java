package com.hikuley.patterns.structural.bridge;

import java.util.List;

/**
 * Created by hikuley on 6/5/2017.
 */
public interface Formatter {

    String format(String header, List<Detail> details);

}
