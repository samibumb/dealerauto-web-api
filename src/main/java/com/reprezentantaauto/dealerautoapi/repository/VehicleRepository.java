package com.reprezentantaauto.dealerautoapi.repository;

import com.reprezentantaauto.dealerautoapi.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle , Long> {

    void deleteByBrand(String brand);

    void deleteByIdAndBrand(long id, String brand);

    Vehicle findByBrandAndAndModel(String brand, String model);
}
