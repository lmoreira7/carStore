package com.github.lmoreira7.carStore.service;

import com.github.lmoreira7.carStore.entity.vehicle;
import com.github.lmoreira7.carStore.repository.vehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vehicleService {
    private vehicleRepository VehicleRepository;

    public vehicleService(vehicleRepository VehicleRepository) {
        this.VehicleRepository = VehicleRepository;
    }

    public List<vehicle> create(vehicle Vehicle) {
        VehicleRepository.save(Vehicle);
        return list();
    }

    public List<vehicle> list() {
        return VehicleRepository.findAll();
    }

    public List<vehicle> update(vehicle Vehicle) {
        VehicleRepository.save(Vehicle);
        return list();
    }

    public List<vehicle> delete(Long id) {
        VehicleRepository.deleteById(id);
        return list();
    }
}
