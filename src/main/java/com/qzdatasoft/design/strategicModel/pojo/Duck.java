package com.qzdatasoft.design.strategicModel.pojo;

import com.qzdatasoft.design.strategicModel.fly.FlyBehavior;
import com.qzdatasoft.design.strategicModel.quack.QuackBehavior;

/**
 * <h3>design-pattern</h3>
 * <p>鸭子</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-15 21:04
 **/
public abstract class Duck {
    /**
     * 行为变量被声明为行为“接口”类型
     * 飞行行为
     */
    FlyBehavior flyBehavior;
    /**
     * 呱呱叫行为
     */
    QuackBehavior quackBehavior;

    /**
     * 构造器
     */
    public Duck() {
    }

    /**
     * 游动方法
     */
    public void swim(){
        // 所有的鸭子都会浮起来，甚至是假的鸭子！
        System.out.println("All ducks float,even decoys!（所有的鸭子都会浮起来，甚至是假的鸭子！）");
    }

    /**
     * 抽象的展示方法
     */
    public abstract void display();

    /**
     * 执行呱呱叫行为
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     * 执行飞行行为
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 设置飞行行为
     * @param fb
     */
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    /**
     * 设置呱呱叫行为
     * @param qb
     */
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
