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
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // solution - use constructor
    public RunnerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // custom hook init and destroy
    public void doMyStartupStuff() {
        System.out.println("Runner Coach: inside method doMyStartStuff");
    }

    // custom hook init and destroy
    public void doMyCleanStuffYoYo() {
        System.out.println("Runner Coach: inside method doMyCleanStuffYoYo");
    }

}
