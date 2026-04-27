package com.example.fixation.question1.service;

import com.example.fixation.question1.model.Person;
import com.example.fixation.question1.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person findById(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found with id: " + id));
    }
}
