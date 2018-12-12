package com.xxq.rest.patttern.decorator.demo;

/**
 * @author xiaoqiang
 * @Title: RedDecorator
 * @ProjectName decorator-demo
 * @Description: TODO
 * @date 2018-12-12 21:58
 */
public class RedDecorator extends  ShapeDecorator {

    private  String color;

    public RedDecorator(Shape shapeDecorator, String color) {
        super(shapeDecorator);
        this.color = color;
        setCorlor(color);
    }

    public void setCorlor(String color){
        System.out.println("添加颜色：" + color);
    }
}
