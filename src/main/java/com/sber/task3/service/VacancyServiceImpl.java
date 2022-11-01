package com.sber.task3.service;

import com.sber.task3.entity.ListVacancy;
import com.sber.task3.entity.Vacancy;
import com.sber.task3.repository.IVacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacancyServiceImpl implements IVacancyService {

    private IVacancyRepository vacancyService;

    @Autowired
    public VacancyServiceImpl(IVacancyRepository vacancyService) {
        this.vacancyService = vacancyService;
    }

    @Override
    public Vacancy createVacancy(Vacancy vacancy) {
        return vacancyService.createVacancy(vacancy);
    }

    @Override
    public ListVacancy getAllVacancy() {
        return vacancyService.getAllVacancy();
    }

    @Override
    public Vacancy getVacancyById(Long id) {
        return vacancyService.getVacancyById(id);
    }

    @Override
    public Vacancy deleteVacancy(Long id) {
        return vacancyService.deleteVacancy(id);
    }
}
