package com.xxq.rest.patttern.decorator.demo;

/**
 * @author xiaoqiang
 * @Title: ShapeDecorator
 * @ProjectName decorator-demo
 * @Description: TODO
 * @date 2018-12-12 21:57
 */
public class ShapeDecorator  implements  Shape{

    protected  Shape shapeDecorator;


    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    public void display() {
        shapeDecorator.display();
    }
}
