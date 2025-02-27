package com.bridelabz.nitish.springaddressbookapp.dto;



import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.ToString;

@Data
public @ToString class AddressBookDto {

    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$",message = "Employee name is invalid")
    private String name;

    @Pattern(regexp = "^[6-9]{2}\\d{10}", message = "enter valid number")
    private long phone;

    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",message = "email is not valid")
    private String email;
    
}
