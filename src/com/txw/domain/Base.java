package com.txw.domain;

/**
 * 基地(单例类)
 */
public class Base {
    //基地的生命值
    private  int life = 999;
    //基地摧毁的状态
    private  boolean destroy = false;
    //构造方法的私有
    private  Base(){}
    //创建一个私有的静态的基地对象的引用
    public static  Base base =null;
    //提供一个公共的静态的创建基地对象或获取基地对象的方法
    public synchronized static  Base getBase(){
        //判断是否有基地
        if (base == null) {
            base = new Base();  //没有基地，就创建一个基地
        }
        return base;
    }
    //set\get方法
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public boolean isDestroy() {
        return destroy;
    }
    public void setDestroy(boolean destroy) {
        this.destroy = destroy;
    }
}