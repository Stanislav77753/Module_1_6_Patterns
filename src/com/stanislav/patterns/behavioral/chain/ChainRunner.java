package com.stanislav.patterns.behavioral.chain;

public class ChainRunner {
    public static void main(String[] args) {
        MeteorologicalProbe meteorologicalProbe = new MeteorologicalProbe();
        Informer smsInformer = new SmsInformer(15);
        Informer tvInformer = new TvInformer(30);

        smsInformer.setNextInformer(tvInformer);
        int strength = 0;
        for(int i = 0; i < 24; i++){
            meteorologicalProbe.measureStrengthWind();
            strength = meteorologicalProbe.getWindStrength();
            smsInformer.notifyInformer("According to meteorological services,strength of wind is more "
                    + strength + " m/s.", strength );
            System.out.println("====================");
        }
    }
}
