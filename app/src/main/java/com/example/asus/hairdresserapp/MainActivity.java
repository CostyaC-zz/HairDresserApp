package com.example.asus.hairdresserapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private HairSalonViewModel hairSalonViewModel;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);

        hairSalonViewModel = ViewModelProviders.of(this).get(HairSalonViewModel.class);
        hairSalonViewModel.insert(new HairSalon("name", "aa", "yes", "no", "niesu", "da"));
        hairSalonViewModel.getSalons().observe(this, new Observer<List<HairSalon>>() {
            @Override
            public void onChanged(List<HairSalon> hairSalons) {
                //update recycler view

                text.setText(hairSalonViewModel.getSalons().getValue().get(0).toString());
            }
        });
    }
}
