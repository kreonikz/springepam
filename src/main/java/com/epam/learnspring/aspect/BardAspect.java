package com.epam.learnspring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BardAspect {

    @Pointcut("execution(* com.epam.learnspring.service.KnightService.*(..))")
    public void serviceMethod() {

    }

    @Before("execution(* com.epam.learnspring.service.KnightService.*(..))")
    public void getSong() {
        System.out.println("lalala");
    }

    /*@Around("execution(* com.epam.learnspring.service.KnightService.getAchievement(..))")
    public Object action(ProceedingJoinPoint joinPoint) throws Throwable {
        long timeBefore = System.currentTimeMillis();
        Object object = joinPoint.proceed();
        long totalTime = System.currentTimeMillis() - timeBefore;
        System.err.println("lalala...");
        System.err.println("Knight has defeat the dragon in: " + totalTime + " ms");
        return object;
    }*/

    @Around("serviceMethod() && serviceMethod()")
    public Object action(ProceedingJoinPoint joinPoint) throws Throwable {
        long timeBefore = System.currentTimeMillis();
        Object object = joinPoint.proceed();
        long totalTime = System.currentTimeMillis() - timeBefore;
        System.err.println("lalala...");
        System.err.println("Knight has defeat the dragon in: " + totalTime + " ms");
        return object;
    }

    @After("execution(* com.epam.learnspring.service.KnightService.getAchievement(..))")
    public void afterAction() {
        System.err.println("Knight is victorious");
        System.err.println("He's slayed the dragon");
        System.err.println("Now he's drunk and furious");
        System.err.println("In banging castle's maaams");
    }

    @AfterThrowing(
            pointcut = "serviceMethod()",
            throwing = "ex"
    )
    public void throwException(Exception ex) {
        //Here goes some logic
    }
}
