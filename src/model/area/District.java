package model.area;

import model.user.Khokim;

public class District extends Area {

   private Khokim districtKhokim;

    public District(Integer id, String areaName, Double areaSize, Integer areaPopulation, Khokim districtKhokim) {
        super(id, areaName, areaSize, areaPopulation);
        this.districtKhokim = districtKhokim;
    }

    public Khokim getDistrictKhokim() {
        return districtKhokim;
    }

    public void setDistrictKhokim(Khokim districtKhokim) {
        this.districtKhokim = districtKhokim;
    }

    @Override
    public String toString() {
        return super.toString() + districtKhokim + "\n";
    }
}
