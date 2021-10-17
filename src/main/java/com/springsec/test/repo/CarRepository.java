package com.springsec.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springsec.test.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

	// CarDao can be created and can be inserted change this class from interface to
	// class
	// multiple dao can be autowired| dao are low level to access the data
	// remove implementation

	// @Query("select c.carId, c.carName,c.owner, c.price from Car where
	// c.name=:carName")
//	List<Car> findCarsByOwnerName(@Param("carName") String carName);

	
	Car findByCarName(String carname);

}
