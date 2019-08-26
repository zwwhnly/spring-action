package chapter05.web;

import chapter05.data.SpittleRepository;
import chapter05.model.Spittle;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpittleControllerTest {
    @Test
    public void shouldShowRecentSpittles() {
        List<Spittle> expectedSpittles = createSpittleList(20);
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }

        return spittles;
    }
}
