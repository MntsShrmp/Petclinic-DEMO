package org.springframework.samples.petclinic.vet;

import org.springframework.samples.petclinic.owner.PersonFactory;
public class VetFactory implements PersonFactory{
    public Vet createPerson(){
        return new Vet();
    }
}