package com.sber.task3.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vacancy")
@Getter
@Setter
public class VacancyDto {
    Long id;
    String name;
    Integer salary;
    String experience;
    String city;
}
