/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solent.objects;

import java.util.ArrayList;

/**
 *
 * @author Mandeep
 */
public class Route {
    private String routeName;
    private ArrayList<PickUpPoints> pickUpPoints;

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public void setPickUpPoints(ArrayList<PickUpPoints> pickUpPoints) {
        this.pickUpPoints = pickUpPoints;
    }

    public String getRouteName() {
        return routeName;
    }

    public ArrayList<PickUpPoints> getPickUpPoints() {
        return pickUpPoints;
    }
    
    
}
