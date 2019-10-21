package first_task;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Country {
    private String title;
    private Set<Region> regions;

    public Country(String title, Region... regions) {
        this.title = title;
        this.regions = new HashSet<>();
        for(Region region:regions) {
            this.regions.add(region);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Region> getRegions() {
        return regions;
    }

    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }


    @Override
    public String toString() {
        String returnValue =  "Country{" +
                "title='" + title + '\'' +
                "\n"+"regions = "+"\n";
        StringBuilder buffer = new StringBuilder();
        for(Region region :(Region[])regions.toArray())
        {
            buffer.append(region.toString()+"\n");
        }
        return returnValue+buffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(title, country.title) &&
                Objects.equals(regions, country.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, regions);
    }
}
