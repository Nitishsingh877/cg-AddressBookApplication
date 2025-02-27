package com.bridelabz.nitish.springaddressbookapp.controller;


import com.bridelabz.nitish.springaddressbookapp.dto.AddressBookDto;
import com.bridelabz.nitish.springaddressbookapp.model.AddressBookData;
import com.bridelabz.nitish.springaddressbookapp.service.AddressServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class RestControllerConatiner {

    @Autowired
    private AddressServiceImplementation addressService;

    @GetMapping("/get")
    public List<AddressBookData> getAddressBook() {
        return addressService.getAddressBookDto();
    }

    @GetMapping("/get/{id}")
    public AddressBookData getAddressBookById(@PathVariable("id") Long id) {
        return addressService.getAddressBookDto(id);
    }

    @PostMapping("/add")
    public AddressBookData createAddressBook(@RequestBody AddressBookDto addressBook) {
        return addressService.createAddressBookDto(addressBook);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAddressBook(@PathVariable("id") Long id) {
        addressService.deleteAddressBookDto(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateAddressBook(@PathVariable("id") Long id, @RequestBody AddressBookDto addressBook) {
        return addressService.updateAddressBookDto(id, addressBook);
    }
}
