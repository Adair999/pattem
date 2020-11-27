package com.txw.domain;

import com.txw.skill.ISkill;
/**
 * 英雄类(抽象类)
 */
@SuppressWarnings("all")   //警告的注解
public abstract class Hero {
    private String heroName;    //英雄名称
    // 英雄的召唤师技能的接口(组合关系，需要使用时，需要传入一个具体技能对象)
    private ISkill iSkill;
    //加入一个新英雄，置英雄单次攻击伤害值
    private int heroHurt;
    public abstract void display();  //英雄的自我介绍的方法
    public abstract void normalAttack();   //英雄的普通攻击的方法
    //英雄的召唤师技能的使用方法
    public void skill(){
        iSkill.useSkill();  //调用useSkill()方法
    }
    //set\get的方法
    public String getHeroName() {
        return heroName;
    }
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    public void setiSkill(ISkill iSkill) {
        this.iSkill = iSkill;
    }
    public int getHeroHurt() {
        return heroHurt;
    }
    public void setHeroHurt(int heroHurt) {
        this.heroHurt = heroHurt;
    }
}