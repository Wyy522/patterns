package com.mine.principles.demo4.before;

/**
 * @version v1.0
 * @ClassName: HeimaSafetyDoor
 * @Description: 我的品牌的安全门
 */
public class MineSafetyDoor implements SafetyDoor {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireProof() {
        System.out.println("防火");
    }

    public void waterProof() {
        System.out.println("防水");
    }
}
