package com.virtusa.petManagement.services;

import com.virtusa.petManagement.model.Owner;
import com.virtusa.petManagement.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetManagementService_Impl implements PetManagementService{

    @Autowired
    OwnerRepository ownerRepository;

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);

    }
}
