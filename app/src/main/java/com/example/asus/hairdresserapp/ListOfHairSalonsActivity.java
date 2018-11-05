package com.example.asus.hairdresserapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class ListOfHairSalonsActivity extends AppCompatActivity {

    private HairSalonViewModel hairSalonViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_hair_salons);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        final HairSalonAdapter adapter = new HairSalonAdapter();
        recyclerView.setAdapter(adapter);

        hairSalonViewModel = ViewModelProviders.of(this).get(HairSalonViewModel.class);
        hairSalonViewModel.insert(new HairSalon("name3", "aa", "yes", "no", "niesu", "da"));
        hairSalonViewModel.getSalons().observe(this, new Observer<List<HairSalon>>() {
            @Override
            public void onChanged(List<HairSalon> hairSalons) {
                adapter.setSalons(hairSalons);
            }
        });
    }
}
