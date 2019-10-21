package first_task;

import java.util.HashMap;
import java.util.Map;

public class CountryManager {
    private Country country;

    public CountryManager(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCapital() {
        for(Region region:country.getRegions()) {
            for(District district:region.getDistricts()) {
                for(City city:district.getCities()) {
                    if(city.isCapital()) {
                        return city;
                    }
                }
            }
        }
        return null;
    }

    public int getNumberOfRegions() {
        int numberOfRegions = 0;
        for(Region region:country.getRegions()) {
                numberOfRegions++;
        }
        return numberOfRegions;
    }

    public double getCountryArea() {
        double totalArea = .0;
        for(Region region:country.getRegions()) {
            for(District district:region.getDistricts()){
                totalArea+=district.getArea();
            }
        }
        return totalArea;
    }

    public Map<String, City> getRegionCapitals() {
        Map<String,City> regionCapitals = new HashMap<>();
        for(Region region:country.getRegions()){
            for(District district: region.getDistricts()){
                for(City city:district.getCities()){
                    if(city.isRegionCapital()){
                        regionCapitals.put(region.getTitle(),city);
                        break;
                    }
                }
            }
        }
        return regionCapitals;
    }

}
