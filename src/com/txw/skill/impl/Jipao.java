package com.txw.skill.impl;

import com.txw.skill.ISkill;
/**
 *召唤师的技能(疾跑)
 */
public class Jipao implements ISkill {
    @Override
    public void useSkill() {   //重写useSkill()方法
        System.out.println("疾跑：75秒CD，增加35%移动速度持续10秒");
    }
}