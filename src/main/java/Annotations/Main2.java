package Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {

        /*
        * doctor d = new doctor();
        * d.assist();
        * this is not suitable for unit testing if doctor class is closely coupled*/

        // we should go for xml based configuration
     //   ApplicationContext context = new ClassPathXmlApplicationContext("springAnno.xml");

        //xml(Annotation) based java-configuration


        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        //👆 it will refer BeanConfig class sees @Configuration &
        // wanna scan Annotations as base package & whatever components there it will load
        doctor doct = context.getBean(doctor.class);

       doct.assist();

    }
}
