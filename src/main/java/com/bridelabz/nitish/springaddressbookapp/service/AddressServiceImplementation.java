package com.bridelabz.nitish.springaddressbookapp.service;

import com.bridelabz.nitish.springaddressbookapp.repository.IRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImplementation implements AddressServices{

    @Autowired
    private IRepositoryInterface repository;


}
