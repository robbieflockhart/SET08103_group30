import org.junit.jupiter.api.Test;
import set08103_cwk.CityFunctions;
import set08103_cwk.Classes.CapitalCity;
import set08103_cwk.Classes.City;
import set08103_cwk.Classes.Country;
import set08103_cwk.Classes.Population;
import set08103_cwk.DatabaseConnection;
import set08103_cwk.DisplayFunctions;
import java.util.ArrayList;
import set08103_cwk.Application;


class MyTest
{
    DatabaseConnection dc = new DatabaseConnection();
    @Test
    void unitTestOutputEmptyCity()
    {
        ArrayList<City> output = new ArrayList<>();
        DisplayFunctions.displayCity(output);
    }//end unitTestOutputEmptyCity

    @Test
    void unitTestOutputEmptyCapitalCity()
    {
        ArrayList<CapitalCity> output = new ArrayList<>();
        DisplayFunctions.displayCapitalCity(output);
    }//end unitTestOutputEmptyCapitalCity

    @Test
    void unitTestOutputEmptyCountry()
    {
        ArrayList<Country> output = new ArrayList<>();
        DisplayFunctions.displayCountry(output);
    }//end unitTestOutputEmptyCapitalCity

    @Test
    void unitTestOutputEmptyPopulation()
    {
        ArrayList<Population> output = new ArrayList<>();
        DisplayFunctions.displayPopulationReport(output);
    }//end unitTestOutputEmptyCapitalCity

    @Test
    void unitTestOutputNotNullCity()
    {
        dc.connect();
        ArrayList<City> output = CityFunctions.getCity(dc.database());
        // Check employees is not null
        if (output == null)
        {
            System.out.println("");
        }

        dc.disconnect();

    }//end unitTestOutputNullCity

    @Test
    void unitTestOutputNotNullCapitalCity()
    {
        ArrayList<CapitalCity> output = new ArrayList<>();
        output.add(null);
        DisplayFunctions.displayCapitalCity(output);
    }//end unitTestOutputNullCapitalCity

    @Test
    void unitTestOutputNotNullCountry()
    {
        ArrayList<Country> output = new ArrayList<>();
        output.add(null);
        DisplayFunctions.displayCountry(output);
    }//end unitTestOutputNullCapitalCity

    @Test
    void unitTestOutputNotNullPopulation()
    {
        ArrayList<Population> output = new ArrayList<>();
        output.add(null);
        DisplayFunctions.displayPopulationReport(output);
    }//end unitTestOutputNullCapitalCity

}