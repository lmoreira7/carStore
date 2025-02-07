package com.github.lmoreira7.carStore.controller;

import com.github.lmoreira7.carStore.entity.vehicle;
import com.github.lmoreira7.carStore.service.vehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class vehicleController {
    private vehicleService VehicleService;

    public vehicleController(vehicleService VehicleService) {
        this.VehicleService = VehicleService;
    }

    @PostMapping
    List<vehicle> create(@RequestBody vehicle Vehicle) {
        return VehicleService.create(Vehicle);
    }

    @GetMapping
    List<vehicle> list() {
        return VehicleService.list();
    }

    @PutMapping()
    List<vehicle> update(@RequestBody vehicle Vehicle) {
        return VehicleService.update(Vehicle);
    }

    @DeleteMapping("{id}")
    List<vehicle> delete(@PathVariable("id") Long id) {
        return VehicleService.delete(id);
    }
}
