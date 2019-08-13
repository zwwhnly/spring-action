package chapter03.profile;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("qa")
public class QADataSourceConfig {
    @Bean
    public DataSource qaDataSource() {
        System.out.println("This is qa DataSource");

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3307/mybatis_action_db");
        basicDataSource.setUsername("qa");
        basicDataSource.setPassword("qa");

        return basicDataSource;
    }
}
