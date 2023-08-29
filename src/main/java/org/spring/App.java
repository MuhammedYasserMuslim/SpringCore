package org.spring;


import org.spring.model.Employee;
import org.spring.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new FileSystemXmlApplicationContext("E:\\Spring-Boot-Learning\\SpringCore\\SpringCore\\src\\beans.xml");

        Employee employee = (Employee) context.getBean("ff");

        employee.getAll();


        Person person = (Person) context.getBean("person");
        System.out.println(person.toString());


    }

}
