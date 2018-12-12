package com.xxq.rest.patttern.decorator.demo.demo2;

/**
 * @author xiaoqiang
 * @Title: Skill
 * @ProjectName decorator-demo
 * @Description: TODO
 * @date 2018-12-12 22:09
 */
public class Skill implements  Hero {
    //持有一个英雄对象接口
    private Hero hero;

    public Skill(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void display() {
        hero.display();
    }
}
