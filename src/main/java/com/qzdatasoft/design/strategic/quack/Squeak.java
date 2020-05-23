package com.qzdatasoft.design.strategic.quack;

/**
 * <h3>design-pattern</h3>
 * <p>吱吱声</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-15 20:55
 **/
public class Squeak implements QuackBehavior {
    /**
     *  吱吱叫
     */
    public void quack() {
        // 橡皮鸭子吱吱叫
        System.out.println("Squeak（吱吱声）");
    }
}
