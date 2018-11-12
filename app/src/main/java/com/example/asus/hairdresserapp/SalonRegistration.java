package com.example.asus.hairdresserapp;

import java.util.ArrayList;
import java.util.List;

public class SalonRegistration {

    private ArrayList<HairSalon> salonss;
    private HairSalonViewModel viewModel;

    public SalonRegistration() {

        this.salonss = new ArrayList<>();

    }

    public ArrayList<HairSalon> getSalons() {

        return salonss;
    }

    public HairSalon[] getAllSalons() {

        return salonss.toArray(new HairSalon[salonss.size()]);

    }

    public void addSalons(HairSalon salon) {

        viewModel.insert(salon);


    }


}
