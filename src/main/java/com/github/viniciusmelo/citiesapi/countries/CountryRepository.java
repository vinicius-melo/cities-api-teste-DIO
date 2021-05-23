package com.github.viniciusmelo.citiesapi.countries;

import com.github.viniciusmelo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
