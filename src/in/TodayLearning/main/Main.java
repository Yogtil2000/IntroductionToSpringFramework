package in.TodayLearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.TodayLearning.beans.Student;

public class Main 
{
      public static void main(String args[])
      {
    	 // System.out.println("Reached here 1");
    	  String config_loc="/in/TodayLearning/resources/applicationContext.xml";
    	  ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
    	  
    	 // System.out.println("Reached here 1");
    	  Student stu1 = (Student) context.getBean("stdId1");
    	  //stu.display();
    	  System.out.println(stu1.hashCode());
    	  
    	  Student stu2=(Student) context.getBean("stdId2");
    	  System.out.println(stu2.hashCode());
    	  
      }
}
