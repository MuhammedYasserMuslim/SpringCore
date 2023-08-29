package org.spring.model;

public class Employee {

    private Long id;
    private String name;
    private int age;
    private float salary;


    public void getAll() {
        System.out.println("my name is " + this.name + "\nage  =" +this.age +"\nsalary =" +this.salary);
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
}
