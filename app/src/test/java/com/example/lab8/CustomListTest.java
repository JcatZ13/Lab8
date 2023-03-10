package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.Before;
import org.junit.Before;
//import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cityList = new ArrayList<>();

    @Test
    public void testAddCity(){
        CustomList list = new CustomList(null, cityList);
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(1, list.getCount());
    }
    @Test
    public void testHasCity(){
        CustomList list = new CustomList(null, cityList);
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }
    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList(null, cityList);
        City city1 = new City("Edmonton", "AB");
        City city2 = new City("Calgary", "AB");
        list.addCity(city1);
        list.addCity(city2);
        list.deleteCity(city1);
        assertEquals(1, list.getCount());
        assertFalse(list.hasCity(city1));
    }





}
