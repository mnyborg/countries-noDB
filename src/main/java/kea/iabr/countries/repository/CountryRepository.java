package kea.iabr.countries.repository;

import kea.iabr.countries.model.Country;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CountryRepository {
    private final List<Country> countries = new ArrayList<>();

    public CountryRepository() {
        // Simulerede dataindsætninger – normalt ville disse komme fra databasen
        countries.add(new Country(1L, "Danmark"));
        countries.add(new Country(2L, "Sverige"));
        countries.add(new Country(3L, "Norge"));
        countries.add(new Country(4L, "Tyskland"));
        countries.add(new Country(4L, "Island"));
    }

    public List<Country> findAll() {
        return new ArrayList<>(countries); // Returnér en kopi for at undgå direkte ændringer
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void removeCountry(long id) {
        countries.removeIf(c -> c.getId() == id);
    }
}








