package com.xxq.rest.patttern.decorator.demo.demo2;

/**
 * @author xiaoqiang
 * @Title: Q_Skill
 * @ProjectName decorator-demo
 * @Description: TODO
 * @date 2018-12-12 22:10
 */
public class Q_Skill extends   Skill {

    private String name;

    public Q_Skill(Hero hero, String name) {
        super(hero);
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("学会了:" + name);
        super.display();
    }
}
