package com.example.itrips.api.models;

import javax.persistence.*;

@Entity
@Table(name = "operator")
public class OperatorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long operatorId;

    private String operatorFGivenName;
    private String operatorSGivenName;
    private String operatorFLastName;
    private String operatorSLastName;
    private String licence;
    private String phoneNumber;
    private Integer status;
    private long vehicleId;

    public long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(long operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorFGivenName() {
        return operatorFGivenName;
    }

    public void setOperatorFGivenName(String operatorFGivenName) {
        this.operatorFGivenName = operatorFGivenName;
    }

    public String getOperatorSGivenName() {
        return operatorSGivenName;
    }

    public void setOperatorSGivenName(String operatorSGivenName) {
        this.operatorSGivenName = operatorSGivenName;
    }

    public String getOperatorFLastName() {
        return operatorFLastName;
    }

    public void setOperatorFLastName(String operatorFLastName) {
        this.operatorFLastName = operatorFLastName;
    }

    public String getOperatorSLastName() {
        return operatorSLastName;
    }

    public void setOperatorSLastName(String operatorSLastName) {
        this.operatorSLastName = operatorSLastName;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }
}
