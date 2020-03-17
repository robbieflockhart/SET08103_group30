package set08103_cwk;

import set08103_cwk.Classes.Country;

import java.sql.*;
import java.util.ArrayList;

public class CountryFunctions {

    public ArrayList<Country> getCountry(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            SaveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Countries); check connection?");
            return null;
        }
    }

    // Displays all details for Continent of Asia and returns COUNTRY. **************************
    public ArrayList<Country> getContAsia(Connection con)
    {
        try {

            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Creates an array list to store the data
            ArrayList<Country> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Asia' "
                            + "ORDER BY Population DESC ";

            // Sends the query to the database:
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            SaveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Asia); check connection?");
            return null;
        }
    }

    // Displays all details for Continent of Europe and returns Country. **************************
    public ArrayList<Country> getContEurope(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            ArrayList<Country> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Europe' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            SaveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Europe); check connection?");
            return null;
        }
    }

    // Displays all details for Continent of N America and returns Country. **************************
    public ArrayList<Country> getContNorthAmerica(Connection con)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<Country> output = new ArrayList<>();

            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'North America' "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.
            // Check one is returned
            SaveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (N America); check connection?");
            return null;
        }
    }

    // Displays all details for Continent of S America and returns Country. **************************
    public ArrayList<Country> getContSouthAmerica(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'South America' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            SaveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (S America); check connection?");
            return null;
        }
    }


    // Displays all details for Continent of Africa and returns Country. **************************
    public ArrayList<Country> getContAfrica(Connection con)
    {
        try {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Africa' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            SaveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Africa); check connection?");
            return null;
        }
    }
    // Displays all details for Continent of Oceania and returns Country. **************************
    public ArrayList<Country> getContOcean(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Oceania' "
                            + "ORDER BY Population DESC ";
            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            SaveToArray(output, rset);
            return output;

        }//end try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Oceania); check connection?\n");
            return null;
        }//end catch
    }//end getContOcean

    // Displays all details for Continent of Antarctica and returns Country. **************************
    public ArrayList<Country> getContAnt(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Antarctica' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            SaveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Antarctica); check connection?\n");
            return null;
        }
    }

    public ArrayList<Country> getRegion(Connection con)
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "ORDER BY Region ASC, Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);


            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Antarctica); check connection?\n");
            return null;
        }
    }

    public ArrayList<Country> getContUserInput(Connection con, int userLimit)
    {
        try {

            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Creates an array list to store the data
            ArrayList<Country> output = new ArrayList<>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "ORDER BY Continent ASC, Population DESC "
                            + "LIMIT " + userLimit + " ";

            // Sends the query to the database:
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            SaveToArray(output, rset);
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Asia); check connection?");
            return null;
        }
    }

    public ArrayList<Country> SaveToArray (ArrayList<Country> output, ResultSet rset){
        try {

         // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                 Country country = new Country();
                 country.setCode(rset.getString("Code"));
                country.setName(rset.getString("Name"));
                country.setContinent(rset.getString("Continent"));
                country.setRegion(rset.getString("Region"));
                country.setPopulation(rset.getInt("Population"));
                country.setCapital(rset.getString("Capital"));
                output.add(country);
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
