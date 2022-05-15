package model.area;

import model.user.Khokim;

import java.util.Arrays;

public class Region extends Area {

    Khokim regionKhokim;
    private District[] districts;

    public Region(Integer id, String areaName, Double areaSize, Integer areaPopulation, Khokim regionKhokim, District[] districts) {
        super(id, areaName, areaSize, areaPopulation);
        this.regionKhokim = regionKhokim;
        this.districts = districts;
    }

    public Khokim getRegionKhokim() {
        return regionKhokim;
    }

    public void setRegionKhokim(Khokim regionKhokim) {
        this.regionKhokim = regionKhokim;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return super.toString()  + regionKhokim + "\n";
    }
}
