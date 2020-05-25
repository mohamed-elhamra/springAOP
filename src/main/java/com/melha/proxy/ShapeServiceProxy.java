package com.melha.proxy;

import com.melha.aspect.LoggingAspect;
import com.melha.model.Cercle;
import com.melha.service.ShapeService;

public class ShapeServiceProxy extends ShapeService {

    public Cercle getCercle(){
        new LoggingAspect().myAdvice();
        super.getCercle();
        return null;
    }
}
