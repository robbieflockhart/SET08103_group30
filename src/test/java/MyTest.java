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
        System.out.println("City Empty");
    }//end unitTestOutputEmptyCity

    @Test
    void unitTestOutputEmptyCapitalCity()
    {
        ArrayList<CapitalCity> output = new ArrayList<>();
        DisplayFunctions.displayCapitalCity(output);
        System.out.println("Capital City Empty");
    }//end unitTestOutputEmptyCapitalCity

    @Test
    void unitTestOutputEmptyCountry()
    {
        ArrayList<Country> output = new ArrayList<>();
        DisplayFunctions.displayCountry(output);
        System.out.println("Country Empty");
    }//end unitTestOutputEmptyCapitalCity

    @Test
    void unitTestOutputEmptyPopulation()
    {
        ArrayList<Population> output = new ArrayList<>();
        DisplayFunctions.displayPopulationReport(output);
        System.out.println("Population Empty");
    }//end unitTestOutputEmptyCapitalCity
    
}