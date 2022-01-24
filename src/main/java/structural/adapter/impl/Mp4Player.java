package structural.adapter.impl;

import structural.adapter.service.AdvancedMediaPlayer;

/**
 * 创建实现了 AdvancedMediaPlayer 接口的实体类。
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

}
