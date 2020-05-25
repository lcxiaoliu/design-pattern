package com.qzdatasoft.design.observer.subject;

import com.qzdatasoft.design.observer.observer.Observer;

import java.util.ArrayList;

/**
 * <h3>design-pattern</h3>
 * <p>天气数据类</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-23 16:33
 **/
public class WeatherData implements Subject {
    /**
     * 观察者们
     */
    private ArrayList observers;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    /**
     * 构造器
     */
    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * 注册观察者
     *
     * @param o 观察者接口
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除观察者
     *
     * @param o 观察者接口
     */
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知观察者
     */
    public void notifyObserver() {
        for (int i=0;i<observers.size();i++){
            Observer o = (Observer) observers.get(i);
            o.update(temperature,humidity ,pressure );
        }
    }

    /**
     * 设置测量值
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    /**
     * 测量值改变时
     */
    private void measurementsChanged() {
        this.notifyObserver();
    }
}
