package set08103_cwk;

import java.sql.*;
import set08103_cwk.Classes.City;
import set08103_cwk.Classes.Continent;

import java.util.ArrayList;

public class PopulationFunctions
{

    public ArrayList<Continent> getPopulationinCitybyContinent(Connection con)
    {
        ArrayList<Continent> output = new ArrayList<Continent>();

        long cityPopAsia = 0, cityPopEurope = 0, cityPopNorthAmerica = 0, cityPopAfrica = 0, cityPopOceania = 0, cityPopAntarctica = 0, cityPopSouthAmerica = 0;

        try
        {
            String thisContinent = ("");

            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT country.name, country.population, country.continent, city.id, city.population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "ORDER BY country.population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Continent continent = new Continent();
                continent.setCountryName(rset.getString("country.name"));
                continent.setCountryPopulation(rset.getInt("country.population"));
                continent.setCountryContinent(rset.getString("country.continent"));

                thisContinent = (rset.getString("country.continent"));

                continent.setCityID(rset.getInt("city.id"));
                continent.setCityPopulation(rset.getInt("city.population"));

                if (thisContinent.contains("Asia"))
                {
                    cityPopAsia += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("Europe"))
                {
                    cityPopEurope += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("North America"))
                {
                    cityPopNorthAmerica += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("South America"))
                {
                    cityPopSouthAmerica += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("Africa"))
                {
                    cityPopAfrica += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("Oceania"))
                {
                    cityPopOceania += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("Antarctica"))
                {
                    cityPopAntarctica += (rset.getLong("city.population"));
                }

                // Adds this country (plus details) to the ArrayList.
                output.add(continent);
            }//end while

        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch


        long totalPopAsia = 0, totalPopEurope = 0, totalPopNorthAmerica = 0, totalPopAfrica = 0, totalPopOceania = 0, totalPopAntarctica = 0, totalPopSouthAmerica = 0;
        try
        {
            String thisContinent = ("");

            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT name, continent, population "
                            + "FROM country "
                            + "ORDER BY continent DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                // Set thisContinent to the continent of this country.
                thisContinent = (rset.getString("continent"));

                if (thisContinent.contains("Asia"))
                {
                    totalPopAsia += (rset.getLong("population"));
                }
                else if (thisContinent.contains("Europe"))
                {
                    totalPopEurope += (rset.getLong("population"));
                }
                else if (thisContinent.contains("North America"))
                {
                    totalPopNorthAmerica += (rset.getLong("population"));
                }
                else if (thisContinent.contains("South America"))
                {
                    totalPopSouthAmerica += (rset.getLong("population"));
                }
                else if (thisContinent.contains("Africa"))
                {
                    totalPopAfrica += (rset.getLong("population"));
                }
                else if (thisContinent.contains("Oceania"))
                {
                    totalPopOceania += (rset.getLong("population"));
                }
                else if (thisContinent.contains("Antarctica"))
                {
                    totalPopAntarctica += (rset.getLong("population"));
                }

            }//end while

        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch


        // Local variable to store the % of people living in cities.
        double cityPopPercentage;

        // Asia
        cityPopPercentage = Math.round((cityPopAsia*1D)/totalPopAsia*100);
        System.out.println("Asia: total city population: " + cityPopAsia + " (" +  cityPopPercentage + "%). Total country population: " + (totalPopAsia-cityPopAsia) + " (" + (100-cityPopPercentage) + "%). Total overall population: " + totalPopAsia + ".");

        // Europe
        cityPopPercentage = Math.round((cityPopEurope*1D)/totalPopEurope*100);
        System.out.println("Europe: total city population: " + cityPopEurope + " (" +  cityPopPercentage + "%). Total country population: " + (totalPopEurope-cityPopEurope) + " (" + (100-cityPopPercentage) + "%). Total overall population: " + totalPopEurope + ".");

        // N America
        cityPopPercentage = Math.round((cityPopNorthAmerica*1D)/totalPopNorthAmerica*100);
        System.out.println("North America: total city population: " + cityPopNorthAmerica + " (" +  cityPopPercentage + "%). Total country population: " + (totalPopNorthAmerica-cityPopNorthAmerica) + " (" + (100-cityPopPercentage) + "%). Total overall population: " + totalPopNorthAmerica + ".");

        // S America
        cityPopPercentage = Math.round((cityPopSouthAmerica*1D)/totalPopSouthAmerica*100);
        System.out.println("South America: total city population: " + cityPopSouthAmerica + " (" +  cityPopPercentage + "%). Total country population: " + (totalPopSouthAmerica-cityPopSouthAmerica) + " (" + (100-cityPopPercentage) + "%). Total overall population: " + totalPopSouthAmerica + ".");

        // Africa
        cityPopPercentage = Math.round((cityPopAsia*1D)/totalPopAfrica*100);
        System.out.println("Africa: total city population: " + cityPopAfrica + " (" +  cityPopPercentage + "%). Total country population: " + (totalPopAfrica-cityPopAfrica) + " (" + (100-cityPopPercentage) + "%). Total overall population: " + totalPopAfrica + ".");

        // Oceania
        cityPopPercentage = Math.round((cityPopOceania*1D)/totalPopOceania*100);
        System.out.println("Oceania: total city population: " + cityPopOceania + " (" +  cityPopPercentage + "%). Total country population: " + (totalPopOceania-cityPopOceania) + " (" + (100-cityPopPercentage) + "%). Total overall population: " + totalPopOceania + ".");

        // Antarctica
        cityPopPercentage = Math.round((cityPopAntarctica*1D)/totalPopAntarctica*100);
        System.out.println("Antarctica: total city population: " + cityPopAntarctica + " (" +  '0' + "%). Total country population: " + (totalPopAntarctica-cityPopAntarctica) + " (" + ('0') + "%). Total overall population: " + totalPopAntarctica + ".");


        // Returns the ArrayList.
        return output;
    }//end getPopulationinCitybyContinent

}
