package com.wipro.travelling.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.travelling.entity.Vehicle;

@Repository

public interface InsertRepo extends CrudRepository<Vehicle,Integer>{
	public List<Vehicle> findByvId(Integer vId);
	@Query("from com.wipro.travelling.entity.Vehicle where vId like ?1")
	public Vehicle vehicle(Integer vId);

}