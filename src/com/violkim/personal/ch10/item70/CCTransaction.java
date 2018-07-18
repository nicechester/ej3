package com.violkim.personal.ch10.item70;

import org.junit.Test;

import java.math.BigDecimal;

public class CCTransaction {
    class InsufficientFundsException extends RuntimeException {
        private BigDecimal shortageAmount;
        public BigDecimal getShortageAmount() { return shortageAmount; }
        public InsufficientFundsException(BigDecimal shortageAmount) { this.shortageAmount = shortageAmount; }
    }

    private static final BigDecimal PRICE = new BigDecimal(13);
    private BigDecimal balance = new BigDecimal(100);

    @Test
    public void shopping() {
        while(true) {
            try {
                order();
            } catch(InsufficientFundsException ife) {
                System.out.println("You need $" + ife.getShortageAmount() + " more!");
                break;
            }
        }
    }

    private BigDecimal order() {
        if (balance.subtract(PRICE).compareTo(BigDecimal.ZERO)<=0) {
            throw new InsufficientFundsException(PRICE.subtract(balance));
        }
        balance = balance.subtract(PRICE);
        return balance;
    }
}
