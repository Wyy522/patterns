package com.mine.principles.demo4.after;

/**
 * @version v1.0
 * @ClassName: ItcastSafetyDoor
 * @Description: 安全门
 */
public class ItcastSafetyDoor implements AntiTheft,Fireproof {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireproof() {
        System.out.println("防火");
    }
}
