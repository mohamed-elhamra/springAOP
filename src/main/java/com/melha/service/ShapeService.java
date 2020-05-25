package com.melha.service;

import com.melha.annotation.MyAnnotation;
import com.melha.model.Cercle;
import com.melha.model.Triangle;

public class ShapeService {

    private Cercle cercle;
    private Triangle triangle;

    public Cercle getCercle() {
        System.out.println("inside cercle getter");
        return cercle;
    }

    public void setCercle(Cercle cercle) {
        this.cercle = cercle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
