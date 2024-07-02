package br.com.erudio.rest_with_spring_boot_and_java.services;

import br.com.erudio.rest_with_spring_boot_and_java.model.Person;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(PersonServices.class);
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person create (Person person) {
        logger.info("Creating a person");

        return person;
    }
    public Person update (Person person) {
        logger.info("Updating a person");
        return person;
    }
    public void delete (String id) {

        logger.info("Deleting a person");
    }

    public Person findById(String id) {
        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leonardo");
        person.setLastName("Felix");
        person.setAddress("Rua sem nome");
        person.setGender("homi");
        return person;

    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }


    private Person mockPerson(int i) {
        logger.info("finding all");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leonardo: " + i);
        person.setLastName("Felix: " + i);
        person.setAddress("Rua sem nome: " + i);
        person.setGender(i % 2 == 0 ? "male" : "female");
        return person;
    }
}
