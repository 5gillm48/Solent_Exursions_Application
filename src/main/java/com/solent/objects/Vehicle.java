/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solent.objects;

/**
 *
 * @author Awanish
 */
public class Vehicle {
    
    
    private String vehicleType;
    private int seatNo;
    private boolean access;

    public String getVehicleType() {
        return vehicleType;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public boolean isAccess() {
        return access;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

   
}
