package com.Registry.Reg.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity


public class User {
   @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer deviceID;
    private String firstName;
    private String lastName;
    private String computerModel;

    public User(int deviceID, String firstName, String lastName, String computerModel) {
        this.deviceID = deviceID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.computerModel = computerModel;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getComputerModel() {
        return computerModel;
    }

    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }
}


