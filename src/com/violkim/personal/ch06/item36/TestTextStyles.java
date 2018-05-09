package com.violkim.personal.ch06.item36;

import org.junit.Test;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;
import static com.violkim.personal.ch06.item36.Text.Style;

public class TestTextStyles {
    @Test
    public void testBits() {
        TextBits textStyles = new TextBits();
        textStyles.applyStyles(TextBits.STYLE_BOLD | TextBits.STYLE_UNDERLINE); // 001 or 100 = 101
        System.out.printf("Selected styles are %s\n", getStyles(textStyles.getStyles()));
    }

    private String getStyles(int styles) {
        Map<Integer, String> allStyles = new HashMap<>() {{
            put(TextBits.STYLE_BOLD, "STYLE_BOLD");
            put(TextBits.STYLE_ITALIC, "STYLE_ITALIC");
            put(TextBits.STYLE_STRIKETHROUGH, "STYLE_STRIKETHROUGH");
            put(TextBits.STYLE_UNDERLINE, "STYLE_UNDERLINE");
        }};

        return allStyles.entrySet().stream()
                .filter(e -> 0 != (styles & e.getKey()))
                .map(e -> e.getValue())
                .collect(joining(", "));
    }

    @Test
    public void testText() {
        Text textStyles = new Text();
        textStyles.applyStyles(EnumSet.of(Style.BOLD, Style.STRIKETHROUGH));
        System.out.printf("Selected styles are %s", textStyles.getStyles());
    }
}
