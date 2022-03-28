package com.course.springdemo;

public class RunnerCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run 10K for warm up and 3K interval run";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
