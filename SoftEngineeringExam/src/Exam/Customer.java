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
public class Customer {
    private ArrayList<Transactions> transactions = new ArrayList<>();    
    private ArrayList<String> emails = new ArrayList<>();


    public void setTransactions(Transactions trx) {
        if (!transactions.contains(trx)) {
            this.transactions.add(trx);
        }
    }

    public void printAll(){
        System.out.println("Customer");
        System.out.print("Transactions : [ ");
        for (Transactions trx : transactions) {
            System.out.print(trx + ",");
        }
        System.out.println("]");
        System.out.print("Emails : [ ");
        for (String eml : emails) {
            System.out.print(eml + ",");
        }
        System.out.println("]");
    }

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }
    
    
}
