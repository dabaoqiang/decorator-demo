package com.xxq.rest.patttern.decorator.demo.demo2;

/**
 * @author xiaoqiang
 * @Title: SunWuKongDemo2Test
 * @ProjectName decorator-demo
 * @Description: TODO
 * @date 2018-12-12 22:13
 */
public class SunWuKongDemo2Test {
    public static void main(String[] args) {
        Hero sunWuKong = new SunWuKong();
        sunWuKong.display();
        System.out.println("--------------------------");
        // 增加技能
        Skill skill = new Q_Skill(sunWuKong, "光明");
        skill.display();
    }
}
