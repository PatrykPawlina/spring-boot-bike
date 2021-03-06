package com.java.springbootbike.dao.repository;

import com.java.springbootbike.dao.entity.Bike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends CrudRepository<Bike, Long> {

}
