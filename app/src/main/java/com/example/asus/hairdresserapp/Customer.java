package com.example.asus.hairdresserapp;

public class Customer {

    private String name;
    private String address;
    private String race;

    public Customer(String name,String address, String race)
    {
        this.name = name;
        this.address = address;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
