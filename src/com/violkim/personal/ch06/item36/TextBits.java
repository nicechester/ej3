package com.violkim.personal.ch06.item36;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public class TextBits {
    public static final int STYLE_BOLD          = 0b0001;  // 1
    public static final int STYLE_ITALIC        = 0b0010;  // 2
    public static final int STYLE_UNDERLINE     = 0b0100;  // 4
    public static final int STYLE_STRIKETHROUGH = 0b1000;  // 8

    private int styles;

    public int getStyles() { return this.styles; }

    // Parameter is bitwise OR of zero or more STYLE_ constants
    public void applyStyles(int styles) {  this.styles = styles; }
}
