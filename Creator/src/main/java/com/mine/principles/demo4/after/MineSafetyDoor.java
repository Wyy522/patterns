package com.mine.principles.demo4.after;

/**
 * @version v1.0
 * @ClassName: HeiMaSafetyDoor
 * @Description: TODO(一句话描述该类的功能)
 */
public class MineSafetyDoor implements AntiTheft,Fireproof,Waterproof {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireproof() {
        System.out.println("防火");
    }

    public void waterproof() {
        System.out.println("防水");
    }
}
