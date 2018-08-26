package com.stanislav.patterns.behavioral.state;

public class StateRunner {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setStation(new RadioOne());
        for(int i = 0; i < 5; i++){
            radio.playRadio();
            radio.nextStation();
        }
    }
}
