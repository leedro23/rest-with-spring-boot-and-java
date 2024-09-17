package br.com.erudio.rest_with_spring_boot_and_java.repositories;

import br.com.erudio.rest_with_spring_boot_and_java.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositorie extends JpaRepository<Person, Long> {
}
