package com.howtodoinjava.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
//@Profile("development")
public class DevelopmentDataSourceConfiguration {

//    @Profile("dev")
//    @Bean
//    public DataSource embeddedDataSource() {
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("classpath:schema.sql")
//                .addScript("classpath:test-data.sql")
//                .build();
//    }

//    @Profile("qa")
//    @Bean
//    public DataSource dataSourceQqqqqQwww() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.h2.Driver");
////        dataSource.setUrl("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
////        dataSource.setUrl("jdbc:h2:~/mydbInHomeDir;DB_CLOSE_DELAY=-1;AUTO_SERVER=TRUE");
//        dataSource.setUrl("jdbc:h2:~/h2_db/dev_db;DB_CLOSE_DELAY=-1;AUTO_SERVER=TRUE");
//        dataSource.setUsername("pogodynka_user");
//        dataSource.setPassword("pogodynka_user");
//        return dataSource;
//    }

    @Profile("dev")
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db");
        dataSource.setUsername("user");
        dataSource.setPassword("password");
        return dataSource;
    }


}