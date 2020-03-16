package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import set08103_cwk.*;
import set08103_cwk.Classes.CapitalCity;
import set08103_cwk.Classes.City;
import set08103_cwk.Classes.Country;
import set08103_cwk.Classes.Population;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    static DisplayFunctions disp;
    static DatabaseConnection dc;
    static CityFunctions city;
    static CapitalCityFunctions capitalCity;
    static PopulationFunctions popFuncs;

    @BeforeAll
    static void init()
    {
        disp = new DisplayFunctions();
        dc =  new DatabaseConnection();
        city = new CityFunctions();
        capitalCity = new CapitalCityFunctions();
        popFuncs = new PopulationFunctions();
    }

    @Test
    void unitTestOutputEmptyCity()
    {
        ArrayList<City> output = new ArrayList<>();
        disp.displayCity(output);
        System.out.println("City Empty");
    }//end unitTestOutputEmptyCity

    @Test
    void unitTestOutputEmptyCapitalCity()
    {
        ArrayList<CapitalCity> output = new ArrayList<>();
        disp.displayCapitalCity(output);
        System.out.println("Capital City Empty");
    }//end unitTestOutputEmptyCapitalCity

    @Test
    void unitTestOutputEmptyCountry()
    {
        ArrayList<Country> output = new ArrayList<>();
        disp.displayCountry(output);
        System.out.println("Country Empty");
    }//end unitTestOutputEmptyCapitalCity

    @Test
    void unitTestOutputEmptyPopulation()
    {
        ArrayList<Population> output = new ArrayList<>();
        disp.displayPopulationReport(output);
        System.out.println("Population Empty");
    }//end unitTestOutputEmptyCapitalCity

    @Test
    void printCityFunctionTest1()
    {
        ArrayList<City> unitTestCity = new ArrayList<>();
        City cityTest = new City();
        cityTest.setName("Kabul");
        cityTest.setCountry("Afghanistan");
        cityTest.setDistrict("Kabol");
        cityTest.setPopulation(1780000);
        unitTestCity.add(cityTest);
        disp.displayCity(unitTestCity);
    }

    @Test
    void printCaptialCityFunctionTest()
    {
        ArrayList<CapitalCity> unitTestCapitalCity = new ArrayList<>();
        CapitalCity cityTest = new CapitalCity();
        cityTest.setName("Kabul");
        cityTest.setCountry("Afghanistan");
        cityTest.setPopulation(1780000);
        unitTestCapitalCity .add(cityTest);
        disp.displayCapitalCity(unitTestCapitalCity);
    }
}
