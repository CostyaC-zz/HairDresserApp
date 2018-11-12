package com.example.asus.hairdresserapp;

import java.util.ArrayList;
import java.util.List;

public class SalonRegistration {

    private ArrayList<HairSalon> salons;
    private HairSalonViewModel viewModel;

    public SalonRegistration() {

        this.salons = new ArrayList<>();

    }

    public ArrayList<HairSalon> getSalons() {

        return salons;
    }

    public HairSalon[] getAllSalons() {

        return salons.toArray(new HairSalon[salons.size()]);

    }

    public void addSalons(HairSalon salon) {

        viewModel.insert(salon);


    }


}
