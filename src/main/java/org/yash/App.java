package org.yash;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.yash.domain.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student)ap.getBean("student");
        System.out.println(student);

        Student student1 = (Student)ap.getBean("stu");
        System.out.println(student1);


    //    Resource resource = new ClassPathResource("spring.xml");
     //   BeanFactory ap = new XmlBeanFactory(resource);

       // Student student = (Student)ap.getBean("s");

       /* Student student = (Student)ap.getBean("s");
        Student student1 = (Student)ap.getBean("s");
        Student student2= (Student)ap.getBean("s");*/
    }
}
