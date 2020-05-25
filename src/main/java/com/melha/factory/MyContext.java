package com.melha.factory;

import com.melha.proxy.ShapeServiceProxy;

public class MyContext {

    public Object getBean(String name){
        if(name.equals("shapeService")) return new ShapeServiceProxy();
        return null;
    }

}
