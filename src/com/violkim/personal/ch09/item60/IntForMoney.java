package com.violkim.personal.ch09.item60;

import org.junit.Test;

public class IntForMoney {
    @Test
    public void useIntForMoneyCalc() {
        int itemsBought = 0;
        int funds = 100;
        for (int price = 10; funds >= price; price += 10) {
            System.out.println("price: " + money(price));
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Cash left over: " + funds + " cents");
        System.out.printf("Cash left over: %s\n", money(funds));
    }

    private String money(int i) { return String.format("$%d.%d", i/100, i%100); }
}
