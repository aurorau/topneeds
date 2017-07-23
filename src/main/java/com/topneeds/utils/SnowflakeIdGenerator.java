package com.topneeds.utils;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import java.io.Serializable;

/**
 * Created by Iroshan on 7/23/2017.
 */
public class SnowflakeIdGenerator implements IdentifierGenerator {
    private Snowflake snowflake = new Snowflake();
    public SnowflakeIdGenerator() {}

    public Serializable generate(SessionImplementor session, Object object) throws HibernateException {return Long.valueOf(this.snowflake.newId());}
}
