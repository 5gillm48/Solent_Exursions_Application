/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solent.objects;

import java.util.ArrayList;

/**
 *
 * @author Awanish
 */
public class PickUpPoints {
    private String pickUpPointsName;
    private ArrayList<Vehicle> vehicles;

    public void setPickUpPointsName(String pickUpPointsName) {
        this.pickUpPointsName = pickUpPointsName;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getPickUpPointsName() {
        return pickUpPointsName;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    
    
}
