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

        try
        {

            long popAsia = 0, popEurope = 0, popNorthAmerica = 0, popAfrica = 0, popOceania = 0, popAntarctica = 0, popSouthAmerica = 0;
            String thisContinent = ("");

            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            //ArrayList<Continent> output = new ArrayList<Continent>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    //"SELECT city.Name, country.Name, District, city.Population "
                    //"SELECT city.Name, country.continent, country.Population, city.population "
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

                //System.out.println("thisContinent = '" + thisContinent + "', this city population = '" + (rset.getLong("city.population")) + "'");

                if (thisContinent.contains("Asia"))
                {
                    popAsia += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("Europe"))
                {
                    popEurope += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("North America"))
                {
                    popNorthAmerica += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("South America"))
                {
                    popSouthAmerica += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("Africa"))
                {
                    popAfrica += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("Oceania"))
                {
                    popOceania += (rset.getLong("city.population"));
                }
                else if (thisContinent.contains("Antarctica"))
                {
                    popAntarctica += (rset.getLong("city.population"));
                }

                // Adds this country (plus details) to the ArrayList.
                //System.out.println(continent.toString());
                output.add(continent);
            }//end while
            // Returns the ArrayList.
            System.out.println("Total city population of Asia = " + popAsia);
            System.out.println("Total city population of Europe = " + popEurope);
            System.out.println("Total city population of North America = " + popNorthAmerica);
            System.out.println("Total city population of South America = " + popSouthAmerica);
            System.out.println("Total city population of Africa = " + popAfrica);
            System.out.println("Total city population of Oceania = " + popOceania);
            System.out.println("Total city population of Antarctica = " + popAntarctica);
            System.out.println("Maximum value of long = " + Long.MAX_VALUE);

            //return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch



        try
        {
            long popAsia = 0, popEurope = 0, popNorthAmerica = 0, popAfrica = 0, popOceania = 0, popAntarctica = 0, popSouthAmerica = 0;
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
                    popAsia += (rset.getLong("population"));
                }
                else if (thisContinent.contains("Europe"))
                {
                    popEurope += (rset.getLong("population"));
                }
                else if (thisContinent.contains("North America"))
                {
                    popNorthAmerica += (rset.getLong("population"));
                }
                else if (thisContinent.contains("South America"))
                {
                    popSouthAmerica += (rset.getLong("population"));
                }
                else if (thisContinent.contains("Africa"))
                {
                    popAfrica += (rset.getLong("population"));
                }
                else if (thisContinent.contains("Oceania"))
                {
                    popOceania += (rset.getLong("population"));
                }
                else if (thisContinent.contains("Antarctica"))
                {
                    popAntarctica += (rset.getLong("population"));
                }

            }//end while

            System.out.println("Total population of Asia = " + popAsia);
            System.out.println("Total population of Europe = " + popEurope);
            System.out.println("Total population of North America = " + popNorthAmerica);
            System.out.println("Total population of South America = " + popSouthAmerica);
            System.out.println("Total population of Africa = " + popAfrica);
            System.out.println("Total population of Oceania = " + popOceania);
            System.out.println("Total population of Antarctica = " + popAntarctica);

        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
        return output;
    }//end getCity







}
