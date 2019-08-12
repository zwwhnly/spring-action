package chapter02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    //@Inject
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    /*@Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Autowired
    public void insertDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }*/

    @Override
    public void play() {
        compactDisc.play();
    }
}
