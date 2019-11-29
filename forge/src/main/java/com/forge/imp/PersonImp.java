package com.forge.imp;

import com.forge.model.Person;
import com.forge.repository.IPersonRepository;
import com.forge.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service// declara que la clase sera utilizada como servicio en el controller
//encrgado de realizar la operacion logica invocando a crud repository y la interfas de logica
public class PersonImp implements IPersonService {

    @Autowired// realiza la instancia de una clase o de ina interfaaz
    IPersonRepository personRepository;

    @Override
    public Person save(Person person) {
        Person personLocal = null;
        try {
            personLocal = personRepository.save(person);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return personLocal;
    }

    @Override
    public List<Person> findAll() {
        List<Person> personLocal = new ArrayList<>();
        try {
            personLocal = personRepository.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return personLocal;
    }

    @Override
    public List<Person> findByNombre(String nombre) {
        List<Person> personLocal = new ArrayList<>();
        try {
            personLocal = personRepository.findByNombre(nombre);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return personLocal;
    }
}
