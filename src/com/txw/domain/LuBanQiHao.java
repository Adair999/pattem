package com.txw.domain;

/*
 * 英雄 （鲁班七号）
 */
public class LuBanQiHao extends Hero {
    //构造方法
    public LuBanQiHao(){
        super.setHeroName("鲁班七号");
    }
    //英雄的自我介绍
    @Override
    public void display() {
        System.out.println("鲁班七号, 智商二百五");

    }
    //英雄的普通攻击
    @Override
    public void normalAttack() {
        System.out.println("dadada... 被动： 集中火力");

    }
}