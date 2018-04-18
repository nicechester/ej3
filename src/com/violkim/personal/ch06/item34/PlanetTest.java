package com.violkim.personal.ch06.item34;

import org.junit.Test;

import static com.violkim.personal.ch06.item34.Planet.MARS;

public class PlanetTest {
    @Test
    public void testPlanet() {
        Planet p = MARS;
        for (Planet pp: Planet.values()) {
            System.out.printf("%s %s %s\n", pp, p==pp ? "is" : "is not", p);
            System.out.printf("name=%s, mass=%e, radius=%e, surfaceGravity=%f, surfaceWeight(10)=%f\n",
                    pp, pp.mass(), pp.radius(), pp.surfaceGravity(), pp.surfaceWeight(10));
        }
    }

    @Test
    public void convertEarthWeight() {
        double earthWeight = 70.0;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
    }
}