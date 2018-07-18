package com.violkim.personal.ch09.item60;

import org.junit.Test;

public class FloatAndDouble {
    @Test
    public void representMoneyWithFloat() {
        System.out.println(1.03 - 0.42); // $0.61
        System.out.println(1.00 - 9 * 0.10); // $0.10
    }

    @Test
    public void monetaryCalc() {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            System.out.println("price is $" + price);
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }
}
