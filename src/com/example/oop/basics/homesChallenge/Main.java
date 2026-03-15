package com.example.oop.basics.homesChallenge;

class Flat {
    protected String city;
    protected String street;

    public Flat() {
    }

    public Flat(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

class House extends Flat {
    protected float parcelSize;

    public House(String city, String street, float parcelSize) {
        super(city, street);
        this.parcelSize = parcelSize;
    }

    public float getParcelSize() {
        return parcelSize;
    }

    public void setParcelSize(float parcelSize) {
        this.parcelSize = parcelSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "parcelSize=" + parcelSize +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

class Residence extends House {
    protected float garageSize;

    public Residence(String city, String street, float parcelSize, float garageSize) {
        super(city, street, parcelSize);
        this.garageSize = garageSize;
    }

    public float getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(float garageSize) {
        this.garageSize = garageSize;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "garageSize=" + garageSize +
                ", parcelSize=" + parcelSize +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Flat[] homes = new Flat[10];
        for (int i = 0; i < homes.length; i++) {
            int randNumber = (int) Math.floor(Math.random() * 3);
            if (randNumber == 0) {
                homes[i] = new Flat("Łódź", "Pomorska");
            }
            if (randNumber == 1) {
                homes[i] = new House("Warszawa", "Zielona", 35.0f);
            }
            if (randNumber == 2) {
                homes[i] = new Residence("Łódź", "Piotrkowska", 30.0f, 5.0f);
            }
        }
        for (int i = 0; i < homes.length; i++) {
            System.out.println("Home i: " + i);
            Flat home = homes[i];
            if (home instanceof Residence) {
                Residence residence = (Residence) home;
                System.out.println("Residence garage size: " + residence.getGarageSize());;
                residence.toString();
            } else if (home instanceof House) {
                House house = (House) home;
                System.out.println("House parcelSize: " + house.getParcelSize());
                house.toString();
            } else {
                System.out.println(home.toString());
            }
        }
        Flat flat = new Flat();
        flat.toString();
    }
}
