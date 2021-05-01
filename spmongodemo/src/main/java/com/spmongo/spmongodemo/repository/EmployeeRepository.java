package com.spmongo.spmongodemo.repository;

import com.spmongo.spmongodemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
