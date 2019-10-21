package first_task;

import java.util.Objects;

public class City {
    private String name;
    private boolean isRegionCapital;
    private boolean isCapital;

    public City(String name, boolean isRegionCapital, boolean isCapital) {
        this.name = name;
        this.isRegionCapital = isRegionCapital;
        this.isCapital = isCapital;
    }

    public boolean isRegionCapital() {
        return isRegionCapital;
    }

    public void setRegionCapital(boolean regionCapital) {
        isRegionCapital = regionCapital;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return isRegionCapital == city.isRegionCapital &&
                isCapital == city.isCapital &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isRegionCapital, isCapital);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
