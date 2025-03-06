package com.wipro.travelling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.travelling.entity.Vehicle;
import com.wipro.travelling.repo.ViewRepo;

@Service
public class ViewService {
	
	@Autowired
	ViewRepo vrepo;
	
	public void saveDetails(Vehicle vdetails) {
		vrepo.save(vdetails);
	}
	
	public boolean findByName(String vName) {
		List<Vehicle> d=vrepo.findByvName(vName);
		if(d.size()==0) {
			return true;
		}
		return false;
	}
	
	public List<Vehicle> getAllVehicle(){
		return (List<Vehicle>) vrepo.findAll();
	}
	
	public Vehicle getVehicleById(int vId) {
		Vehicle veh=vrepo.findById(vId).get();
		return veh;
	}
	
	public String updatevehicle(Vehicle vehicle) {
		int vId=vrepo.save(vehicle).getvId();
		return "vId::"+vId+"vehicle updated";
	}

	public String deleteVehicle(int vId) {
		vrepo.deleteById(vId);
		return "vId::"+vId+"vehicle deleted";
		
	}



}
