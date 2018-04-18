package com.violkim.personal.ch06.item36;

import java.util.Collections;
import java.util.Set;

// EnumSet - a modern replacement for bit fields
public class Text {
    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    private Set<Style> styles = Collections.emptySet();
    public Set<Style> getStyles() { return styles; }

    // Any Set could be passed in, but EnumSet is clearly best
    public void applyStyles(Set<Style> styles) { this.styles = styles; }

}