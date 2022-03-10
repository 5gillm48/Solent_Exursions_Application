/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solent.controller;

import com.solent.objects.PickUpPoints;
import com.solent.objects.Route;
import com.solent.objects.Vehicle;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mandeep
 */
public class DataController {
    private static ArrayList<Route> routes = new ArrayList<>();
    
    public static void addRoute(String routeName, String points){
        
        String[] pickUpPoints = points.split(",");
        ArrayList<PickUpPoints> pickUpPoint = new ArrayList<>();
        
         for(String s : pickUpPoints){
           if(!s.equals("")){
                PickUpPoints picks = new PickUpPoints();
                picks.setPickUpPointsName(s);
                picks.setVehicles(addVehicle());
                pickUpPoint.add(picks);
           }
        }
        Route route = new Route();
        route.setRouteName(routeName);
        route.setPickUpPoints(pickUpPoint);
        routes.add(route);
    }
    
    public static ArrayList<Vehicle> addVehicle(){
        
        Vehicle mini = new Vehicle();
        mini.setVehicleType("Mini_Bus");
        mini.setAccess(true);
        mini.setSeatNo(55);
        
        Vehicle coach = new Vehicle();
        coach.setVehicleType("coach");
        coach.setAccess(true);
        coach.setSeatNo(70);
        
        Vehicle privateCar = new Vehicle();
        privateCar.setVehicleType("privateCar");
        privateCar.setAccess(true);
        privateCar.setSeatNo(15);
        
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(mini);
        vehicles.add(coach);
        vehicles.add(privateCar);
        
        return vehicles;
    }
    
    public static ArrayList<Route> getRoutes(){
        return routes;
    }
    
    public static void setRoutes(ArrayList<Route> route){
        routes = route;
    }
    
    public static void setPickPoint(String routeName, String pickPoint){
        for(Route r : routes){
            if(r.getRouteName().equals(routeName)){
                ArrayList<PickUpPoints> pickUpPoints = r.getPickUpPoints();
                PickUpPoints pick = new PickUpPoints();
                pick.setPickUpPointsName(pickPoint);
                pick.setVehicles(addVehicle());
                pickUpPoints.add(pick);
                r.setPickUpPoints(pickUpPoints);
                break;
            }
        }
    }
    
    public static void removePickPoint(String routeName, String pickPoint){
        Route route = new Route();
        JOptionPane.showMessageDialog(null, routeName + " " + pickPoint);
        for(Route r : routes){
            if(r.getRouteName().equals(routeName)){
                route = r;
                routes.remove(r);
                break;
            }
        }
        
        ArrayList<PickUpPoints> pickUpPoints = route.getPickUpPoints();
        route.setPickUpPoints(null);
        for(PickUpPoints p : pickUpPoints){
            if(p.getPickUpPointsName().equals(pickPoint)){
                PickUpPoints pick = new PickUpPoints();
                pickUpPoints.remove(p);
                route.setPickUpPoints(pickUpPoints);
                routes.add(route);
                break;
            }
        }
    }
    
     public static ArrayList<PickUpPoints> getPickUpPoints(String routeName){
         for(Route r : routes){
             if(r.getRouteName().equals(routeName)){
                ArrayList<PickUpPoints> pickUpPoints = r.getPickUpPoints();
                return pickUpPoints;
             }
         }
         return null;
     }
     
     public static void deleteRoute(String routeName){
        Route route = new Route();
         for(Route r : routes){
             if(r.getRouteName().equals(routeName)){
                 routes.remove(r);
                 break;
             }
         }
     }
     
     public static void deleteRow(String routeName, String pick, String vehicleName){
         Route route = new Route();
         for(Route r : routes){
             if(r.getRouteName().equals(routeName)){
                 route = r;
                 routes.remove(r);
                 break;
             }
         }
        ArrayList<PickUpPoints> pickUpPoints = route.getPickUpPoints();
        PickUpPoints picks = new PickUpPoints();
        for(PickUpPoints p : pickUpPoints){
            if(p.getPickUpPointsName().equals(pick)){
                picks = p;
                pickUpPoints.remove(picks);
                break;
            }
        }
        ArrayList<Vehicle> vehicles = picks.getVehicles();
        Vehicle ve = new Vehicle();
        for(Vehicle v : vehicles){
            if(v.getVehicleType().equals(vehicleName)){
                ve = v;
                vehicles.remove(ve);
                break;
            }
        }
        picks.setVehicles(vehicles);
        pickUpPoints.add(picks);
        route.setPickUpPoints(pickUpPoints);
        routes.add(route);
     }
}
