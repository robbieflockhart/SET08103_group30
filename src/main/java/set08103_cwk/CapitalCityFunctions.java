package set08103_cwk;

import set08103_cwk.Classes.CapitalCity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CapitalCityFunctions {

    public ArrayList<CapitalCity> getCapitalCity(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<CapitalCity>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database
            ResultSet rset = stmt.executeQuery(strSelect);

            // Calls SaveToArray which should attempt to add each record received from the database
            SaveToArray(output,rset);

            // Returns the ArrayList.
            return output;

        }//end try
        catch (Exception e)
        {
            // Sends out an error message if there's no information received from the database.
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getCapitalCity

    public ArrayList<CapitalCity> getCapCityAsia(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<CapitalCity>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'Asia' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Calls SaveToArray which should attempt to add each record received from the database
            SaveToArray(output,rset);

            // Returns the ArrayList.
            return output;

        }//end try
        catch (Exception e)
        {
            // Sends out an error message if there's no information received from the database.
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getCapitalCityAsia

    public ArrayList<CapitalCity> getCapCityAfrica(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<CapitalCity>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'Africa' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Calls SaveToArray which should attempt to add each record received from the database
            SaveToArray(output,rset);

            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            // Sends out an error message if there's no information received from the database.
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getCapCityAfrica

    public ArrayList<CapitalCity> getCapCityNA(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<CapitalCity>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'North America' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Calls SaveToArray which should attempt to add each record received from the database
            SaveToArray(output,rset);

            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            // Sends out an error message if there's no information received from the database.
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end gatCapCityNA

    public ArrayList<CapitalCity> getCapCitySA(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<CapitalCity>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'South America' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Calls SaveToArray which should attempt to add each record received from the database
            SaveToArray(output,rset);

            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            // Sends out an error message if there's no information received from the database.
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getCapCitySA

    public ArrayList<CapitalCity> getCapCityEurope(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<CapitalCity>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'Europe' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Calls SaveToArray which should attempt to add each record received from the database
            SaveToArray(output,rset);

            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            // Sends out an error message if there's no information received from the database.
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getCapCityEurope

    public ArrayList<CapitalCity> getCapCityOceania(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<CapitalCity>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'Oceania' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Calls SaveToArray which should attempt to add each record received from the database
            SaveToArray(output,rset);

            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            // Sends out an error message if there's no information received from the database.
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getCapCityOceania

    public ArrayList<CapitalCity> getCapCityAntarctica(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<CapitalCity>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'Antarctica' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Calls SaveToArray which should attempt to add each record received from the database
            SaveToArray(output,rset);

            // Returns the ArrayList.
            return output;
        }//end try
        catch (Exception e)
        {
            // Sends out an error message if there's no information received from the database.
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getCapCityAntarctica

    public ArrayList<CapitalCity> getCapCityRegion(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<CapitalCity>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "ORDER BY country.Region ASC, Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

         SaveToArray(output,rset);
            return output;
        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getCapCityRegion

    public ArrayList<CapitalCity> SaveToArray (ArrayList<CapitalCity> output, ResultSet rset){
        try {
            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                CapitalCity city =  new CapitalCity();
                city.setName(rset.getString("city.Name"));
                city.setCountry(rset.getString("country.Name"));
                city.setPopulation(rset.getInt("city.Population"));

                // Adds this country (plus details) to the ArrayList.
                output.add(city);
            }//end while
        }//end try
        catch (Exception e)
        {
            // Do nothing, potentially add an error message at some point
        }//end catch
        return output; // Returns output regardless of is anything has been added to the ArrayList.
    }//end SaveToArray
}//end CapitalCityFunctions
