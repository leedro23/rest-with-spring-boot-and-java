package br.com.erudio.rest_with_spring_boot_and_java.controllers;

import br.com.erudio.rest_with_spring_boot_and_java.model.Person;
import br.com.erudio.rest_with_spring_boot_and_java.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices personServices; //Desta forma a instanciação fica sob responsabilidade do spring, desde que tenha a anotation adequada
//    private PersonServices personServices = new PersonServices();


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) {
        return personServices.create(person);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Person update(@RequestBody Person person) {
        return personServices.update(person);
    }

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable(value = "id") String id) throws Exception {
        personServices.delete(id);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findByID(@PathVariable(value = "id") String id) throws Exception {
        return personServices.findById(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_ATOM_XML_VALUE)
    public List<Person> findAll() {
        return personServices.findAll();
    }

}
