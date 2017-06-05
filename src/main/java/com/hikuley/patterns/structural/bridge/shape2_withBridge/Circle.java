package com.hikuley.patterns.structural.bridge.shape2_withBridge;

/**
 * Created by hikuley on 6/5/2017.
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    public void applyColor() {
        color.applyingColor();
    }
}
