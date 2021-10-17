package com.springsec.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springsec.test.model.Car;

public interface ICarService {

	public List<Car> findAllCars();
	public Optional<Car> findCarById(int id);

	public Car findCarByName(String carName);
}
