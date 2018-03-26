/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.ArrayList;

/**
 *
 * @author Fakhri Fauzan
 */
public class Problem4 {
    public static void main(String[] args) {
        ArrayList<Passanger> penumpang = new ArrayList<>();        
        ArrayList<Passanger> lift = new ArrayList<>();        
        ArrayList<Passanger> naik = new ArrayList<>();
        ArrayList<Passanger> turun = new ArrayList<>();
        
        Passanger p1 = new Passanger(1, 1, 5);
        Passanger p2 = new Passanger(2, 2, 3);
        Passanger p3 = new Passanger(3, 2, 4);
        Passanger p4 = new Passanger(4, 3, 4);
        Passanger p5 = new Passanger(5, 3, 1);
        Passanger p6 = new Passanger(6, 5, 1);
        
        penumpang.add(p1);
        penumpang.add(p2);
        penumpang.add(p3);
        penumpang.add(p4);
        penumpang.add(p5);
        penumpang.add(p6);
        
        int min = 1;
        int max = 5;
        int cost = 0;
        
        for (int i = min; i <= max; i++) {
            for (Passanger p : penumpang) {
                if (p.getOrig() == i) {
                    lift.add(p);
                    naik.add(p);
                    penumpang.remove(p);
                    cost = cost + 2;
                    System.out.println("Penumpang " + p.getId() + " Naik");
                }

            }
            if (!lift.isEmpty()) {
                for (Passanger isi : lift) {
                    if (isi.getDest()== i) {
                        turun.add(isi);
                        lift.remove(isi);
                        cost = cost + 2;
                        System.out.println("Penumpang " + isi.getId() + " Turun");
                    }
                }
            }
            cost = cost + 1;
        }
        
        for (int i = max; i <= min; i--) {
            if (!lift.isEmpty()) {
                for (Passanger isi : lift) {
                    if (isi.getDest()== i) {
                        turun.add(isi);
                        lift.remove(isi);
                        cost = cost + 2;
                        System.out.println("Penumpang " + isi.getId() + " Turun");
                    }
                }
            }
            cost = cost + 1;
        }
        System.out.println("Total Cost : " + cost);
    }
}
