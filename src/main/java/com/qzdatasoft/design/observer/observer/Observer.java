package com.qzdatasoft.design.observer.observer;

/**
 * <h3>design-pattern</h3>
 * <p>观察者</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-25 22:09
 **/
public interface Observer {
    /**
     * 更新方法
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temp,float humidity,float pressure);
}
