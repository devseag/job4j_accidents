package ru.job4j.accidents.repository;

import org.springframework.stereotype.*;
import ru.job4j.accidents.model.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

@Repository
public class MemAccidentRepository {
// implements AccidentRepository {
//
//    private final AtomicInteger nextId = new AtomicInteger(1);
//    private final Map<Integer, Accident> accidents = new ConcurrentHashMap<>();
//    private final Map<Integer, AccidentType> types = new ConcurrentHashMap<>();
//    private final Map<Integer, Rule> rules = new ConcurrentHashMap<>();
//
//    public MemAccidentRepository() {
//        save(new Accident(0, "name1", "text1", "address1", new AccidentType(), new HashSet<>()));
//        save(new Accident(0, "name2", "text2", "address2", new AccidentType(), new HashSet<>()));
//        save(new Accident(0, "name3", "text3", "address3", new AccidentType(), new HashSet<>()));
//        types.put(1, new AccidentType(1, "Dve mashiny"));
//        types.put(2, new AccidentType(2, "Mashina i chelovek"));
//        types.put(3, new AccidentType(3, "Mashina i velosiped"));
//        rules.put(1, new Rule(1, "Stat'ja. 1"));
//        rules.put(2, new Rule(2, "Stat'ja. 2"));
//        rules.put(3, new Rule(3, "Stat'ja. 3"));
//    }
//
//    @Override
//    public Accident save(Accident accident) {
//        accident.setId(nextId.getAndIncrement());
//        accidents.put(accident.getId(), accident);
//        return accident;
//    }
//
//    @Override
//    public void update(Accident accident) {
//        accidents.replace(accident.getId(), accident);
//    }
//
//    @Override
//    public Collection<Accident> findAll() {
//        return accidents.values();
//    }
//
//    @Override
//    public Optional<Accident> findById(int id) {
//        return Optional.ofNullable(accidents.get(id));
//    }
//
//    @Override
//    public Collection<AccidentType> getAccidentTypes() {
//        return types.values();
//    }
//
//    @Override
//    public Collection<Rule> getRules() {
//        return rules.values();
//    }

}