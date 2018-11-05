package com.example.asus.hairdresserapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HairSalonAdapter extends RecyclerView.Adapter<HairSalonAdapter.HairSalonHolder> {

    private List<HairSalon> salons = new ArrayList<>();

    @NonNull
    @Override
    public HairSalonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.salon_item, parent, false);
        return new HairSalonHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HairSalonHolder holder, int position) {
        HairSalon currentSalon = salons.get(position);
        holder.name.setText(currentSalon.getName());
    }

    @Override
    public int getItemCount() {
        return salons.size();
    }

    public void setSalons(List<HairSalon> salons) {
        this.salons = salons;
        notifyDataSetChanged();
    }

    class HairSalonHolder extends RecyclerView.ViewHolder {
       private TextView name;

        public HairSalonHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.hair_salon_name);
        }
    }
}
