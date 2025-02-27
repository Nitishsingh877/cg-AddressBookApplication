package com.bridelabz.nitish.springaddressbookapp.service;

import com.bridelabz.nitish.springaddressbookapp.dto.AddressBookDto;
import com.bridelabz.nitish.springaddressbookapp.model.AddressBookData;
import com.bridelabz.nitish.springaddressbookapp.repository.IRepositoryInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class AddressServiceImplementation implements AddressServices{

    @Autowired
    private IRepositoryInterface repository;

    @Override
    public List<AddressBookData> getAddressBookDto() {
        return repository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDto(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public AddressBookData createAddressBookDto(AddressBookDto addressBookDto) {
        AddressBookData addressBookData = new AddressBookData(addressBookDto);
        log.debug("AddressBookDto added : {}", addressBookDto);
        return repository.save(addressBookData);
    }

   

    @Override
    public ResponseEntity<?> updateAddressBookDto(Long id, AddressBookDto addressBookDto) {
        AddressBookData addressBookData = repository.findById(id).get();
        if(repository.existsById(id)) {
            addressBookData.setName(addressBookDto.getName());
            addressBookData.setPhone(addressBookDto.getPhone());
            addressBookData.setEmail(addressBookDto.getEmail());
            repository.save(addressBookData);
            log.debug("AddressBookDto updated : {}", addressBookDto);
            return ResponseEntity.ok("Updated Successfully");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
        }
    }

    @Override
    public ResponseEntity<?> deleteAddressBookDto(Long id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.ok("Deleted AddressBook");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("AddressBook not found");
        }




    }
}
