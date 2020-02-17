//This is the main application

package set08103_cwk;

import java.sql.*;
import java.util.ArrayList;

public class Application
{
    public static void main(String[] args)
    {
        // Create new Application
        Application a = new Application();

        // Connect to database
        a.connect();

        ArrayList<String> country = a.getCountry();

        ArrayList<String> contAsia = a.getContAsia();

        ArrayList<String> contAfrica = a.getContAfrica();

        ArrayList<String> contNA = a.getContNorthAmerica();

        ArrayList<String> contSA = a.getContSouthAmerica();

        ArrayList<String> contEurope = a.getContEurope();

        ArrayList<String> contOc = a.getContOcean();

        ArrayList<String> contAnt = a.getContAnt();

        a.displayCountry(country);

        System.out.println("Issue 2");
        a.displayCountry(contAsia);
        a.displayCountry(contAfrica);
        a.displayCountry(contNA);
        a.displayCountry(contSA);
        a.displayCountry(contEurope);
        a.displayCountry(contOc);
        a.displayCountry(contAnt);
        // Disconnect from database
        a.disconnect();
    }
    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    public ArrayList<String> getCountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<String> output = new ArrayList<String>();

            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.
            // Check one is returned
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                String store = country.code + " " + country.name + " " + country.continent + " " + country.region + " "
                        + country.population + " " + country.capital;

                output.add(store);
            }
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

    public ArrayList<String> getContAsia()
    {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<String> output = new ArrayList<String>();

            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Asia' "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.
            // Check one is returned
            while (rset.next()) {
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                String store = country.code + " " + country.name + " " + country.continent + " " + country.region + " "
                        + country.population + " " + country.capital;

                output.add(store);
            }
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

    public ArrayList<String> getContEurope()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<String> output = new ArrayList<String>();

            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Europe' "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.
            // Check one is returned
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                String store = country.code + " " + country.name + " " + country.continent + " " + country.region + " "
                        + country.population + " " + country.capital;

                output.add(store);
            }
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

    public ArrayList<String> getContNorthAmerica()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<String> output = new ArrayList<String>();

            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'North America' "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.
            // Check one is returned
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                String store = country.code + " " + country.name + " " + country.continent + " " + country.region + " "
                        + country.population + " " + country.capital;

                output.add(store);
            }
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

    public ArrayList<String> getContSouthAmerica()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<String> output = new ArrayList<String>();

            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'South America' "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.
            // Check one is returned
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                String store = country.code + " " + country.name + " " + country.continent + " " + country.region + " "
                        + country.population + " " + country.capital;

                output.add(store);
            }
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

    public ArrayList<String> getContAfrica()
    {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<String> output = new ArrayList<String>();

            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Africa' "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.
            // Check one is returned
            while (rset.next()) {
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                String store = country.code + " " + country.name + " " + country.continent + " " + country.region + " "
                        + country.population + " " + country.capital;

                output.add(store);
            }
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

    public ArrayList<String> getContOcean()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<String> output = new ArrayList<String>();

            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Oceania' "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.
            // Check one is returned
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                String store = country.code + " " + country.name + " " + country.continent + " " + country.region + " "
                        + country.population + " " + country.capital;

                output.add(store);
            }
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

    public ArrayList<String> getContAnt()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<String> output = new ArrayList<String>();

            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Antarctica' "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.
            // Check one is returned
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                String store = country.code + " " + country.name + " " + country.continent + " " + country.region + " "
                        + country.population + " " + country.capital;

                output.add(store);
            }
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

    public void displayCountry(ArrayList country)
    {

        String output = "";
        for(int i = 0; i < country.size(); i++)
        {
            output += country.get(i) + "\n";
        }

        System.out.println(output);
    }
}