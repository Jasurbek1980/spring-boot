package uz.qqb.task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class Task1Application {

    public static void main(String[] args) {
        SpringApplication.run(Task1Application.class, args);
    }

//    @Scheduled(fixedRate = 1000L)
//    public void startRate(){
//        System.out.println("New rate"+new Date());
//    }
//    @Scheduled(fixedDelay = 1000L)
//    public void startDelay(){
//        System.out.println("New startDelay "+new Date());
//    }

//    @Scheduled(cron = "30 29 12 * * *")
//    public void startCron() {
//        System.out.println("New startCron " + new Date());
//    }
//
//    @Scheduled(initialDelay = 1000, fixedDelay = 2000L)
//    public void startDelay() {
//        System.out.println("New startDelay " + new Date());
//    }

}
