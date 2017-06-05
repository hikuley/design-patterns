package com.hikuley.patterns.structural.bridge;

import java.util.List;

/**
 * Created by hikuley on 6/5/2017.
 */
public class PrintFormatter implements Formatter {

    public String format(String header, List<Detail> details) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(header);
        stringBuilder.append("\n");

        for (Detail detail : details) {
            stringBuilder.append(detail.getLabel());
            stringBuilder.append(":");
            stringBuilder.append(detail.getValue());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
