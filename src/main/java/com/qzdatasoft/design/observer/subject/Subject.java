package com.qzdatasoft.design.observer.subject;

import com.qzdatasoft.design.observer.observer.Observer;

/**
 * <h3>design-pattern</h3>
 * <p>主题</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-25 22:07
 **/
public interface Subject {
    /**
     * 注册观察者
     *
     * @param o 观察者接口
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o 观察者接口
     */
    public void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    public void notifyObserver();
}
