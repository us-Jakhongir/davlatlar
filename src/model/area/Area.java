package model.area;

public class Area {
    private Integer id;
    private String areaName;
    private Double areaSize;
    private Integer areaPopulation;

    public Area(Integer id, String areaName, Double areaSize, Integer areaPopulation) {
        this.id = id;
        this.areaName = areaName;
        this.areaSize = areaSize;
        this.areaPopulation = areaPopulation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Double getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(Double areaSize) {
        this.areaSize = areaSize;
    }

    public Integer getAreaPopulation() {
        return areaPopulation;
    }

    public void setAreaPopulation(Integer areaPopulation) {
        this.areaPopulation = areaPopulation;
    }

    @Override
    public String toString() {
        return showInfo();
    }

    private String showInfo() {
        System.out.println("Ma'lumotlar: ");
        System.out.println("========================================================");
        return "nomi: " + areaName + "\n" + "maydoni: " + areaSize + " km. kv." + "\n" + "aholi soni: " + areaPopulation + " nafar" + "\n"
                + "\n" + "-----------------------" + "\n";

    }
}
