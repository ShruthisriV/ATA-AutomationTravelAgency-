package com.wipro.travelling.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.travelling.entity.BookingTable;
import com.wipro.travelling.repo.BookingRepo;

@Service
public class BookingService {
	@Autowired
	private BookingRepo brepo;
	
	public List<BookingTable> getbookings(){
		List<BookingTable> bdata=new ArrayList<>();
		for(BookingTable r:brepo.findAll()) {
			bdata.add(r);
		}
		return bdata;
	}
}
