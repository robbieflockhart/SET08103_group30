// MAIN APPLICATION
// SOFTWARE ENGINEERING METHODS GROUP ASSESSMENT
// GROUP 30
// Edinburgh Napier University, Session 2019/20, Semester 2.

package set08103_cwk;

import set08103_cwk.Classes.CapitalCity;
import set08103_cwk.Classes.City;
import set08103_cwk.Classes.Country;

import java.util.ArrayList;

public class Application
{

    public static void main(String[] args)
    {
        // Create new Application
        DatabaseConnection dc = new DatabaseConnection();

        CountryFunctions cf = new CountryFunctions();
        CityFunctions cityFunc = new CityFunctions();
        CapitalCityFunctions capCityFunc = new CapitalCityFunctions();

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

        ArrayList<Country> countryRegion = cf.getRegion(dc.database());

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

        // region
        System.out.println("\n\nRegion Feature: \n");
        df.displayCountry(countryRegion);


        System.out.println("\n\nCity Functions: \n");
        System.out.println("\n\nDisplay by population: \n");
        ArrayList<City> cityPop = cityFunc.getCity(dc.database());
        df.displayCity(cityPop);

        ArrayList<City> cityAsia = cityFunc.getCityContAsia(dc.database());
        ArrayList<City> cityEurope = cityFunc.getCityContEurope(dc.database());
        ArrayList<City> cityNorthAmerica = cityFunc.getCityContNorthAmerica(dc.database());
        ArrayList<City> citySouthAmerica = cityFunc.getCityContSouthAmerica(dc.database());
        ArrayList<City> cityAfrica = cityFunc.getCityContAfrica(dc.database());
        ArrayList<City> cityOcean = cityFunc.getCityContOcean(dc.database());
        ArrayList<City> cityAnt = cityFunc.getCityContAnt(dc.database());
        ArrayList<City> cityRegion = cityFunc.getCityRegion(dc.database());

        // Asia
        System.out.println("\n\nPopulation of cities in Asia: \n");
        df.displayCity(cityAsia); // ("contAsia" is a list of all the countries in Asia).

        // Africa
        System.out.println("\n\nPopulation of cities in Africa: \n");
        df.displayCity(cityAfrica);

        // N America
        System.out.println("\n\nPopulation of cities in North America: \n");
        df.displayCity(cityNorthAmerica);

        // S America
        System.out.println("\n\nPopulation of cities in South America: \n");
        df.displayCity(citySouthAmerica);

        // Europe
        System.out.println("\n\nPopulation of cities in Europe: \n");
        df.displayCity(cityEurope);

        // Oceania
        System.out.println("\n\nPopulation of cities in Oceania: \n");
        df.displayCity(cityOcean);

        // Antarctica
        System.out.println("\n\nPopulation of cities in Antarctica: \n");
        df.displayCity(cityAnt);

        System.out.println("\n\nRegion Feature: \n");
        df.displayCity(cityRegion);

        ArrayList<CapitalCity> capitalCity = capCityFunc.getCapitalCity(dc.database());

        // Capital Cities by population
        System.out.println("\n\nPopulation of capital cities: \n");
        df.displayCapitalCity(capitalCity);

        ArrayList<City> citiesGBdistrictSBpop = cityFunc.getCityDistrict(dc.database());

        System.out.println("\n\nCITIES in the world, GROUPED BY district, SORTED BY population: \n");
        df.displayCity(citiesGBdistrictSBpop);

        // Disconnects from the database:
        dc.disconnect();
    }

}