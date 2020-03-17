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
            ArrayList<CapitalCity> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            SaveToArray(output,rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }
    }

    public ArrayList<CapitalCity> getCapCityAsia(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'Asia' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            SaveToArray(output,rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }
    }

    public ArrayList<CapitalCity> getCapCityAfrica(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'Africa' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            SaveToArray(output,rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }
    }

    public ArrayList<CapitalCity> getCapCityNA(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'North America' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            SaveToArray(output,rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }
    }

    public ArrayList<CapitalCity> getCapCitySA(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'South America' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            SaveToArray(output,rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }
    }

    public ArrayList<CapitalCity> getCapCityEurope(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'Europe' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            SaveToArray(output,rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }
    }

    public ArrayList<CapitalCity> getCapCityOceania(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'Oceania' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            SaveToArray(output,rset);
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }
    }

    public ArrayList<CapitalCity> getCapCityAntarctica(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "WHERE ID = Capital AND Continent LIKE 'Antarctica' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            SaveToArray(output,rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }
    }

    public ArrayList<CapitalCity> getCapCityRegion(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<CapitalCity> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "ORDER BY country.Region ASC, Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

         SaveToArray(output,rset);
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }
    }

    public ArrayList<CapitalCity> getContUserInput(Connection con, int userLimit) {
        try {

            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Creates an array list to store the data
            ArrayList<CapitalCity> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "ORDER BY country.Continent ASC, Population DESC "
                            + "LIMIT " + userLimit + " ";

            // Sends the query to the database:
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            SaveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }
    }

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
            // Adds this country (plus details) to the ArrayList.

        }//end try
        catch (Exception e)
        {
            //do nothing
        }//end catch
        return output;
    }//end SaveToArray
}
