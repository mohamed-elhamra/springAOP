package com.melha.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import com.melha.annotation.MyAnnotation;

@Aspect
public class LoggingAspect {

    /*@Before("allGetters() && allTriangleMethods()")
    public void LoggingAdvice(){
        System.out.println("Advice run. Get Method called.");
    }

    @Before("allGetters()")
    public void secondAdvice(){
        System.out.println("Second advice.");
    }

    @Pointcut("execution(* get*())")
    public void allGetters(){ }

    @Pointcut("within(com.melha.model.Triangle)")
    public void allTriangleMethods(){}*/

    /************************************************/

    /*@Before("execution(* get*()) && within(com.melha.model.Triangle)")
    public void methodAdivce(JoinPoint joinPoint){
        System.out.println(joinPoint.getTarget());
    }*/

    /*@After("args(String)")
    public void stringArgumentMethods(){
        System.out.println("String argument methods.");
    }*/

    /*@Before("args(name)")
    public void stringArgumentMethodsValue(String name){
        System.out.println("String argument methods: " + name );
    }*/

    /*@AfterReturning(pointcut = "execution(* get*())", returning = "returningString") //@AfterThrowing(throwing="")
    public void returningAdvice(String returningString){
        System.out.println("The return is: " + returningString);
    }*/

    /*@Before("@annotation(com.melha.annotation.MyAnnotation)")*/
    public void myAdvice(){
        System.out.println("Execution of myAdvice().");
    }

    /*@Around("execution(* *setName(..))")
    public void aroudAdvice(ProceedingJoinPoint proceedingJoinPoint){
        try {
            System.out.println("Before the target method.");
            proceedingJoinPoint.proceed();
            System.out.println("After the target method.");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }*/

}
