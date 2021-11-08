/*
 * This file is generated by jOOQ.
 */
package ru.yagodin.jooq.generated;


import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import ru.yagodin.jooq.generated.tables.City;
import ru.yagodin.jooq.generated.tables.Country;
import ru.yagodin.jooq.generated.tables.Databasechangeloglock;


/**
 * A class modelling indexes of tables of the <code>example</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CITY_PKEY = Indexes0.CITY_PKEY;
    public static final Index COUNTRY_PKEY = Indexes0.COUNTRY_PKEY;
    public static final Index DATABASECHANGELOGLOCK_PKEY = Indexes0.DATABASECHANGELOGLOCK_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CITY_PKEY = Internal.createIndex("city_pkey", City.CITY, new OrderField[] { City.CITY.ID }, true);
        public static Index COUNTRY_PKEY = Internal.createIndex("country_pkey", Country.COUNTRY, new OrderField[] { Country.COUNTRY.ID }, true);
        public static Index DATABASECHANGELOGLOCK_PKEY = Internal.createIndex("databasechangeloglock_pkey", Databasechangeloglock.DATABASECHANGELOGLOCK, new OrderField[] { Databasechangeloglock.DATABASECHANGELOGLOCK.ID }, true);
    }
}
