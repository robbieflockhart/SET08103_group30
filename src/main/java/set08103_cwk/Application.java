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

        // Connect to database
        a.connect();

        // Gets all the countries in the world and saves them to an arraylist, in population order.
        ArrayList<Country> country = a.getCountry();

        //Creates an Array List to store the countries, and then calls the function ...
        // to populate the ArrayList, running in population order.
        ArrayList<Country> contAsia = a.getContAsia();

        ArrayList<Country> contAfrica = a.getContAfrica();

        ArrayList<Country> contNA = a.getContNorthAmerica();

        ArrayList<Country> contSA = a.getContSouthAmerica();

        ArrayList<Country> contEurope = a.getContEurope();

        ArrayList<Country> contOc = a.getContOcean();

        ArrayList<Country> contAnt = a.getContAnt();

        // Prints out a table of all the countries in the world, sorted by population.
        System.out.println("\n\nShowing all countries in the world, sorted by POPULATION:\n");
        a.displayCountry(country); // ("country" is a list of all the countries in the world).


        // Prints out a table of all the countries in the world, grouped by continent (with a gap between...
        // ... each continent), sorted by population.

        // Asia
        System.out.println("\n\n Population of countries in Asia: \n");
        a.displayCountry(contAsia); // ("contAsia" is a list of all the countries in Asia).

        // Africa
        System.out.println("\n\nPopulation of countries in Africa: \n");
        a.displayCountry(contAfrica);

        // N America
        System.out.println("\n\nPopulation of countries in North America: \n");
        a.displayCountry(contNA);

        // S America
        System.out.println("\n\nPopulation of countries in South America: \n");
        a.displayCountry(contSA);

        // Europe
        System.out.println("\n\nPopulation of countries in Europe: \n");
        a.displayCountry(contEurope);

        // Oceania
        System.out.println("\n\nPopulation of countries in Oceania: \n");
        a.displayCountry(contOc);

        // Antarctica
        System.out.println("\n\nPopulation of countries in Antarctica: \n");
        a.displayCountry(contAnt);


        // Disconnects from the database:
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

    // Gets all the Countries in the world and stores them in a Country, sorted by Population. *************
    public ArrayList<Country> getCountry()
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<Country>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                // Adds this country (plus details) to the ArrayList.
                output.add(country);
            }
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
    public ArrayList<Country> getContAsia()
    {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Creates an array list to store the data
            ArrayList<Country> output = new ArrayList<Country>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Asia' "
                            + "ORDER BY Population DESC ";

            // Sends the query to the database:
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                // Adds this country (plus details) to the ArrayList.
                output.add(country);
            }
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
    public ArrayList<Country> getContEurope()
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            ArrayList<Country> output = new ArrayList<Country>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Europe' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                // Adds this country (plus details) to the ArrayList.
                output.add(country);
            }
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
    public ArrayList<Country> getContNorthAmerica()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            ArrayList<Country> output = new ArrayList<Country>();

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

                // Adds this country (plus details) to the ArrayList.
                output.add(country);
            }
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
    public ArrayList<Country> getContSouthAmerica()
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<Country>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'South America' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                // Adds this country (plus details) to the ArrayList.
                output.add(country);
            }
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
    public ArrayList<Country> getContAfrica()
    {
        try {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<Country>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Africa' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                // Adds this country (plus details) to the ArrayList.
                output.add(country);
            }
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
    public ArrayList<Country> getContOcean()
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<Country>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Oceania' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                // Adds this country (plus details) to the ArrayList.
                output.add(country);
            }
            // Returns the ArrayList.
            return output;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (Oceania); check connection?\n");
            return null;
        }
    }

    // Displays all details for Continent of Antarctica and returns Country. **************************
    public ArrayList<Country> getContAnt()
    {
        try
        {
            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an array list to store the data.
            ArrayList<Country> output = new ArrayList<Country>();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT Name, Population, Code, Continent, Region, Capital "
                            + "FROM country "
                            + "WHERE Continent LIKE 'Antarctica' "
                            + "ORDER BY Population DESC ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Country country =  new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                country.capital = rset.getString("Capital");

                // Adds this country (plus details) to the ArrayList.
                output.add(country);
            }
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