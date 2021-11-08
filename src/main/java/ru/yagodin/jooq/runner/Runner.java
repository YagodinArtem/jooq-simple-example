package ru.yagodin.jooq.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.yagodin.jooq.dto.CityDTO;
import ru.yagodin.jooq.repository.impl.CityRepository;
import ru.yagodin.jooq.repository.impl.CountryRepository;

import java.util.Date;

@Component
@RequiredArgsConstructor
@Slf4j
public class Runner implements CommandLineRunner {

    private final CityRepository cityRepository;
    private final CountryRepository countryRepository;

    @Override
    public void run(String... args) throws Exception {
//        log.debug(cityRepository.save(CityDTO.builder()
//                .title("Москва")
//                .country(1L)
//                .created(new Date())
//                .build()).toString());

//        log.debug(cityRepository.findAll().toString());

        log.debug(cityRepository.get("Moscow").toString());
        log.debug(cityRepository.get("Москва").toString());

        log.debug(countryRepository.find(1L).toString());
    }
}
