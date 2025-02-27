package com.bridelabz.nitish.springaddressbookapp.model;

import com.bridelabz.nitish.springaddressbookapp.dto.AddressBookDto;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Address_Book")
public @Data class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;


    private String name;
    private long phone;
    private String email;

    public AddressBookData() {}

    public AddressBookData(AddressBookDto addressBookDto) {
        this.name = addressBookDto.getName();
        this.phone = addressBookDto.getPhone();
        this.email = addressBookDto.getEmail();
    }


}
