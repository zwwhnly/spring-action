package chapter03.profile;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        System.out.println("This is dev DataSource");

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis_action_db");
        basicDataSource.setUsername("dev");
        basicDataSource.setPassword("dev");

        return basicDataSource;
    }

    @Bean
    @Profile("qa")
    public DataSource qaDataSource() {
        System.out.println("This is qa DataSource");

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3307/mybatis_action_db");
        basicDataSource.setUsername("qa");
        basicDataSource.setPassword("qa");

        return basicDataSource;
    }

    @Bean
    @Profile("prod")
    public DataSource prodDataSource() {
        System.out.println("This is prod DataSource");

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3308/mybatis_action_db");
        basicDataSource.setUsername("prod");
        basicDataSource.setPassword("prod");

        return basicDataSource;
    }
}
