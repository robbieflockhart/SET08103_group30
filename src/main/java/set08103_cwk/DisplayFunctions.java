package set08103_cwk;

import set08103_cwk.Classes.CapitalCity;
import set08103_cwk.Classes.City;
import set08103_cwk.Classes.Country;

import java.util.ArrayList;

public class DisplayFunctions {

    // Prints out a table of all the countries passed in, sorted by population.

    public void displayCountry(ArrayList<Country> countries)
    {
        for (Country country : countries)
        {
            String countryString = String.format(country.code + ", " + country.name + ", " + country.continent + ", " + country.region + ", " + country.population + ", " + country.capital + "\n");
            System.out.println(countryString);
        }

    }

    public void displayCity(ArrayList<City> cities)
    {
        for (City city : cities)
        {
            String countryString = String.format(city.name + ", " + city.country + ", " + city.name + ", " + city.district + ", " + city.population + "\n");
            System.out.println(countryString);
        }

    }

    public void displayCapitalCity(ArrayList<CapitalCity> capital)
    {
        for (CapitalCity city : capital)
        {
            String countryString = String.format(city.name + ", " + city.country + ", " + city.name  + ", " + city.population + "\n");
            System.out.println(countryString);
        }

    }
}
