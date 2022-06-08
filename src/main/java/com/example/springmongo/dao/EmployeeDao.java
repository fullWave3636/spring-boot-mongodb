package com.example.springmongo.dao;

import com.example.springmongo.model.EmployeeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeDao extends MongoRepository<EmployeeModel, Long> {

}
