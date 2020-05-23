package com.qzdatasoft.design.strategic.fly;

/**
 * <h3>design-pattern</h3>
 * <p>火箭动力飞行</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-23 14:31
 **/
public class FlyRocketPowered implements FlyBehavior{
    /**
     * 飞行行为
     */
    public void fly() {
        System.out.println("I'm flying with a rocket!（我用火箭飞行！）");
    }
}
