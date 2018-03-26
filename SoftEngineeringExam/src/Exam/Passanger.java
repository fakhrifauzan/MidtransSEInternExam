/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author Fakhri Fauzan
 */
public class Passanger {
    private int id;
    private int orig;
    private int dest;

    public Passanger(int id, int orig, int dest) {
        this.id = id;
        this.orig = orig;
        this.dest = dest;
    }

    public void setOrig(int orig) {
        this.orig = orig;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public int getOrig() {
        return orig;
    }

    public int getDest() {
        return dest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
