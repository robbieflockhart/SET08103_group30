package set08103_cwk;

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
}
