package org.spring;


import org.spring.configuration.Config;
import org.spring.model.Department;
import org.spring.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Employee employee = context.getBean("employee",Employee.class);
        Department department=new Department(1L,"IT");
        employee.setId(1L);employee.setName("Muhammed");employee.setAge(22);employee.setSalary(12000);
        employee.setDepartment(department);

        employee.getAll();




    }

}
