package chapter04.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class SongCounterConfig {
    @Bean
    public CompactDisc yehuimei() {
        List<String> songs = new ArrayList<>();
        songs.add("东风破");
        songs.add("以父之名");
        songs.add("晴天");
        songs.add("三年二班");
        songs.add("你听得到");

        BlankDisc blankDisc = new BlankDisc("叶惠美", "周杰伦", songs);
        return blankDisc;
    }

    @Bean
    public SongCounter songCounter() {
        return new SongCounter();
    }
}
