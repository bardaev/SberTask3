package com.sber.task3.service;

import com.sber.task3.entity.ListVacancy;
import com.sber.task3.entity.Vacancy;

public interface IVacancyService {
    Vacancy createVacancy(Vacancy vacancy);
    ListVacancy getAllVacancy();
    Vacancy getVacancyById(Long id);
    Vacancy deleteVacancy(Long id);
}
