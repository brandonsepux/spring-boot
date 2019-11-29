package com.forge.repository;

import com.forge.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
//importar dependencia de jpa
//se crea una interface repository que herede de crudrepository
public interface IPersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByNombre(String nombre);
}
