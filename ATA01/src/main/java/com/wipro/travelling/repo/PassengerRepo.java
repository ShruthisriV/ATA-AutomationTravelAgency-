package com.wipro.travelling.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.travelling.entity.Passenger;

@Repository
public interface PassengerRepo extends CrudRepository<Passenger, Integer> {

}
