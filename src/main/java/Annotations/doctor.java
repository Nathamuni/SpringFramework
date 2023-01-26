package Annotations;

import org.springframework.stereotype.Component;

 @Component
public class doctor implements Staff {
    public void assist(){
        System.out.println("Doctor assisting");
        // we need to define this class is a bean
        // in xml create bean    <bean id="doc" class = "demo.doctor"></bean>

    }

}
