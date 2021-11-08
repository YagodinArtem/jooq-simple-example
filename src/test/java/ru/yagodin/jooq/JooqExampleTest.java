package ru.yagodin.jooq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.yagodin.jooq.repository.impl.CountryRepository;


@SpringBootTest
public class JooqExampleTest {

    @Autowired
    private CountryRepository countryRepository;

    @Test
    void find_all_unit_test(){
        //todo
    }
}
