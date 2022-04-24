package com.mine.pattern.bridge;

/**
 * @version v1.0
 * @ClassName: VideoFile
 * @Description: 视频文件(实现化角色)
 */
public interface VideoFile {

    //解码功能
    void decode(String fileName);
}
