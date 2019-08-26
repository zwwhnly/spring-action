package chapter04.soundsystem;

import java.util.List;

/**
 * 空白光盘
 */
public class BlankDisc implements CompactDisc {
    /**
     * 唱片名称
     */
    private String title;

    /**
     * 艺术家
     */
    private String artist;

    /**
     * 唱片包含的歌曲集合
     */
    private List<String> songs;

    public BlankDisc(String title, String artist, List<String> songs) {
        this.title = title;
        this.artist = artist;
        this.songs = songs;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String song : songs) {
            System.out.println("-Song:" + song);
        }
    }

    /**
     * 播放某首歌曲
     *
     * @param songNumber
     */
    @Override
    public void play(int songNumber) {
        System.out.println("Play Song:" + songs.get(songNumber - 1));
    }
}
