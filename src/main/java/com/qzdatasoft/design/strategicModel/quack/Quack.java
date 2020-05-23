package com.qzdatasoft.design.strategicModel.quack;

/**
 * <h3>design-pattern</h3>
 * <p>呱呱叫</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-15 20:51
 **/
public class Quack implements QuackBehavior {
    /**
     * 呱呱叫
     */
    public void quack() {
        // 实现鸭子呱呱叫
        System.out.println("Quack（呱呱声）");
    }
}
