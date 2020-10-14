package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class StaffService {
	
	 @Autowired
	  StaffRepository repository;
	   
	  public List<Staff> selectAll() {
	    return repository.findAll(new Sort(Sort.Direction.ASC, "id"));
	  }
	  public Staff selectById(String id){return repository.getOne(id);}

	public Staff create(Staff staff) {
		return repository.save(staff);
	}

}
