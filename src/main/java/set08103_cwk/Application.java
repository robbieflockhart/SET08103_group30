// MAIN APPLICATION
// SOFTWARE ENGINEERING METHODS GROUP ASSESSMENT
// GROUP 30
// Edinburgh Napier University, Session 2019/20, Semester 2.

package set08103_cwk;

import java.sql.*;
import java.util.ArrayList;

public class Application
{

    public static void main(String[] args)
    {
        // Create new Application
        Application a = new Application();
        DatabaseConnection dc = new DatabaseConnection();
        CountryFunctions cf = new CountryFunctions();
        DisplayFunctions df = new DisplayFunctions();

        // Connect to database
        dc.connect();

        // Gets all the countries in the world and saves them to an arraylist, in population order.
        ArrayList<Country> country = cf.getCountry(dc.database());

        //Creates an Array List to store the countries, and then calls the function ...
        // to populate the ArrayList, running in population order.
        ArrayList<Country> contAsia = cf.getContAsia(dc.database());

        ArrayList<Country> contAfrica = cf.getContAfrica(dc.database());

        ArrayList<Country> contNA = cf.getContNorthAmerica(dc.database());

        ArrayList<Country> contSA = cf.getContSouthAmerica(dc.database());

        ArrayList<Country> contEurope = cf.getContEurope(dc.database());

        ArrayList<Country> contOc = cf.getContOcean(dc.database());

        ArrayList<Country> contAnt = cf.getContAnt(dc.database());

        // Prints out a table of all the countries in the world, sorted by population.
        System.out.println("\n\nShowing all countries in the world, sorted by POPULATION:\n");
        df.displayCountry(country); // ("country" is a list of all the countries in the world).


        // Prints out a table of all the countries in the world, grouped by continent (with a gap between...
        // ... each continent), sorted by population.

        // Asia
        System.out.println("\n\nPopulation of countries in Asia: \n");
        df.displayCountry(contAsia); // ("contAsia" is a list of all the countries in Asia).

        // Africa
        System.out.println("\n\nPopulation of countries in Africa: \n");
        df.displayCountry(contAfrica);

        // N America
        System.out.println("\n\nPopulation of countries in North America: \n");
        df.displayCountry(contNA);

        // S America
        System.out.println("\n\nPopulation of countries in South America: \n");
        df.displayCountry(contSA);

        // Europe
        System.out.println("\n\nPopulation of countries in Europe: \n");
        df.displayCountry(contEurope);

        // Oceania
        System.out.println("\n\nPopulation of countries in Oceania: \n");
        df.displayCountry(contOc);

        // Antarctica
        System.out.println("\n\nPopulation of countries in Antarctica: \n");
        df.displayCountry(contAnt);


        // Disconnects from the database:
        dc.disconnect();
    }

}