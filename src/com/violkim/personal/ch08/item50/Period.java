package com.violkim.personal.ch08.item50;

import java.util.Date;

public interface Period {
    Date start();
    Date end();
    default String format() { return String.format("Period[%s, %s]", start(), end()); }
}
