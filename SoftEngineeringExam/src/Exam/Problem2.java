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
public class Problem2 {
    public static void main(String[] args) {
        ArrayList<Transactions> transaksi = new ArrayList<>();        
        ArrayList<Customer> customer = new ArrayList<>();

        int id;
        String email, phone, card;
        
        Transactions trx1 = new Transactions(1, "e1", "p1", "c1");
        Transactions trx2 = new Transactions(2, "e2", "p2", "c2");
        Transactions trx3 = new Transactions(3, "e1", "p3", "c3");
        Transactions trx4 = new Transactions(5, "e1", "p4", "c4");
        
        transaksi.add(trx1);
        transaksi.add(trx2);
        transaksi.add(trx3);
        transaksi.add(trx4);
        
        for (Transactions transactions : transaksi) {
            if(customer.isEmpty()){
                Customer c1 = new Customer();
                c1.setTransactions(transactions);
            } else {
                for (Customer cust : customer) {
                    cust.getTransactions();
                }
            }
        }
    }
}
