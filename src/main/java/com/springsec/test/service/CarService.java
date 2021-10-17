package com.springsec.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsec.test.model.Car;
import com.springsec.test.repo.CarRepository;

@Service
public class CarService implements ICarService {

	@Autowired
	CarRepository carRepository;

	public List<Car> findAllCars() {
		return carRepository.findAll();
	}

	public Optional<Car> findCarById(int id) {
		// TODO Auto-generated method stub
		return carRepository.findById(id);
	}

	public Car findCarByName(String carName) {
		// TODO Auto-generated method stub
		return carRepository.findByCarName(carName);
	}

	public Car saveCar(Car car) {
		return carRepository.save(car);
	}

	public Car updateCar(int id, Car car) {
		Optional<Car> retrievedCar = carRepository.findById(id);
		if (retrievedCar.isPresent()) {
			carRepository.save(car);
		} else {

			try {
				throw new Exception("Car not found:" + id);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return carRepository.findById(id).get();
	}

	public Car deleteCar(int carId) {
		Optional<Car> retrievedCar = carRepository.findById(carId);
		if (retrievedCar.isPresent()) {
			carRepository.deleteById(carId);
		} else {

			try {
				throw new Exception("Car not found:" + carId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return retrievedCar.get();
		
	}

	
}
