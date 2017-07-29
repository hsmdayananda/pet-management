package com.virtusa.petManagement.repository;

import com.virtusa.petManagement.model.Owner;
import com.virtusa.petManagement.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class OwnerRepository_Impl implements OwnerRepository{



    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Owner save(Owner owner) {


       // entityManager.getTransaction().begin();

        System.out.println(entityManager.isOpen());
        entityManager.persist(owner);


        System.out.println(owner.getOwnerName());
        entityManager.flush();
        System.out.println("Inside Repository");
        return owner;
    }
}
