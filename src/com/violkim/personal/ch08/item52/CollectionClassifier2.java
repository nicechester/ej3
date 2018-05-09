package com.violkim.personal.ch08.item52;

import org.junit.Test;

import java.math.BigInteger;
import java.util.*;

public class CollectionClassifier2 {
    public static String classify(Collection<?> c) {
        return c instanceof Set ? "Set" :
                c instanceof List ? "List" : "Unknown Collection";
    }

    @Test
    public void testClassify() {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections)
            System.out.println(classify(c));
    }

}
