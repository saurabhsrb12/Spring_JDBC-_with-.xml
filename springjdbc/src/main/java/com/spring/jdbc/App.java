package com.spring.jdbc;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Programme Started................" );
        
        //op on db by spjdbc
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
     /*   JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert Query        
        String query = "insert into student(id,name,city) values(?,?,?)";
        
        //fire query
        int result =template.update(query,18,"Viraj koli","Bihar");
        System.out.print("NUMBER OF RECORD INSERTED " + result);
        
       */ 
        
        StudentDao studentDao =context.getBean("studentDao",StudentDao.class);
//        
//          Student student_insert=new Student();
//        student_insert.setId(49);
//        student_insert.setName("Stove Smooth");
//        student_insert.setCity("Sydney");   
//        int result_insert=studentDao.insert(student_insert);
//        System.out.println("Student addeedd Succesfully ______"+result_insert);
//        
//        
//        Student student_update=new Student();
//        student_update.setId(12);
//        student_update.setName("Wandre Roosell");
//        student_update.setCity("Jamaica");
//        int result_update=studentDao.change(student_update);
//        System.out.println("Student Updated Succesfully ______"+result_update);
      
        
//        Student student=new Student();
//        student.setId(456);
//        int result=studentDao.delete(student);
//        System.out.println("Student deleted Succesfully ______"+result);

        //for selecting one row (it uses row mapper )
  //      Student student_select=studentDao.getStudent(49);
  //      System.out.println(student_select);
        
        
        List<Student> students=studentDao.getAllStudents();
        for(Student s: students) {
        	System.out.println(s);
        }
        
    }
}
