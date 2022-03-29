package com.course.springdemo;

public class RunnerCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run 10K for warm up and 3K interval run";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // original implementation with setter
    public void setFortuneService(MyFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // solution - use constructor
    public RunnerCoach(MyFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
