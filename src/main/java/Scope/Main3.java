package Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {

        /*
        * doctor d = new doctor();
        * d.assist();
        * this is not suitable for unit testing if doctor class is closely coupled*/


        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        doctor doct = context.getBean(doctor.class);
        doct.assist();
        doct.setQualification("MBBS");

        System.out.println(doct);

        doctor doctor1 = context.getBean(doctor.class);
//        if it is Singleton , all the qualifications for each objs should be same like(static)
//        for prototype it will be null
        System.out.println(doctor1);

    }
}
