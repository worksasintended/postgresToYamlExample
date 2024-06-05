package domain;

public class City {
    private String name;
    private Country country;
    private boolean isCapital;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        if (this.country != null) {
            country.removeCity(this);
        }
        this.country = country;
        country.addCity(this);
    }
}
