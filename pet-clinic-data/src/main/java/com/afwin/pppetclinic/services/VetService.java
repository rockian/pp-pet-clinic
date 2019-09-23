package com.afwin.pppetclinic.services;


import com.afwin.pppetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet findByLastname(String lastName);
    Set<Vet> findAll();
    Vet save(Vet vet);
}
