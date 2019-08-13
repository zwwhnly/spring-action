package chapter03.profile;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("dev")
public class DevDataSourceConfig {
    @Bean
    public DataSource devDataSource() {
        System.out.println("This is dev DataSource");

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis_action_db");
        basicDataSource.setUsername("dev");
        basicDataSource.setPassword("dev");

        return basicDataSource;
    }
}
