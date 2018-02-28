package com.violkim.personal.ch04.item16;

import java.awt.*;

public class Point {
    private double x, y;
    /* package private */ ColorCodes rgb;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public String getRgb() { return String.format("%d-%d-%d", rgb.r, rgb.g, rgb.b); }

    // Remove following mutators to make this immutable
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setRgb(int r, int g, int b) {
        ColorCodes cc = new ColorCodes();
        cc.r = r;
        cc.g = g;
        cc.b = b;
        this.rgb = cc;
    }

    /* package private */ static class ColorCodes {
        public int r, g, b;
    }
}
