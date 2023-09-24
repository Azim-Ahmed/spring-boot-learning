package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args){

  // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
  ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    
  Doctor stuff = context.getBean(Doctor.class);
  stuff.assist();
  // stuff.setQualification("MBBS");
  // System.out.println(stuff);
  // Doctor stuff1 = context.getBean(Doctor.class);
  // System.out.println(stuff1);
  }
}

//Getting same result because of singleton result of default behaviour of spring scopes