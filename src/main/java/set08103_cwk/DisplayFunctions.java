package set08103_cwk;

import set08103_cwk.Classes.CapitalCity;
import set08103_cwk.Classes.City;
import set08103_cwk.Classes.Country;
import set08103_cwk.Classes.Population;

import java.util.ArrayList;

public class DisplayFunctions {

    // Prints out a table of all the countries passed in, sorted by population.

    public static void displayCountry(ArrayList<Country> countries)
    {
        for (Country country : countries)
        {
            System.out.println(country.toString());
        }

    }

    public static void displayCity(ArrayList<City> cities)
    {
        for (City city : cities)
        {
            System.out.println(city.toString());
        }

    }

    public static void displayCapitalCity(ArrayList<CapitalCity> capital)
    {
        for (CapitalCity capitalCity : capital)
        {
            System.out.println(capitalCity.toString());
        }

    }

    public static void displayPopulationReport(ArrayList<Population> populations){

        for (Population population : populations)
        {
            System.out.println(population.toString());
        }
    }
}
