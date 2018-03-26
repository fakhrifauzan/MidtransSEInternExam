/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fakhri Fauzan
 */
public class Transactions {
    private int id;
    private String email, phone, card;

    public Transactions(int id, String email, String phone, String card) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
