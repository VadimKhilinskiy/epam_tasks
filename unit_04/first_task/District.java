package first_task;

import java.util.*;

public class District {
    private String title;
    private Set<City> cities;
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public District(String title, double area, City... cities) {
        this.title = title;
        this.area = area;
        this.cities = new HashSet<>();
        for(City city: cities) {
            this.cities.add(city);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        String returnValue = "District{" +
                "title='" + title + '\''+", area = "+area+"\n"+"citites:"+"\n";
        StringBuilder builder = new StringBuilder();
        for(City city:(City[])cities.toArray()) {
            builder.append(city.toString()+"\n");
        }
        return returnValue+builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return title.equals(district.title) &&
                cities.equals(district.cities) &&
                area == district.area;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, cities, area);
    }
}
