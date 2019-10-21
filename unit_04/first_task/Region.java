package first_task;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Region {
    private String title;
    private Set<District> districts;

    public Region(String title, District... districts) {
        this.title = title;
        this.districts = new HashSet<>();
        for(District district:districts) {
            this.districts.add(district);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        String returnValue = "Region{" +
                "title='" + title + '\'' + "\n"+
                "districts:"+"\n";
        StringBuilder buffer = new StringBuilder();
        for(District district:(District[]) districts.toArray()) {
            buffer.append(district.toString()+"\n");
        }
        return returnValue+buffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(title, region.title) &&
                Objects.equals(districts, region.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, districts);
    }
}
