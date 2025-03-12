//package com.spanner.spannerpoc;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.context.annotation.Bean;
//
//import javax.sql.DataSource;
//
//@Configurable
//public class SpannerConfiguration {
//
//    @Bean
//    public DataSource dataSource(DataSourceProperties dataSourceProperties) {
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl(dataSourceProperties.getUrl());
//        config.setDriverClassName(dataSourceProperties.getDriverClassName());
//        return new HikariDataSource(config);
//    }
//}
