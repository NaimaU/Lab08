package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    /**
     * this adds a city object to the list
     * the second phase, you can add the city
     * @param city
     */
    public void addCity(City city) {
        cities.add(city);
    }

    public int getCount(){
        return cities.size();
    }

    public List<City> getCities() {
        return cities;
    }

    // Will be implemented later using TDD (leave blank for now)
    public boolean hasCity(City city) {
            return cities.contains(city);
    }

    /**
     * Checks if a city is present in the list. If it is, then remove it from the list.
     * If not, then throw an exception.
     * @param city
     *      This is a candidate city to delete
     */
    public void delete(City city) {
        if (!(cities.remove(city))) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Counts number of cities in cityList.
     * @return
     *      Return count of cities in cityList.
     */
    public int countCities() {
        return cities.size();
    }

}

