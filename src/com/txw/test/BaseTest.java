package com.txw.test;

import com.txw.domain.Base;
import com.txw.domain.Hero;
import com.txw.domain.HouYi;
import com.txw.domain.LuBanQiHao;
/*
 * 基地 测试类
 */
public class BaseTest {
    public static void main(String[] args) {
        System.out.println("所有英雄集合，攻击基地！");
        //模拟2个英雄，攻击基地
        new Thread(new Runnable() {
            @Override
            public void run() {
                //1. 创建英雄[后羿]，设置英雄单次攻击伤害值
                Hero hero = new HouYi();
                hero.setHeroHurt(100); //攻击力100
                //2. 获取基地，英雄攻击基地
                Base base = Base.getBase();
                destoryBase( hero, base);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                //1. 创建英雄[鲁班七号]，设置英雄单次攻击伤害值
                Hero hero = new LuBanQiHao();
                hero.setHeroHurt(80); //攻击力80
                //2. 获取基地，英雄攻击基地
                Base base = Base.getBase();
                destoryBase( hero, base);
            }
        }).start();
    }
    // 英雄 摧毁基地 方法
    public static void destoryBase(Hero hero, Base base) {
        //1. 显示哪里英雄 在攻击基地， 英雄的伤害值是多少
        System.out.println("英雄:"+ hero.getHeroName() + ",伤害值：" + hero.getHeroHurt());
        //2. 攻击基地
        //判断基地 生命值 >0 ,若生命值>0，英雄持续攻击
        while( base.getLife() >0 ){
            synchronized (base) {
                //2.1 判断当前基地的状态是否已被摧毁
                if (!base.isDestroy()) {
                    //若没有摧毁
                    //攻击基地，基地的剩余生命值 减少
                    //基地的剩余生命值 = 基地当前生命值 - 英雄的攻击力
                    base.setLife( base.getLife() - hero.getHeroHurt() );
                    //模拟攻击基地的耗时操作
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (base.getLife() > 0) {
                        //判断基地 生命值 >0，英雄攻击基地
                        System.out.println("英雄【"+hero.getHeroName()+"】正在攻击基地，基地剩余生命值：" + base.getLife());
                    } else {
                        //判断基地 生命值 <=0，说明基地已被摧毁，更新基地的状态为摧毁，游戏胜利
                       base.setDestroy(true);
                        System.out.println("基地已被【"+hero.getHeroName()+"】摧毁，游戏胜利");
                    }
                }
            }
        }
    }
}