package com.spring.rest.webservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.webservice.pojo.GreetingPojo;
@Repository
public interface GreetingDAO extends CrudRepository<GreetingPojo,Integer>{

}
