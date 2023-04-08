package Mentoring5.Inheritance;

public class ZirhliArac {

    private String name;
    private String fuelType;
    private int range;
    private boolean hasPalette;

    public ZirhliArac(String name, String fuelType, int range, boolean hasPalette) {
        setName (name);
        setFuelType (fuelType);
        setRange (range);
        setHasPalette (hasPalette);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public boolean isHasPalette() {
        return hasPalette;
    }

    public void setHasPalette(boolean hasPalette) {
        this.hasPalette = hasPalette;
    }
}
