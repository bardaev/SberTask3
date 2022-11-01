package com.sber.task3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@Getter
@Setter
public class ListVacancy implements Serializable {

    private static final long serialVersionUID = 22L;

    private List<Vacancy> vacancies = new ArrayList<>();

}
