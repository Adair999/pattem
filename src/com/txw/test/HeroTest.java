package com.txw.test;

import com.txw.domain.Hero;
import com.txw.domain.HouYi;
import com.txw.skill.impl.Jipao;
import com.txw.skill.impl.KuangBao;
/**
 * 英雄与技能的测试类
 */
public class HeroTest {
    public static void main(String[] args) {
        //1.选择英雄
        Hero hero = new HouYi();
        //2.英雄的自我介绍
        System.out.print("英雄:" +hero.getHeroName() +",自我介绍:");
        hero.display();   //调用display()方法
        //3.玩家根据队伍情况，设置英雄的召唤技能
        //hero.setiSkill(new Jipao());   //面向接口编程的体现
        hero.setiSkill(new KuangBao());
        //4.游戏开始
        System.out.println("游戏开始，请做好准备！");
        //5.使用英雄的普通攻击
        hero.normalAttack();   //调用normalAttack()方法
        //6.使用英雄的召唤师技能攻击
        hero.skill();  //调用skill()方法
    }
}