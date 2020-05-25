package com.melha.model;

import com.melha.annotation.MyAnnotation;

public class Triangle {

    private String name;

    public String getName() {
        return name;
    }

    @MyAnnotation
    public void setName(String name) {
        this.name = name;
        System.out.println("inside setter.");
    }
}
