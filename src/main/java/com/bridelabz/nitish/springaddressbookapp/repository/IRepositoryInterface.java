package com.bridelabz.nitish.springaddressbookapp.repository;

import com.bridelabz.nitish.springaddressbookapp.dto.AddressBookDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryInterface extends JpaRepository<AddressBookDto,Long> {
}
