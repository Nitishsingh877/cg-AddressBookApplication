package com.bridelabz.nitish.springaddressbookapp.model;

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

    public AddressBookData(String name, long phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
