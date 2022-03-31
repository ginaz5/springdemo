package com.course.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Track Coach said: Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    // custom hook init and destroy
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartStuff");
    }

    // custom hook init and destroy
    public void doMyCleanStuffYoYo() {
        System.out.println("TrackCoach: inside method doMyCleanStuffYoYo");
    }

}
