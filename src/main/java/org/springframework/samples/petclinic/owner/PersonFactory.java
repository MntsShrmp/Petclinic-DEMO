package org.springframework.samples.petclinic.owner;

import org.springframework.samples.petclinic.model.Person;

public interface PersonFactory{
    Person createPerson();
}