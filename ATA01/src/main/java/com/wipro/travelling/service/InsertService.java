package com.wipro.travelling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.travelling.entity.Vehicle;
import com.wipro.travelling.repo.InsertRepo;

@Service
public class InsertService {
	
	@Autowired
	InsertRepo irepo;
	public void saveVehicle(Vehicle vehicle) {
		irepo.save(vehicle);
	}
	
	public boolean findByvId(Integer vId) {
		List<Vehicle> vehicles=irepo.findByvId(vId);
		if(vehicles.size()==0) {
			return true;
		}
		return false;
	}
	public  Vehicle checkVehicle(Integer vId) {
		Vehicle v=irepo.vehicle(vId);
		if(v!=null)
			return v;
		return null;
	}


}
