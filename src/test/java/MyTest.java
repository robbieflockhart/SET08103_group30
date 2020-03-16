import org.junit.jupiter.api.Test;
import set08103_cwk.Classes.CapitalCity;
import set08103_cwk.Classes.City;
import set08103_cwk.Classes.Country;
import set08103_cwk.Classes.Population;
import set08103_cwk.DisplayFunctions;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MyTest
{
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

}