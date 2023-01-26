package ConstructorInjection;
//34:05
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {

        /*
        * doctor d = new doctor();
        * d.assist();
        * this is not suitable for unit testing if doctor class is closely coupled*/

        // we should go for xml based configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("springcons.xml");

        //xml based configuration
       doctor d = context.getBean(doctor.class);//This will work if we declare demo.doctor in 👆 as a <bean></bean>
       d.assist();
        Nurse n = (Nurse) context.getBean("nurse"); //we can pass id as a params
        n.assist();


        Staff staff = context.getBean(doctor.class);//staff as an interface
        staff.assist();


        doctor d1 = context.getBean(doctor.class);
        System.out.println(d1.getQualification());  // after passing params using constructors
//
    }
}
