package com.example.oop.basics.methods;

class Radio {
    int yearProducion;
    int volume;
    String station; // aktualna stacja radiowa

    Radio() {
        this.yearProducion = 2000;
        volume = 100; // to samo co this.volume = 100;
    }

    Radio(int yearProducion) {
        this();
        this.yearProducion = yearProducion;
        this.changeStation("Rock");
    }

    public void changeStation(String newStation) {
        this.station = newStation;
    }

    public Radio getRadio() {
        return this;
    }

    public void printRadioInfo(Radio radio) {
        System.out.println("Radio production year: " + radio.yearProducion);
    }
}

public class ThisUsage {
    public static void main(String[] args) {
        Radio oldRadio = new Radio(1996);
        Radio newRadio = new Radio(2010);

        newRadio.printRadioInfo(oldRadio);
    }
}
