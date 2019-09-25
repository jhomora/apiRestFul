package com.jhony.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jhony.apirest.models.entity.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
