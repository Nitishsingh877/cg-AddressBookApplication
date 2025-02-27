package com.bridelabz.nitish.springaddressbookapp.service;

import com.bridelabz.nitish.springaddressbookapp.dto.AddressBookDto;
import com.bridelabz.nitish.springaddressbookapp.model.AddressBookData;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AddressServices {

    List<AddressBookData> getAddressBookDto();
    AddressBookData getAddressBookDto(Long id);
    AddressBookData createAddressBookDto(AddressBookDto addressBookDto);
    ResponseEntity<?> updateAddressBookDto(Long id, AddressBookDto addressBookDto);
    ResponseEntity<?> deleteAddressBookDto(Long id);
    
}
