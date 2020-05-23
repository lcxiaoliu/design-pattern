package com.qzdatasoft.design.strategicModel.quack;

/**
 * <h3>design-pattern</h3>
 * <p>消声</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-15 20:59
 **/
public class MuteQuack implements QuackBehavior {
    /**
     * 不会叫
     */
    public void quack() {
        // 什么都不做，不会叫
        System.out.println("<<Silence（无声）>>");
    }
}
