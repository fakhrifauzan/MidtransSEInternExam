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
public class Problem7 {
    public static void main(String[] args) {
        ArrayList<String> customer = new ArrayList<>();
        
        Scanner x = new Scanner(System.in);
        System.out.print("input : ");
        String n = x.nextLine();

        for (int i = 1; i <= Integer.parseInt(n); i++) {
            System.out.print("input : ");
            String z = x.nextLine();
            
            String hasil[] =  z.split(" ");
            String perintah = hasil[0];
            
            if (perintah.equals("add")) {
                customer.add(hasil[1]);
            } else if (perintah.equals("find")) {
                int jml = 0;
                for (String cek : customer) {
                    if (cek.startsWith(hasil[1])) {
                        jml++;
                    }
                }
                System.out.println(jml + " # because there are " + jml + " names started with '" + hasil[1] + "'");
            } else {
                System.out.println("Invalid Function");
                break;
            }
        }
    }
}
