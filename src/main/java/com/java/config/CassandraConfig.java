package com.java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages = "com.java.repository")
public class CassandraConfig extends AbstractCassandraConfiguration {

    public static final String KEYSPACE = "javasampleapproach";

    @Override
    protected String getKeyspaceName() { //This is only method which is abstract in Abstra... , any we need to provide implementation.
        return KEYSPACE;
    }


}
