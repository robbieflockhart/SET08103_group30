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
        a.displayCountry(country);
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
                    "SELECT Name , Population "
                            + "FROM country "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.
            // Check one is returned
            while (rset.next()) {
                Country country =  new Country();
                country.name = rset.getString("Name");
                country.population = rset.getInt("Population");

                String store =  country.name + " " + country.population;

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