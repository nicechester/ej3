package com.violkim.personal.ch06.item34;

import org.junit.Test;

import static org.junit.Assert.*;

public class PayrollDayTest {
    @Test
    public void payrollDay1Test() {
        PayrollDay1[] xins = { PayrollDay1.MONDAY, PayrollDay1.TUESDAY, PayrollDay1.SATURDAY };
        int pay = 0;
        for (PayrollDay1 payrollDay: xins) {
            pay += payrollDay.pay(600, 11);
        }
        System.out.printf("Payment to Xin is %s", pay);
    }

    @Test
    public void payrollDay2Test() {
        PayrollDay2[] marks = { PayrollDay2.WEDNESDAY, PayrollDay2.THURSDAY, PayrollDay2.FRIDAY, PayrollDay2.SATURDAY };
        int pay = 0;
        for (PayrollDay2 payrollDay: marks) {
            pay += payrollDay.pay(50, 9);
        }
        System.out.printf("Payment to Mark is %s", pay);
    }

}