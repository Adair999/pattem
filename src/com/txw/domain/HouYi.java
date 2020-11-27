package com.txw.domain;

/**
 * 英雄后羿
 */
public class HouYi extends Hero {
    //编写构造方法
    public HouYi(){
        super.setHeroName("后羿");
    }
    //后羿英雄的自我介绍
    @Override
    public void display() {
        System.out.println("觉醒吧，猎杀时刻！");
    }
    //后羿英雄的普通攻击
    @Override
    public void normalAttack() {
        System.out.println("xiuxiuxiu...被动：迟缓之箭");
    }
}