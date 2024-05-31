package com.altuhin.reactive.sec01.objpublisher;

import java.util.Arrays;
import java.util.List;

public class Employee {

    private Long id;
    private String name;
    private String age;

    public static List<Employee> getEmployees() {
        List<Employee> employees = Arrays.asList(
                new Employee(100L, "John Doe", "30"),
                new Employee(200L, "Jane Smith", "25"),
                new Employee(300L, "Jake White", "35")
        );
        return employees;
    }

    public Employee(Long id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
