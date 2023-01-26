package demo;

public class doctor implements Staff {
    public void assist(){
        System.out.println("Doctor assisting");
        // we need to define this class is a bean
        // in xml create bean    <bean id="doc" class = "demo.doctor"></bean>

    }
    //==================What if we have properties==========from 30:16
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
