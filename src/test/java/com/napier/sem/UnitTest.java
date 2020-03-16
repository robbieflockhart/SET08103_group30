package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import set08103_cwk.*;
import set08103_cwk.Classes.CapitalCity;
import set08103_cwk.Classes.City;

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
    void printCityFunctionTest2()
    {
        ArrayList<City> unitTestCity = city.getCityContAsia(dc.database());
        disp.displayCity(unitTestCity);
    }
}
