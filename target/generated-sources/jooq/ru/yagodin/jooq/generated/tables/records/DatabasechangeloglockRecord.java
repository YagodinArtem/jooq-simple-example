/*
 * This file is generated by jOOQ.
 */
package ru.yagodin.jooq.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.yagodin.jooq.generated.tables.Databasechangeloglock;


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
public class DatabasechangeloglockRecord extends UpdatableRecordImpl<DatabasechangeloglockRecord> implements Record4<Integer, Boolean, Timestamp, String> {

    private static final long serialVersionUID = 693082596;

    /**
     * Setter for <code>example.databasechangeloglock.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>example.databasechangeloglock.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>example.databasechangeloglock.locked</code>.
     */
    public void setLocked(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>example.databasechangeloglock.locked</code>.
     */
    public Boolean getLocked() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>example.databasechangeloglock.lockgranted</code>.
     */
    public void setLockgranted(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>example.databasechangeloglock.lockgranted</code>.
     */
    public Timestamp getLockgranted() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>example.databasechangeloglock.lockedby</code>.
     */
    public void setLockedby(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>example.databasechangeloglock.lockedby</code>.
     */
    public String getLockedby() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Boolean, Timestamp, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Boolean, Timestamp, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.ID;
    }

    @Override
    public Field<Boolean> field2() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKED;
    }

    @Override
    public Field<Timestamp> field3() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKGRANTED;
    }

    @Override
    public Field<String> field4() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKEDBY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Boolean component2() {
        return getLocked();
    }

    @Override
    public Timestamp component3() {
        return getLockgranted();
    }

    @Override
    public String component4() {
        return getLockedby();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Boolean value2() {
        return getLocked();
    }

    @Override
    public Timestamp value3() {
        return getLockgranted();
    }

    @Override
    public String value4() {
        return getLockedby();
    }

    @Override
    public DatabasechangeloglockRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DatabasechangeloglockRecord value2(Boolean value) {
        setLocked(value);
        return this;
    }

    @Override
    public DatabasechangeloglockRecord value3(Timestamp value) {
        setLockgranted(value);
        return this;
    }

    @Override
    public DatabasechangeloglockRecord value4(String value) {
        setLockedby(value);
        return this;
    }

    @Override
    public DatabasechangeloglockRecord values(Integer value1, Boolean value2, Timestamp value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DatabasechangeloglockRecord
     */
    public DatabasechangeloglockRecord() {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK);
    }

    /**
     * Create a detached, initialised DatabasechangeloglockRecord
     */
    public DatabasechangeloglockRecord(Integer id, Boolean locked, Timestamp lockgranted, String lockedby) {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK);

        set(0, id);
        set(1, locked);
        set(2, lockgranted);
        set(3, lockedby);
    }
}
