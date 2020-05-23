package com.qzdatasoft.design.strategic.fly;

/**
 * <h3>design-pattern</h3>
 * <p>展翅飞翔</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-15 20:43
 **/
public class FlyWithWings implements FlyBehavior {
    /**
     * 飞行
     */
    public void fly() {
        // 实现鸭子行为,我在飞！！
        System.out.println("I'm flying!!（我在飞！！）");
    }
}
