package com.example.itrips.api.models;
import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class VehicleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long vehicleId;

    private String vehiclePlates;
    private String VehicleBranch;
    private String VehicleModell;
    private Integer VehicleModelYear;
    private Integer VehicleStatus;

    public long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getVehiclePlates() {
        return vehiclePlates;
    }
    public void setVehiclePlates(String vehiclePlates) {
        this.vehiclePlates = vehiclePlates;
    }
    public String getVehicleBranch() {
        return VehicleBranch;
    }
    public void setVehicleBranch(String vehicleBranch) {
        VehicleBranch = vehicleBranch;
    }
    public String getVehicleModell() {
        return VehicleModell;
    }
    public void setVehicleModell(String vehicleModell) {
        VehicleModell = vehicleModell;
    }
    public Integer getVehicleModelYear() {
        return VehicleModelYear;
    }
    public void setVehicleModelYear(Integer vehicleModelYear) {
        VehicleModelYear = vehicleModelYear;
    }
    public Integer getVehicleStatus() {
        return VehicleStatus;
    }
    public void setVehicleStatus(Integer vehicleStatus) {
        VehicleStatus = vehicleStatus;
    }
    
    
}
