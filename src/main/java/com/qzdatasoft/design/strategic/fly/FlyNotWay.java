package com.qzdatasoft.design.strategic.fly;

/**
 * <h3>design-pattern</h3>
 * <p>不飞翔</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-15 20:46
 **/
public class FlyNotWay implements FlyBehavior {
    /**
     * 飞翔
     */
    public void fly() {
        // 什么都不做，不会飞
        System.out.println("I'm can't fly（我不能飞）");
    }
}
