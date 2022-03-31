package com.course.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanActivityDemoApp {

    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanActivity3-applicationContext.xml");

        // get bean from container
        RunnerCoach Coach1 = context.getBean("myRunnerCoach", RunnerCoach.class);
        RunnerCoach Coach2 = context.getBean("myRunnerCoach", RunnerCoach.class);

        // Activity 3
        boolean res = Coach1 == Coach2;
        System.out.println("Result: " + res);
        System.out.println("Memory of " + Coach1);
        System.out.println("Memory of " + Coach2);

        // close context
        context.close();

    }

}
