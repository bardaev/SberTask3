package com.sber.task3.service;

import com.sber.task3.dto.VacancyDto;
import com.sber.task3.entity.ListVacancy;
import com.sber.task3.entity.Vacancy;

public interface IVacancyService {
    VacancyDto createVacancy(VacancyDto vacancy);
    ListVacancy getAllVacancy();
    VacancyDto getVacancyById(Long id);
    VacancyDto deleteVacancy(Long id);
}
