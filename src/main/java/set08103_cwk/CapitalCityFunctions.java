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

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                CapitalCity city =  new CapitalCity();
                city.setName(rset.getString("city.Name"));
                city.setCountry(rset.getString("country.Name"));
                city.setPopulation(rset.getInt("city.Population"));

                // Adds this country (plus details) to the ArrayList.
                output.add(city);
            }
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

}
