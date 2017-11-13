package com.hxf;

import org.springframework.stereotype.Component;

/**
 * @author <a href="huangxiaofeng@wxchina.com">XiaoFeng Huang</a>
 * @version 1.0.0
 * @description:
 * @date 2017/11/13
 */
public class B {

    public B() {
        System.out.println("B constructor");
    }

    {
        System.out.println("Blank B");
    }

    static {
        System.out.println("static B");
    }

    public String func(){
        return "B name";
    }
}
