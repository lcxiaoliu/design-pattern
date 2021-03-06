package com.qzdatasoft.design.strategic.duck;

import com.qzdatasoft.design.strategic.behavior.fly.FlyNotWay;
import com.qzdatasoft.design.strategic.behavior.quack.Quack;

/**
 * <h3>design-pattern</h3>
 * <p>模型鸭</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-23 14:21
 **/
public class ModelDuck extends BaseDuck {
    /**
     * 构造函数
     */
    public ModelDuck() {
        // 默认不会飞
        super();
        flyBehavior = new FlyNotWay();
        // 默认呱呱叫
        quackBehavior = new Quack();
    }

    /**
     * 展示
     */
    @Override
    public void display() {
        // 我是一只模型鸭
        System.out.println("I'm a model duck（我是一只模型鸭）");
    }
}
