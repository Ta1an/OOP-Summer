import java.util.Arrays;

public class Continent {
    private String name;
    private Country[] countries = new Country[50];
    private int countryCount = 0;

    public Continent(String name) {
        this.name = name;
    }

    public Continent() {
        this.name = "Kazakhstan";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country[] getCountries() {
        return countries;
    }

    public void setCountries(Country[] countries) {
        this.countries = countries;
    }

    int totalCountries() {
        return countryCount;
    }

    public void addCountry(Country country) {
        countries[countryCount] = country;
        countryCount++;
    }

    public double getTotalInComeOfAllResorts() {
        double total = 0;
        for (int i = 0; i < countryCount; i++) {
            total += countries[i].getTotalInCome();
        }
        return total;
    }

    public Country getTheMostProfitableCountry() {
        Country mostProfitableCountry = new Country();
        for (int i = 0; i < countryCount; i++) {
            if (mostProfitableCountry.getTotalInCome() < countries[i].getTotalInCome()) {
                mostProfitableCountry = countries[i];
            }
        }
        return mostProfitableCountry;
    }
}
