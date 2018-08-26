package com.stanislav.patterns.behavioral.state;

public class Radio {
    Station station;
    public void setStation(Station station){
        this.station = station;
    }

    public void nextStation(){
        if(station instanceof RadioOne){
            setStation(new RadioTwo());
        }else if(station instanceof RadioTwo){
            setStation(new RadioThree());
        } else if (station instanceof RadioThree) {
            setStation(new RadioOne());
        }
    }

    public void playRadio(){
        station.play();
    }
}
