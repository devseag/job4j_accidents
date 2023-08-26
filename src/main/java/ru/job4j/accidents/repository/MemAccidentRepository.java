package ru.job4j.accidents.repository;

import org.springframework.stereotype.*;
import ru.job4j.accidents.model.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

@Repository
public class MemAccidentRepository implements AccidentRepository {

    private final AtomicInteger nextId = new AtomicInteger(1);
    private final ConcurrentHashMap<Integer, Accident> accidents = new ConcurrentHashMap<>();

    public MemAccidentRepository() {
        save(new Accident(1, "name1", "text1", "address1"));
        save(new Accident(2, "name2", "text2", "address2"));
        save(new Accident(3, "name3", "text3", "address3"));
    }

    @Override
    public Accident save(Accident accident) {
        accident.setId(nextId.getAndIncrement());
        accidents.put(accident.getId(), accident);
        return accident;
    }

    @Override
    public Collection<Accident> findAll() {
        return accidents.values();
    }

}