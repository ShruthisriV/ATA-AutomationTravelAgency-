package com.wipro.travelling.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wipro.travelling.entity.Vehicle;

public interface ViewRepo extends CrudRepository<Vehicle,Integer>{
	public List<Vehicle> findByvName(String vName);
	public List<Vehicle> findByvId(Integer vId);

}
