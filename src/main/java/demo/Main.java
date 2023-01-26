package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
        * doctor d = new doctor();
        * d.assist();
        * this is not suitable for unit testing if doctor class is closely coupled*/

        // we should go for xml based configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //xml based configuration
       doctor d = context.getBean(doctor.class);//This will work if we declare demo.doctor in 👆 as a <bean></bean>
       d.assist();
        Nurse n = (Nurse) context.getBean("nurse"); //we can pass id as a params
        n.assist();

        //================After creating interface=================from 28:24
        Staff staff = context.getBean(doctor.class);//staff as an interface
        staff.assist();

        //==================What if we have properties==========from 30:16
        doctor d1 = context.getBean(doctor.class);
        System.out.println(d1.getQualification());  // after creating getters and setters
//      and in xml add <property name="qualification" value = "MBBS"></property> to doctor bean

    }
}
