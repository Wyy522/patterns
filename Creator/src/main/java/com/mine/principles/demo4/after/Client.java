package com.mine.principles.demo4.after;

import com.mine.principles.demo4.before.MineSafetyDoor;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 */
public class Client {
    public static void main(String[] args) {
        //创建黑马安全门对象
        MineSafetyDoor door = new MineSafetyDoor();
        //调用功能
        door.antiTheft();
        door.fireProof();
        door.waterProof();

        System.out.println("============");
        //创建传智安全门对象
        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        //调用功能
        door1.antiTheft();
        door1.fireproof();
    }
}
