package model.area;

import model.user.President;

import java.util.Arrays;

public class Republic extends Area {

    private President president;
    private Region[] regions;

    public Republic(Integer id, String areaName, Double areaSize, Integer areaPopulation,
                    President president) {
        super(id, areaName, areaSize, areaPopulation);
        this.president = president;
//        this.regions = regions;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return showInfo();
    }

    private String showInfo() {
        return super.toString() + president;
    }


}
