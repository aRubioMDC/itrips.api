package com.example.itrips.api.services;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itrips.api.models.VehicleModel;
import com.example.itrips.api.repositories.VehicleRepository;



@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    /**
     * @return
     */
    public ArrayList<VehicleModel> getVehicles() {
        return (ArrayList<VehicleModel>) vehicleRepository.findAll();
    }

    /**
     * @param vehicle
     * @return
     */
    public VehicleModel saveVehicle(VehicleModel vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
