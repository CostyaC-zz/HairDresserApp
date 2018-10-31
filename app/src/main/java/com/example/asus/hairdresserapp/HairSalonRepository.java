package com.example.asus.hairdresserapp;

import android.app.Application;
import android.os.AsyncTask;

import java.util.List;

import androidx.lifecycle.LiveData;

public class HairSalonRepository {

    private IHairSalonDAO hairSalonDAO;
    private LiveData<List<HairSalon>> salons;

    public HairSalonRepository(Application application){
        HairSalonDatabase database = HairSalonDatabase.getInstance(application);
        hairSalonDAO = database.hairSalonDAO();
        salons = hairSalonDAO.getAllHairSalons();
    }

    public void insert(HairSalon hairSalon){
        new InsertHairSalonAsynkTask(hairSalonDAO).execute(hairSalon);
    }

    public void update(HairSalon hairSalon){
        new UpdateHairSalonAsynkTask(hairSalonDAO).execute(hairSalon);
    }

    public void delete(HairSalon hairSalon){
        new DeleteHairSalonAsynkTask(hairSalonDAO).execute(hairSalon);
    }

    public LiveData<List<HairSalon>> getSalons() {
        return salons;
    }

    private static class InsertHairSalonAsynkTask extends AsyncTask<HairSalon, Void, Void> {
        private  IHairSalonDAO iHairSalonDAO;

        private InsertHairSalonAsynkTask(IHairSalonDAO iHairSalonDAO){
            this.iHairSalonDAO = iHairSalonDAO;
        }

        @Override
        protected Void doInBackground(HairSalon... hairSalons) {
            iHairSalonDAO.insert(hairSalons[0]);
            return null;
        }
    }

    private static class UpdateHairSalonAsynkTask extends AsyncTask<HairSalon, Void, Void> {
        private  IHairSalonDAO iHairSalonDAO;

        private UpdateHairSalonAsynkTask(IHairSalonDAO iHairSalonDAO){
            this.iHairSalonDAO = iHairSalonDAO;
        }

        @Override
        protected Void doInBackground(HairSalon... hairSalons) {
            iHairSalonDAO.update(hairSalons[0]);
            return null;
        }
    }

    private static class DeleteHairSalonAsynkTask extends AsyncTask<HairSalon, Void, Void> {
        private  IHairSalonDAO iHairSalonDAO;

        private DeleteHairSalonAsynkTask(IHairSalonDAO iHairSalonDAO){
            this.iHairSalonDAO = iHairSalonDAO;
        }

        @Override
        protected Void doInBackground(HairSalon... hairSalons) {
            iHairSalonDAO.delete(hairSalons[0]);
            return null;
        }
    }
}
