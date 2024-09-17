package br.com.erudio.rest_with_spring_boot_and_java.services;

import br.com.erudio.rest_with_spring_boot_and_java.model.Person;
import br.com.erudio.rest_with_spring_boot_and_java.repositories.PersonRepositorie;
import br.com.exceptions.ResourceNotFoundExcepction;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepositorie personRepositorie;

    public Person create(Person person) {
        logger.info("Creating a person");

        return personRepositorie.save(person);
    }

    public Person update(Person person) {
        logger.info("Updating a person");


        Person entity = personRepositorie.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundExcepction("No records found for this ID"));
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return personRepositorie.save(entity);
    }

    public void delete(Long id) {
        Person entity = personRepositorie.findById(id).orElseThrow(() -> new ResourceNotFoundExcepction("No records found for this ID"));

        personRepositorie.delete(entity);

        logger.info("Deleting a person");
    }

    public Person findById(Long id) {
        logger.info("Finding one person!");

        return personRepositorie.findById(id).orElseThrow(() -> new ResourceNotFoundExcepction("No records found for this ID"));

    }

    public List<Person> findAll() {

        logger.info("Finding all people");

        return personRepositorie.findAll();

    }

}
