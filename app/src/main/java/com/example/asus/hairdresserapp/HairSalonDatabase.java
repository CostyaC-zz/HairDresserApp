package com.example.asus.hairdresserapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = HairSalon.class, version = 1)
public abstract class HairSalonDatabase extends RoomDatabase {

    private static HairSalonDatabase instance;

    public abstract IHairSalonDAO hairSalonDAO();

    public static synchronized HairSalonDatabase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), HairSalonDatabase.class, "hairSalon_database").fallbackToDestructiveMigration().build();
        }
        return instance;
    }
}
