package com.mine.principles.demo4.before;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 */
public class Client {
    public static void main(String[] args) {
        MineSafetyDoor door = new MineSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
