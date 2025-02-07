package com.github.lmoreira7.carStore.repository;

import com.github.lmoreira7.carStore.entity.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehicleRepository extends JpaRepository<vehicle,Long> {

}
