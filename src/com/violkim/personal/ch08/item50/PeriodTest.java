package com.violkim.personal.ch08.item50;

import org.junit.Test;

import java.util.Date;

public class PeriodTest {
    @Test
    public void testPeriod1() {
        System.out.println("Period1 test =================");
        Date start = new Date();
        Date end = new Date();
        Period p = new Period1(start, end);
        System.out.println(p.format());
        end.setYear(78);
        System.out.println(p.format());
    }

    @Test
    public void testPeriod2() {
        System.out.println("Period2 test =================");
        Date start = new Date();
        Date end = new Date();
        Period p = new Period2(start, end);
        System.out.println(p.format());
        end.setYear(78);
        System.out.println(p.format());
        p.end().setYear(77);
        System.out.println(p.format());
    }

    @Test
    public void testPeriod3() {
        System.out.println("Period3 test =================");
        Date start = new Date();
        Date end = new Date();
        Period p = new Period3(start, end);
        System.out.println(p.format());
        end.setYear(78);
        System.out.println(p.format());
        p.end().setYear(77);
        System.out.println(p.format());
    }

}
