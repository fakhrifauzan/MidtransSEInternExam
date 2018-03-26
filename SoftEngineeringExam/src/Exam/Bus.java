/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;
import java.time.LocalTime;

/**
 *
 * @author Fakhri Fauzan
 */
public class Bus {
    private LocalTime a;
    private LocalTime d;

    public Bus(LocalTime a, LocalTime d) {
        this.a = a;
        this.d = d;
    }

    public LocalTime getA() {
        return a;
    }

    public void setA(LocalTime a) {
        this.a = a;
    }

    public LocalTime getD() {
        return d;
    }

    public void setD(LocalTime d) {
        this.d = d;
    }
}
