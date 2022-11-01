package com.sber.task3.entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "employee")
@AllArgsConstructor
@XmlRootElement
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Vacancy() {}

    private String name;
    private Integer salary;
    private String experience;
    private String city;

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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
