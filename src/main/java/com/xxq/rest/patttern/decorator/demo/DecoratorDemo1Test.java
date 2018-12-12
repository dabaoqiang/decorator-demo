package com.xxq.rest.patttern.decorator.demo;

/**
 * @author xiaoqiang
 * @Title: DecoratorDemo1Test
 * @ProjectName decorator-demo
 * @Description: TODO
 * @date 2018-12-12 22:02
 */
public class DecoratorDemo1Test {
    public static void main(String[] args) {
        // 本身的类
        Shape shape = new Rectangle();
        shape.display();
        // 添加红色的功能，进行包装。即装饰，
        RedDecorator redDecorator = new RedDecorator(shape,"红色");
        redDecorator.display();

    }
}
