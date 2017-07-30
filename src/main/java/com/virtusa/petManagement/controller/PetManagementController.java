package com.virtusa.petManagement.controller;

import com.virtusa.petManagement.model.Employee;
import com.virtusa.petManagement.model.Owner;
import com.virtusa.petManagement.repository.OwnerRepository;
import com.virtusa.petManagement.services.PetManagementService;
import com.virtusa.petManagement.services.PetManagementService_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController

public class PetManagementController {



    @Autowired
   PetManagementService petManagementService;

    @RequestMapping(value = "/addOwner", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void updateOwner(@RequestBody Owner owner){


       // System.out.println(owner.getOwnerName());
       // System.out.println(owner.getPetData().get(0).getName());
        System.out.println(owner.toString());


    }




}
