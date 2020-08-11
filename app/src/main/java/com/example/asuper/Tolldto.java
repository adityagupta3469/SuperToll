package com.example.asuper;

import com.google.android.gms.maps.model.LatLng;

public class Tolldto {
    int toll_id;
    String toll_name;
    LatLng tollcoordinates;
    double tollrates;

    public int getToll_id() {
        return toll_id;
    }

    public void setToll_id(int toll_id) {
        this.toll_id = toll_id;
    }

    public String getToll_name() {
        return toll_name;
    }

    public void setToll_name(String toll_name) {
        this.toll_name = toll_name;
    }

    public LatLng getTollcoordinates() {
        return tollcoordinates;
    }

    public void setTollcoordinates(LatLng tollcoordinates) {
        this.tollcoordinates = tollcoordinates;
    }

    public double getTollrates() {
        return tollrates;
    }

    public void setTollrates(double tollrates) {
        this.tollrates = tollrates;
    }
}
