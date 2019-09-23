package com.afwin.pppetclinic.services;

import com.afwin.pppetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner findByLastname(String lastName);
    Set<Owner>  findAll();
    Owner save(Owner owner);
}
