package com.violkim.personal.ch09.item60;

import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalForMoney {
    @Test
    public void bigDecimalForMoney() {
        final BigDecimal TEN_CENTS = new BigDecimal(".10");
        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            System.out.println("price is $" + price);
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
    }
}
