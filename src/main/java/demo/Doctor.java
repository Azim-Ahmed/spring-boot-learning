package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Stuff , BeanNameAware{
   private String qualification;
   
   @Override
   public String toString(){
    return "Doctor {" + 
    "qualification  => " + '"' + qualification + '"' + '}';
   }
    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
         this.qualification = qualification;
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct method is called");
    }
    @Override 
    public void setBeanName(String name){
System.out.println("Set Bean name is method is called");
    }
}
