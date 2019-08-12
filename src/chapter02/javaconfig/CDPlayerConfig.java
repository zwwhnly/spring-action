package chapter02.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
    @Bean
    //@Bean(name = "lonelyHeartsClub")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    /*@Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }*/

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
