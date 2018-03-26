/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Fakhri Fauzan
 */
public class Problem5 {
    public static void main(String[] args) {
        ArrayList<Bus> station = new ArrayList<>();
        ArrayList<Bus> outside = new ArrayList<>();
        
        Bus b1 = new Bus(LocalTime.of(10,0), LocalTime.of(10,5));
        Bus b2 = new Bus(LocalTime.of(10,5), LocalTime.of(10,15));
        Bus b3 = new Bus(LocalTime.of(10,10), LocalTime.of(10,30));
        Bus b4 = new Bus(LocalTime.of(10,25), LocalTime.of(10,40));
        Bus b5 = new Bus(LocalTime.of(10,45), LocalTime.of(10,50));
        
        outside.add(b1);
        outside.add(b2);
        outside.add(b3);
        outside.add(b4);
        outside.add(b5);
        
        for (int i = 0; i<=55; i+=5){
            LocalTime now = LocalTime.of(10,i);
            
            for (int j = 0; j < outside.size(); j++) {
                Bus bus = outside.get(j);
                if (bus.getA().toString().equals(now.toString())) {
                    station.add(bus);
                    outside.remove(bus);                    
                }
            }
            
            if (!station.isEmpty()) {
                for (int k = 0; k < station.size(); k++) {
                    Bus bus = station.get(k);
                    if (bus.getD().toString().equals(now.toString())) {
                        station.remove(bus);                    
                    }
                }
            }
            System.out.println(now + " : " + station.size() + " Bus ");
        }
    }
}
