package com.violkim.personal.ch01.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesWithCatch {
    // try-with-resources with a catch clause
    public String firstLineOfFile(String path, String defaultVal) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }
}
