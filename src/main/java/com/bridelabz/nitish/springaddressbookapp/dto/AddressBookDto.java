package com.bridelabz.nitish.springaddressbookapp.dto;


import lombok.Data;
import lombok.ToString;

@Data
public @ToString class AddressBookDto {

    private String name;
    private long phone;
    private String email;
    
}
