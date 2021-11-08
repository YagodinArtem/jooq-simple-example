/*
 * This file is generated by jOOQ.
 */
package ru.yagodin.jooq.generated.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.yagodin.jooq.generated.Example;
import ru.yagodin.jooq.generated.Indexes;
import ru.yagodin.jooq.generated.Keys;
import ru.yagodin.jooq.generated.tables.records.CountryRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Country extends TableImpl<CountryRecord> {

    private static final long serialVersionUID = 850838529;

    /**
     * The reference instance of <code>example.country</code>
     */
    public static final Country COUNTRY = new Country();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryRecord> getRecordType() {
        return CountryRecord.class;
    }

    /**
     * The column <code>example.country.id</code>.
     */
    public final TableField<CountryRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>example.country.title</code>.
     */
    public final TableField<CountryRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>example.country.created</code>.
     */
    public final TableField<CountryRecord, Timestamp> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>example.country</code> table reference
     */
    public Country() {
        this(DSL.name("country"), null);
    }

    /**
     * Create an aliased <code>example.country</code> table reference
     */
    public Country(String alias) {
        this(DSL.name(alias), COUNTRY);
    }

    /**
     * Create an aliased <code>example.country</code> table reference
     */
    public Country(Name alias) {
        this(alias, COUNTRY);
    }

    private Country(Name alias, Table<CountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Country(Name alias, Table<CountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Country(Table<O> child, ForeignKey<O, CountryRecord> key) {
        super(child, key, COUNTRY);
    }

    @Override
    public Schema getSchema() {
        return Example.EXAMPLE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COUNTRY_PKEY);
    }

    @Override
    public UniqueKey<CountryRecord> getPrimaryKey() {
        return Keys.COUNTRY_PKEY;
    }

    @Override
    public List<UniqueKey<CountryRecord>> getKeys() {
        return Arrays.<UniqueKey<CountryRecord>>asList(Keys.COUNTRY_PKEY);
    }

    @Override
    public Country as(String alias) {
        return new Country(DSL.name(alias), this);
    }

    @Override
    public Country as(Name alias) {
        return new Country(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(String name) {
        return new Country(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(Name name) {
        return new Country(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
