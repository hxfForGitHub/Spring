package com.hxf;

import org.springframework.stereotype.Component;

/**
 * @author <a href="huangxiaofeng@wxchina.com">XiaoFeng Huang</a>
 * @version 1.0.0
 * @description:
 * @date 2017/11/13
 */
public class A {

    public A() {
        System.out.println("A constructor");
    }

    {
        System.out.println("blank A");
    }

    static {
        System.out.println("static A");
    }

    private B b;

    private D d;

    private String name;

    public void funA(){
        System.out.println("A name >>> " + b.func());
    }

    public void init(){
        System.out.println("A init");
    }


    public void setD(D d){
        System.out.println("A >>> begin to set D");
        this.d = d;
    }

    public void setB(B bxx) {
        System.out.println("A >>> begin to set B");
        this.b = bxx;
        name = bxx.func();
    }
}
