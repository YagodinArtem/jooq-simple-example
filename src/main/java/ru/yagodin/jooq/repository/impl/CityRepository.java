package ru.yagodin.jooq.repository.impl;

import lombok.RequiredArgsConstructor;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import org.springframework.stereotype.Repository;
import ru.yagodin.jooq.dto.CityDTO;
import ru.yagodin.jooq.generated.tables.City;
import ru.yagodin.jooq.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CityRepository implements CrudRepository<CityDTO> {

    private final DSLContext dsl;

    @Override
    public CityDTO save(CityDTO cityDTO) {
        return dsl.insertInto(City.CITY)
                .set(dsl.newRecord(City.CITY, cityDTO))
                .returning()
                .fetchOptional()
                .orElseThrow(() -> new DataAccessException("Error when saving city"))
                .into(CityDTO.class);
    }

    @Override
    public CityDTO get(String title) {

        if (dsl.fetchExists(dsl.selectFrom(City.CITY).where(City.CITY.TITLE.eq(title)))) {
            return dsl.selectFrom(City.CITY)
                    .where(City.CITY.TITLE.eq(title))
                    .fetchAny()
                    .into(CityDTO.class);
        }
        return new CityDTO();

    }

    @Override
    public List<CityDTO> findAll(Condition condition) {
        return new ArrayList<>(
                dsl
                        .selectFrom(City.CITY)
                        .where(condition)
                        .fetchInto(CityDTO.class));
    }
}
