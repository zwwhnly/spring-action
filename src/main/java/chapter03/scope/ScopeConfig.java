package chapter03.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("chapter03.scope")
public class ScopeConfig {

    /*@Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DemoPrototypeService demoPrototypeService() {
        return new DemoPrototypeService();
    }*/
}
