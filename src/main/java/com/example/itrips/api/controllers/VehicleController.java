package com.example.itrips.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itrips.api.models.VehicleModel;
import com.example.itrips.api.services.VehicleService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/vehicle")
@CrossOrigin("*")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @GetMapping(path = "/getVehicles")
    public ArrayList<VehicleModel> getVehicles() {
        return vehicleService.getVehicles();
    }

    @PostMapping(value = "/saveVehicle")
    public VehicleModel saveVehicle(@RequestBody VehicleModel vehicle) {
        return this.vehicleService.saveVehicle(vehicle);
    }
}
