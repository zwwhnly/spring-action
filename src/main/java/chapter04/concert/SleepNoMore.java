package chapter04.concert;

import org.springframework.stereotype.Component;

/**
 * 戏剧:《不眠之夜Sleep No More》
 */
@Component
public class SleepNoMore implements Performance {
    @Override
    public void perform() {
        //int number = 3 / 0;
        System.out.println("戏剧《不眠之夜Sleep No More》");
    }
}
