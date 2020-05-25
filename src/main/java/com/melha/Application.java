package com.melha;

import com.melha.factory.MyContext;
import com.melha.proxy.ShapeServiceProxy;
import com.melha.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class Application {

    public static void main(String[] args) {
        /*ApplicationContext application = new ClassPathXmlApplicationContext("AppConfig.xml");

        ShapeService shapeService = application.getBean("shapeService",ShapeService.class);
        shapeService.getTriangle().setName("Mohamed");
        System.out.println(shapeService.getTriangle().getName());*/

        MyContext myContext = new MyContext();

        ShapeService shapeService = (ShapeServiceProxy) myContext.getBean("shapeService");
        shapeService.getCercle();

    }
}
