package com.bridelabz.nitish.springaddressbookapp.repository;

import com.bridelabz.nitish.springaddressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryInterface extends JpaRepository<AddressBookData,Long> {
}
