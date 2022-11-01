package com.sber.task3.controller;

import com.sber.task3.dto.VacancyDto;
import com.sber.task3.entity.ListVacancy;
import com.sber.task3.entity.Vacancy;
import com.sber.task3.service.IVacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/vacancy")
public class MainController {

    private IVacancyService vacancyService;

    @Autowired
    public MainController(IVacancyService vacancyService) {
        this.vacancyService = vacancyService;
    }

    @PutMapping
    public VacancyDto createVacancy(@RequestBody VacancyDto vacancy) {
        return vacancyService.createVacancy(vacancy);
    }

    @GetMapping
    public ListVacancy getAllVacancy() {
        return vacancyService.getAllVacancy();
    }

    @GetMapping(path = "{id}")
    public VacancyDto getVacancyById(@PathVariable(value = "id") Long id) {
        return vacancyService.getVacancyById(id);
    }

    @DeleteMapping(path = "{id}")
    public VacancyDto deleteVacancyById(@PathVariable(value = "id") Long id) {
        return vacancyService.deleteVacancy(id);
    }
}
