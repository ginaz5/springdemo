package com.course.springdemo;

import java.util.ArrayList;
import java.util.Random;

public class MyFortuneService implements FortuneService{

//    ArrayList<String> fortuneArr = new ArrayList<String>("1","2","3");
    String[] fortuneArr = {"1","2","3"};
    int ranNum = new Random().nextInt(fortuneArr.length);

    @Override
    public String getFortune() {
        return "Your lucky number for today is -> " + fortuneArr[ranNum];
    }
}
