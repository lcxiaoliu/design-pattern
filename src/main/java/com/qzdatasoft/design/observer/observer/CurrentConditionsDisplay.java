package com.qzdatasoft.design.observer.observer;

import com.qzdatasoft.design.observer.subject.Subject;

/**
 * <h3>design-pattern</h3>
 * <p>当前条件展示</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-25 22:52
 **/
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气象数据(主题)
     */
    private Subject weatherData;

    /**
     * 构造器
     * @param weatherData 气象数据(主题)
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        // 把主题赋予观察者
        this.weatherData = weatherData;
        // 为主题注册观察者
        weatherData.registerObserver(this);
    }

    /**
     * 显示方法
     */
    public void display() {
        System.out.println("Current conditions：" + temperature
                + "F degree and " + humidity + "% humidity" +
                "(当前条件：" + temperature + "华氏度和" + humidity + "%湿度)");
    }

    /**
     * 更新方法
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }
}
