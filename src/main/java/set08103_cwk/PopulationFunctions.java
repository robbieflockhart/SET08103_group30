package set08103_cwk;
import java.sql.*;
import set08103_cwk.Classes.Population;

import java.util.ArrayList;

public class PopulationFunctions {

    public ArrayList<Population> getPopulationinCitybyContinent(Connection con) {
        try {
            ArrayList<Population> output = new ArrayList<>();

            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT country.continent, SUM(DISTINCT country.population), SUM(DISTINCT city.population) "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "GROUP BY country.continent ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Population continent = new Population();
                continent.setName(rset.getString("country.continent"));
                continent.setPopulation(rset.getLong("SUM(DISTINCT country.population)"));
                double percentCity = Math.round((rset.getLong("SUM(DISTINCT city.population)") * 1D) / rset.getLong("SUM(DISTINCT country.population)") * 100);
                continent.setCityPopulationPercent(percentCity);
                continent.setCityPopulation(rset.getLong("SUM(DISTINCT city.population)"));
                long outCity = (rset.getLong("SUM(DISTINCT country.population)") - rset.getLong("SUM(DISTINCT city.population)"));
                continent.setNotCityPopulation(outCity);
                double percentNonCity = Math.round((outCity * 1D) / rset.getLong("SUM(DISTINCT country.population)") * 100);
                continent.setNonCityPopulationPercent(percentNonCity);

                // Adds this country (plus details) to the ArrayList.
                output.add(continent);
            }//end while

            return output;

        }//end try
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getPopulationinCitybyContinent

    public ArrayList<Population> getPopulationinCitybyRegion(Connection con) {
        try {
            ArrayList<Population> output = new ArrayList<>();

            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT country.region, SUM(DISTINCT country.population), SUM(DISTINCT city.population) "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "GROUP BY country.region ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Population popReport = new Population();
                popReport.setName(rset.getString("country.region"));
                popReport.setPopulation(rset.getLong("SUM(DISTINCT country.population)"));
                double percentCity = Math.round((rset.getLong("SUM(DISTINCT city.population)") * 1D) / rset.getLong("SUM(DISTINCT country.population)") * 100);
                popReport.setCityPopulationPercent(percentCity);
                popReport.setCityPopulation(rset.getLong("SUM(DISTINCT city.population)"));
                long outCity = (rset.getLong("SUM(DISTINCT country.population)") - rset.getLong("SUM(DISTINCT city.population)"));
                popReport.setNotCityPopulation(outCity);
                double percentNonCity = Math.round((outCity * 1D) / rset.getLong("SUM(DISTINCT country.population)") * 100);
                popReport.setNonCityPopulationPercent(percentNonCity);

                // Adds this country (plus details) to the ArrayList.
                output.add(popReport);
            }//end while

            return output;

        }//end try
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getPopulationinCitybyContinent

    public ArrayList<Population> getPopulationinCitybyCountry(Connection con) {
        try {
            ArrayList<Population> output = new ArrayList<>();

            // Creates an SQL statement.
            Statement stmt = con.createStatement();

            // Creates an SQL statement, stored as a STRING.
            String strSelect =
                    "SELECT country.Name, SUM(DISTINCT country.population), SUM(DISTINCT city.population) "
                            + "FROM city JOIN country ON CountryCode=code "
                            + "GROUP BY country.Name ";

            // Sends the SQL statement to the database.
            ResultSet rset = stmt.executeQuery(strSelect);

            // Indicates which columns on the database align to which attributes within "country".
            while (rset.next()) {
                Population popReport = new Population();
                popReport.setName(rset.getString("country.Name"));
                popReport.setPopulation(rset.getLong("SUM(DISTINCT country.population)"));
                double percentCity = Math.round((rset.getLong("SUM(DISTINCT city.population)") * 1D) / rset.getLong("SUM(DISTINCT country.population)") * 100);
                popReport.setCityPopulationPercent(percentCity);
                popReport.setCityPopulation(rset.getLong("SUM(DISTINCT city.population)"));
                long outCity = (rset.getLong("SUM(DISTINCT country.population)") - rset.getLong("SUM(DISTINCT city.population)"));
                popReport.setNotCityPopulation(outCity);
                double percentNonCity = Math.round((outCity * 1D) / rset.getLong("SUM(DISTINCT country.population)") * 100);
                popReport.setNonCityPopulationPercent(percentNonCity);

                // Adds this country (plus details) to the ArrayList.
                output.add(popReport);
            }//end while

            return output;

        }//end try
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get information from database (City); check connection?");
            return null;
        }//end catch
    }//end getPopulationinCitybyContinent

}

