package accenture;
import java.util.*;
public class CityNameCounter {
    public void cityCounter() {
        String cities = "Kolkata,Chennai,Delhi,Kolkata,chennai,patna,kolkata,Delhi,Nagpur";

        String[] city = cities.split(",");
        int length = city.length;
        System.out.println("Size of city " + city.length);

        HashMap<String, Integer> cityCounts  = new HashMap<>();

        for (String cityName : city) {
            String lowerCaseString = cityName.toLowerCase(Locale.ROOT);
            if (cityCounts.containsKey(lowerCaseString)) {
                cityCounts.put(lowerCaseString, cityCounts.get(lowerCaseString) + 1);
            } else {
                cityCounts.put(lowerCaseString, 1);
            }
        }
        System.out.println(cityCounts);

    }
}
