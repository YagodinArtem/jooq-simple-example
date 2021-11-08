package ru.yagodin.jooq.repository.impl;

import lombok.RequiredArgsConstructor;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import ru.yagodin.jooq.dto.CountryDTO;
import ru.yagodin.jooq.generated.tables.City;
import ru.yagodin.jooq.generated.tables.Country;
import ru.yagodin.jooq.repository.CrudRepository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CountryRepository implements CrudRepository<CountryDTO> {

    private final DSLContext dsl;
    private final CityRepository cityRepository;

    @Override
    public CountryDTO save(CountryDTO countryDTO) {
        return null;
    }

    @Override
    public CountryDTO get(String title) {
        return null;
    }

    public CountryDTO find(Long id) {
        return dsl.selectFrom(Country.COUNTRY)
                .where(Country.COUNTRY.ID.eq(id))
                .fetchAny()
                .map(this::getCountryDTO);
    }

    @Override
    public List<CountryDTO> findAll(Condition condition) {
        return null;
    }

    private CountryDTO getCountryDTO(org.jooq.Record r) {
        CountryDTO country = r.into(CountryDTO.class);
        country.setCities(cityRepository.findAll(City.CITY.COUNTRY.eq(country.getId())));
        return country;
    }
}
