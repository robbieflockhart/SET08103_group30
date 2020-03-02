package set08103_cwk;

import java.sql.*;

import set08103_cwk.Classes.City;

import java.util.ArrayList;

public class CityFunctions {

    public ArrayList<City> getCity(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<City> output = new ArrayList<City>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, District, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "ORDER BY Population DESC ";

            ResultSet rset = stmt.executeQuery(strSelect);
            // Sends the query to the database:
            saveToArray(output, rset);
            return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getCity

    public ArrayList<City> getCityContAsia(Connection con)
    {
        try {

            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Creates an array list to store the data
            ArrayList<City> output = new ArrayList<City>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, District, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE Continent LIKE 'Asia' "
                            + "ORDER BY Population DESC ";

            ResultSet rset = stmt.executeQuery(strSelect);
            // Sends the query to the database:
            saveToArray(output, rset);
            return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Asia); check connection?");
            return null;
        }//end catch
    }//endCityContAsia

    // Displays all details for Continent of Europe and returns Country. **************************
    public ArrayList<City> getCityContEurope(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            ArrayList<City> output = new ArrayList<City>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, District, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE Continent LIKE 'Europe' "
                            + "ORDER BY Population DESC ";

            ResultSet rset = stmt.executeQuery(strSelect);
            // Sends the query to the database:
            saveToArray(output, rset);
            return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Europe); check connection?");
            return null;
        }//end catch
    }//end getCityContEurope

    // Displays all details for Continent of N America and returns Country. **************************
    public ArrayList<City> getCityContNorthAmerica(Connection con)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<City> output = new ArrayList<City>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, District, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE Continent LIKE 'North America' "
                            + "ORDER BY Population DESC ";

            ResultSet rset = stmt.executeQuery(strSelect);
            // Sends the query to the database:
            saveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (N America); check connection?");
            return null;
        }//end catch
    }//end getCityContNorthAmerica

    // Displays all details for Continent of S America and returns Country. **************************
    public ArrayList<City> getCityContSouthAmerica(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<City> output = new ArrayList<City>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, District, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE Continent LIKE 'South America' "
                            + "ORDER BY Population DESC ";

            ResultSet rset = stmt.executeQuery(strSelect);
            // Sends the query to the database:
            saveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (S America); check connection?");
            return null;
        }//end catch
    }//end getCityContSouthAmerica


    // Displays all details for Continent of Africa and returns Country. **************************
    public ArrayList<City> getCityContAfrica(Connection con)
    {
        try {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<City> output = new ArrayList<City>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, District, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE Continent LIKE 'Africa' "
                            + "ORDER BY Population DESC ";

            ResultSet rset = stmt.executeQuery(strSelect);
            // Sends the query to the database:
            saveToArray(output, rset);
            return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Africa); check connection?");
            return null;
        }//end catch
    }//end getCityContAfrica

    // Displays all details for Continent of Oceania and returns Country. **************************
    public ArrayList<City> getCityContOcean(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<City> output = new ArrayList<City>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, District, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE Continent LIKE 'Oceania' "
                            + "ORDER BY Population DESC ";

            ResultSet rset = stmt.executeQuery(strSelect);
            // Sends the query to the database:
            saveToArray(output, rset);

            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Oceania); check connection?\n");
            return null;
        }//end catch
    }//end getCityContOcean

    // Displays all details for Continent of Antarctica and returns Country. **************************
    public ArrayList<City> getCityContAnt(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<City> output = new ArrayList<City>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, District, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE Continent LIKE 'Antarctica' "
                            + "ORDER BY Population DESC ";

            ResultSet rset = stmt.executeQuery(strSelect);
            // Sends the query to the database:
            saveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Antarctica); check connection?\n");
            return null;
        }//end catch
    }//end getCityContAnt

    public ArrayList<City> getCityRegion(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<City> output = new ArrayList<City>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, District, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "ORDER BY country.Region ASC, Population DESC ";

            ResultSet rset = stmt.executeQuery(strSelect);
            // Sends the query to the database:
            saveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Antarctica); check connection?\n");
            return null;
        }//catch
    }//end getCityRegion

    private ArrayList<City> saveToArray (ArrayList<City> output, ResultSet rset)
    {
        try {
            // Sends the query to the database:

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                City city = new City();
                city.setName(rset.getString("city.Name"));
                city.setCountry(rset.getString("country.Name"));
                city.setDistrict(rset.getString("District"));
                city.setPopulation(rset.getInt("city.Population"));

                // Adds this country (plus details) to the ArrayList.
                output.add(city);
            }//end while
        }//end try
        catch (Exception e)
        {
           //do nothing
        }//end catch
        return output; //returns the updated output array
    }//end saveToArray
}//end CityFunctions
