package com.qzdatasoft.design.strategicModel.bean;

import com.qzdatasoft.design.strategicModel.fly.FlyWithWings;
import com.qzdatasoft.design.strategicModel.quack.Quack;

/**
 * <h3>design-pattern</h3>
 * <p>绿头鸭</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-15 22:22
 **/
public class MallardDuck extends Duck{
    /**
     * 构造器
     */
    public MallardDuck() {
        // 默认呱呱叫
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
