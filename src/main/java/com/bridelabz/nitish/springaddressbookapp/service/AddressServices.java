package com.bridelabz.nitish.springaddressbookapp.service;

import com.bridelabz.nitish.springaddressbookapp.dto.AddressBookDto;

public interface AddressServices {

    AddressBookDto getAddressBookDto();
    AddressBookDto getAddressBookDto(Long id);
    AddressBookDto createAddressBookDto(AddressBookDto addressBookDto);
    AddressBookDto updateAddressBookDto(AddressBookDto addressBookDto);
    AddressBookDto deleteAddressBookDto(Long id);
    
}
