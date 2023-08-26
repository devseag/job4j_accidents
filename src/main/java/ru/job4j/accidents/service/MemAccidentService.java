package ru.job4j.accidents.service;

import lombok.*;
import org.springframework.stereotype.*;
import ru.job4j.accidents.model.*;
import ru.job4j.accidents.repository.*;

import java.util.*;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemAccidentService implements AccidentService {

    private AccidentRepository accidentRepository = new MemAccidentRepository();

    @Override
    public Accident save(Accident accident) {
        return accidentRepository.save(accident);
    }

    @Override
    public void update(Accident accident) {
        accidentRepository.update(accident);
    }

    @Override
    public Collection<Accident> findAll() {
        return accidentRepository.findAll();
    }

    @Override
    public Optional<Accident> findById(int id) {
        return accidentRepository.findById(id);
    }

    @Override
    public Collection<AccidentType> getAccidentTypes() {
        return accidentRepository.getAccidentTypes();
    }

    @Override
    public Collection<Rule> getRules() {
        return accidentRepository.getRules();
    }

    @Override
    public Set<Rule> makeRules(String[] ids) {
        Set<Rule> rules = new HashSet<>();
        for (String id : ids) {
            Rule rule = new Rule();
            rule.setId(Integer.parseInt(id));
            rules.add(rule);
        }
        return rules;
    }
}