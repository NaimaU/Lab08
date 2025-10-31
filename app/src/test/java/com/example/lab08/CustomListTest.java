package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
// This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testDelete() {
        CustomList cityList = new CustomList();
        assertEquals(0, cityList.getCities().size());

        City city = new City("Regina", "Saskatchewan");
        cityList.addCity(city);
        assertEquals(1, cityList.getCities().size());

        cityList.delete(city);
        assertEquals(0, cityList.getCities().size());

        // throw an exception if a city deleted is not in the list
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city);
        });
    }

    @Test
    void testCountCities() {
        CustomList cityList = new CustomList();
        assertEquals(0, cityList.countCities());

        // Create a city object
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.addCity(city);
        assertEquals(1, cityList.countCities());

        // delete said city object
        cityList.delete(city);
        assertEquals(0, cityList.countCities());
    }
}
