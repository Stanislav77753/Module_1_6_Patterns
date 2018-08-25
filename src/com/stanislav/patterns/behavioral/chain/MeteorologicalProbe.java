package com.stanislav.patterns.behavioral.chain;


public class MeteorologicalProbe {
    private int windStrength;


    public void measureStrengthWind(){
        windStrength = (0 + (int)(Math.random()*100));
    }

    public int getWindStrength() {
        return windStrength;
    }
}
