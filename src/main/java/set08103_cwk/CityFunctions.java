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

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                City city =  new City();
                city.setName(rset.getString("city.Name"));
                city.setCountry(rset.getString("country.Name"));
                city.setDistrict(rset.getString("District"));
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
