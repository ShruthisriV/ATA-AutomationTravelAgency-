package com.wipro.travelling.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.travelling.entity.Passenger;
import com.wipro.travelling.repo.PassengerRepo;

@Service

public class PassengerService {
	@Autowired
	private PassengerRepo passrep;
	
	public List<Passenger>getpassenger(){
		List<Passenger>pd=new ArrayList<>();
		for(Passenger p:passrep.findAll()){
			pd.add(p);
			
		}
		return pd;
		
	}

}
