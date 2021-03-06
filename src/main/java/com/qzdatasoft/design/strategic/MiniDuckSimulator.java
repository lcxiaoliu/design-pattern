package com.qzdatasoft.design.strategic;

import com.qzdatasoft.design.strategic.duck.BaseDuck;
import com.qzdatasoft.design.strategic.behavior.fly.FlyRocketPowered;
import com.qzdatasoft.design.strategic.duck.MallardDuck;
import com.qzdatasoft.design.strategic.duck.ModelDuck;

/**
 * <h3>design-pattern</h3>
 * <p>小型模拟机-策略模式</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-15 23:22
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        // 绿头鸭
        BaseDuck duck = new MallardDuck();
        // 执行叫的行为
        duck.performQuack();
        // 执行飞的行为
        duck.performFly();

        // 模型鸭
        BaseDuck model = new ModelDuck();
        // 执行叫的行为
        model.performFly();
        // 设置飞行行为
        model.setFlyBehavior(new FlyRocketPowered());
        // 执行飞的行为
        model.performFly();
    }
}
