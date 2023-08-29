package org.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private Long id;
    private String name;
    private int age;
    private float salary;

    @Autowired
    public Department department;

    public Employee() {
    }

    public void getAll() {
        System.out.println("my name is " + this.name + "\nage  =" +this.age +"\nsalary =" +this.salary);
        this.department.toString();
    }

    public Employee(Long id, String name, int age, float salary, Department department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
