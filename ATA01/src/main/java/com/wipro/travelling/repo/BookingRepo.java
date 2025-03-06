package com.wipro.travelling.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.travelling.entity.BookingTable;

@Repository
public interface BookingRepo extends CrudRepository<BookingTable, Integer>{

}
