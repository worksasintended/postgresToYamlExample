package domain;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private List<City> cities = new ArrayList<City>();
    private City capital;
    private String name;

    @Override
    public boolean equals(Object obj) {
        boolean equal = this.name.equals(((Country) obj).name);
        return equal;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public void addCity(City city) {
        this.cities.add(city);
    }

    public void removeCity(City city) {
        this.cities.remove(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
}
