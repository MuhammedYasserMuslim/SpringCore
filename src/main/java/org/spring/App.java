package org.spring;


import org.spring.configuration.Config;
import org.spring.model.Department;
import org.spring.model.Employee;
import org.spring.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        Person person = context.getBean("personBean", Person.class);
        Department department = context.getBean("depBean",Department.class);

        department.setId(1L);department.setName("IT");


        person.setId(1L);person.setName("Muhammed");person.setAge(22);
        person.setDepartment(department);



        person.toString();





    }

}
