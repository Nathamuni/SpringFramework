package Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(scopeName = "singleton") // can not mention as it is Default...
@Scope(scopeName = "prototype")
@Component
public class doctor implements Staff {

    @Override
    public String toString() {
        return "doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;

   public void assist(){
       System.out.println("Doctor assisting");
   }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
