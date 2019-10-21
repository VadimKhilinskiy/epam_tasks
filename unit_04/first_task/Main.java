package first_task;

import java.util.Map;

public class Main {
    public static void main(String... args)
    {
        City c1 = new City("Minsk",true,true);
        City c2 = new City("Gomel", true, false);
        City c3 = new City("Grodno", true, false);
        City c4 = new City("Baranovichi", false, false);
        City c5 = new City("Slonim",false, false);
        City c6 = new City("Brest", true, false);
        City c7 = new City("Skidel", false, false);

        District d1 = new District("Brest", 28364, c6);
        District d2 = new District("Minsk", 73458, c1);
        District d3 = new District("Gomel", 64983, c2);
        District d4 = new District("Grodno", 53743, c3,c7);
        District d5 = new District("Baranovichi", 12344, c4);
        District d6 = new District("Slonim", 12386, c5);

        Region r1 = new Region("Minsk",d2);
        Region r2 = new Region("Brest", d1, d5);
        Region r3 = new Region("Gomel", d3);
        Region r4 = new Region("Grodno", d4, d6);

        Country country = new Country("Belarus",r1,r2,r3,r4);

        CountryManager countryManager = new CountryManager(country);

        System.out.println("Capital: "+countryManager.getCapital().toString());
        System.out.println("Number of regions: "+countryManager.getNumberOfRegions());
        System.out.println("Area: "+countryManager.getCountryArea());
        System.out.println("Region capitals: ");
        Map<String, City> capitals = countryManager.getRegionCapitals();
        for(Map.Entry<String, City> capital : capitals.entrySet())
        {
            System.out.println(capital.getKey()+": "+capital.getValue());
        }
    }
}
