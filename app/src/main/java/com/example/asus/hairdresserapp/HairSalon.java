package com.example.asus.hairdresserapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "hairSalon_table")
public class HairSalon {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;
    private String address;
    private String parking;
    private String wifi;
    private String prices;
    private String openingHours;

    public HairSalon(String name, String address, String parking, String wifi, String prices, String openingHours) {
        this.name = name;
        this.address = address;
        this.parking = parking;
        this.wifi = wifi;
        this.prices = prices;
        this.openingHours = openingHours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getParking() {
        return parking;
    }

    public String getWifi() {
        return wifi;
    }

    public String getPrices() {
        return prices;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return name;
    }
}
