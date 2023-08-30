package org.spring.configuration;

import org.spring.model.Department;
import org.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring")
public class Config {

    @Bean
    public Person personBean(){
        return  new Person(depBean());
    }

    @Bean
    public Department depBean(){
        return new Department();
    }


}


/*   @Bean
    public Person personBean(){
        Person person = new Person(departmentBean());
        return person;
    }
    @Bean
    public Department departmentBean(){
        Department department=new Department();
        return department;
    }*/
