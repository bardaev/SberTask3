package com.sber.task3.repository;

import com.sber.task3.entity.ListVacancy;
import com.sber.task3.entity.Vacancy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VacancyRepositoryImpl implements IVacancyRepository {

    private final EntityManager em;

    @Autowired
    public VacancyRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Vacancy createVacancy(Vacancy vacancy) {
        em.persist(vacancy);
        return vacancy;
    }

    @Override
    public ListVacancy getAllVacancy() {
        List<Vacancy> list = em.createQuery("select v from Vacancy v").getResultList();
        ListVacancy listVacancy = new ListVacancy();
        listVacancy.setVacancies(list);
        return listVacancy;
    }

    @Override
    public Vacancy getVacancyById(Long id) {
        return em.find(Vacancy.class, id);
    }

    @Override
    public Vacancy deleteVacancy(Long id) {
        Vacancy vacancy = em.find(Vacancy.class, id);
        em.remove(vacancy);
        return vacancy;
    }
}
