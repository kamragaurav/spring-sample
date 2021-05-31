package org.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yash.domain.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student)ap.getBean("s");
        System.out.println(student.getStudentAddress());
        System.out.println( "Hello World!" );
    }
}
