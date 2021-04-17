package org.springframework.samples.petclinic.owner;

public class OwnerFactory extends PersonFactory{
    public Owner createPerson(){
        return new Owner();
    }
}