package ru.job4j.accidents.service;

import ru.job4j.accidents.model.*;

import java.util.*;

public interface AccidentService {

    Accident save(Accident accident);

    void update(Accident accident);

    Collection<Accident> findAll();

    Optional<Accident> findById(int id);

    Collection<AccidentType> getAccidentTypes();

    Collection<Rule> getRules();

    Set<Rule> makeRules(String[] ids);
}