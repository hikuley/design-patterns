package com.hikuley.patterns.structural.bridge.shape2_withBridge;

/**
 * Created by hikuley on 6/5/2017.
 */

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();

}
