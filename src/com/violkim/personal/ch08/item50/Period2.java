package com.violkim.personal.ch08.item50;

import java.util.Date;

/**
 * True immutable by defensive copy
 */
public class Period2 implements Period {
    private final Date start;
    private final Date end;

    /**
     * @param  start the beginning of the period
     * @param  end the end of the period; must not precede start
     * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */

    public Period2(Date start, Date end) {
        // Make definsive copy
        this.start = new Date(start.getTime());
        this.end   = new Date(end.getTime());

        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(
                    this.start + " after " + this.end);
    }

    public Date start() { return start; }
    public Date end() { return end; }
}
