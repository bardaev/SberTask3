package com.sber.task3.service;

import com.sber.task3.dto.VacancyDto;
import com.sber.task3.entity.ListVacancy;
import com.sber.task3.entity.Vacancy;
import com.sber.task3.repository.IVacancyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacancyServiceImpl implements IVacancyService {

    private final IVacancyRepository vacancyService;
    private final ModelMapper mapper;

    @Autowired
    public VacancyServiceImpl(IVacancyRepository vacancyService, ModelMapper mapper) {
        this.vacancyService = vacancyService;
        this.mapper = mapper;
    }

    @Override
    public VacancyDto createVacancy(VacancyDto vacancy) {
        Vacancy v = mapper.map(vacancy, Vacancy.class);
        return mapper.map(vacancyService.createVacancy(v), VacancyDto.class);
    }

    @Override
    public ListVacancy getAllVacancy() {
        return vacancyService.getAllVacancy();
    }

    @Override
    public VacancyDto getVacancyById(Long id) {
        Vacancy vacancy = vacancyService.getVacancyById(id);
        return mapper.map(vacancy, VacancyDto.class);
    }

    @Override
    public VacancyDto deleteVacancy(Long id) {
        Vacancy vacancy = vacancyService.deleteVacancy(id);
        return mapper.map(vacancy, VacancyDto.class);
    }
}
