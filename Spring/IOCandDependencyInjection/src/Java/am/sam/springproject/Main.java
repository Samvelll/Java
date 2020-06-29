package am.sam.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Driving car = (Driving)context.getBean("drive_id");
        car.toDrive();
        System.out.println(car.getYear());
    }
}
