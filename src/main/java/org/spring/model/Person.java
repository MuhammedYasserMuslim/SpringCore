package org.spring.model;

public class Person {

    private Long id;
    private String name;
    private int age;

    private  Department department;

    public Person() {
    }

    public Person(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
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

    @Override
    public String toString() {
        System.out.println( "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}');
        System.out.println("Dep_id = "+department.getId()+" \nDep_name is "+department.getName());
        return  null;
    }
}
