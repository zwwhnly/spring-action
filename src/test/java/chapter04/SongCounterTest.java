package chapter04;

import chapter04.soundsystem.CompactDisc;
import chapter04.soundsystem.SongCounter;
import chapter04.soundsystem.SongCounterConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SongCounterConfig.class)
public class SongCounterTest {
    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private SongCounter songCounter;

    @Test
    public void testSongCounter() {
        compactDisc.play(1);

        compactDisc.play(2);

        compactDisc.play(3);
        compactDisc.play(3);
        compactDisc.play(3);
        compactDisc.play(3);

        compactDisc.play(5);
        compactDisc.play(5);

        assertEquals(1, songCounter.getPlayCount(1));
        assertEquals(1, songCounter.getPlayCount(2));

        assertEquals(4, songCounter.getPlayCount(3));

        assertEquals(0, songCounter.getPlayCount(4));

        assertEquals(2, songCounter.getPlayCount(5));
    }
}
