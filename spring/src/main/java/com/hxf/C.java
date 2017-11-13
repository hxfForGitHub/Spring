package com.hxf;

/**
 * @author <a href="huangxiaofeng@wxchina.com">XiaoFeng Huang</a>
 * @version 1.0.0
 * @description:
 * @date 2017/11/13
 */
public class C extends A {

    {
        System.out.println("blank C");
    }

    static {
        System.out.println("static C");
    }

    public C() {
        System.out.println("constructor C");
    }

    public void init(){
        System.out.println("c init");
    }
}
