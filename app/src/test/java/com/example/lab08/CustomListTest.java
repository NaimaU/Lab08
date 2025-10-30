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
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());

        cityList.delete(city);
        assertEquals(1, cityList.getCities().size());

        // throw an exception if a city deleted is not in the list
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city);
        });
    }

//    @Test
//    void testCountCities() {
//        CityList cityList = mockCityList();
//        assertEquals(1, cityList.countCities());
//
//        // Create another city object
//        City city = new City("Charlottetown", "Prince Edward Island");
//        cityList.add(city);
//        assertEquals(2, cityList.countCities());
//
//        // delete said city object
//        cityList.delete(city);
//        assertEquals(1, cityList.countCities());
//    }
}

}