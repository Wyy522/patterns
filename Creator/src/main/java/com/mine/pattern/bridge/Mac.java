package com.mine.pattern.bridge;

/**
 * @version v1.0
 * @ClassName: Mac
 * @Description: Mac操作系统(扩展抽象化角色)
 */
public class Mac extends OpratingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
