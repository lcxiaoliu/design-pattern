package com.qzdatasoft.design.strategic.bean;

import com.qzdatasoft.design.strategic.fly.FlyWithWings;
import com.qzdatasoft.design.strategic.quack.Quack;

/**
 * <h3>design-pattern</h3>
 * <p>绿头鸭</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-15 22:22
 **/
public class MallardDuck extends BaseDuck {
    /**
     * 构造器
     */
    public MallardDuck() {
        // 默认呱呱叫
        super();
        quackBehavior = new Quack();
        // 默认会飞
        flyBehavior = new FlyWithWings();
    }


    /**
     * 展示
     */
    @Override
    public void display(){
        // 我是一只真正的绿头鸭
        System.out.println("I'm a real mallard duck（我是一只真正的绿头鸭）");
    }
}
