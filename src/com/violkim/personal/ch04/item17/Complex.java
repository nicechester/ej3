package com.violkim.personal.ch04.item17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class Complex {
    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);

    private final double re;
    private final double im;

//    public Complex(double re, double im) {
//        this.re = re;
//        this.im = im;
//    }

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        if (re==0 && im==0)
            return ZERO;
        return new Complex(re, im);
    }

    public double realPart() { return re; }
    public double imaginaryPart() { return im; }

    public Complex plus(Complex c) { return new Complex(re + c.re, im + c.im); }
    public Complex minus(Complex c) { return new Complex(re - c.re, im - c.im); }
    public Complex times(Complex c) { return new Complex(re * c.re - im * c.im, re * c.im + im * c.re); }
    public Complex dividedBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Complex)) return false;

        Complex c = (Complex) o;
        // See page 47 to find out why we use compare instead of ==
        return Double.compare(c.re, this.re) == 0 && Double.compare(c.im, this.im) == 0;
    }

    @Override public int hashCode() { return 31 * Double.hashCode(re) + Double.hashCode(im); }
    @Override public String toString() { return "(" + re + " + " + im + "i)"; }
}
