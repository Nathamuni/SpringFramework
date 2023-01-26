package ConstructorInjection;

public class doctor implements Staff {
    // This constructor takes single params from line 14 springcons.xml
    public doctor(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor assisting");
        // we need to define this class is a bean
        // in xml create bean    <bean id="doc" class = "demo.doctor"></bean>

    }
    //==================What if we have properties==========from 34:56
    private String qualification;

    //Spring create an obj for doctor but it puts default value4 prop qualification
//so we need to inject the value FROM XML FILE
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
