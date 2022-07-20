package com.booking.recruitment.hotel.repository;

import com.booking.recruitment.hotel.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, Long> {
//	sortBy=distance
@Query(value = "SELECT * FROM City WHERE id =:id FETCH FIRST 3", nativeQuery = true)
	public City getCityById(long id);
    
}

