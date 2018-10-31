package com.example.asus.hairdresserapp;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface IHairSalonDAO {

    @Insert
    void insert(HairSalon hairSalon);
    @Update
    void update(HairSalon hairSalon);
    @Delete
    void delete(HairSalon hairSalon);
    @Query("SELECT * FROM hairSalon_table")
    LiveData<List<HairSalon>> getAllHairSalons();

}
