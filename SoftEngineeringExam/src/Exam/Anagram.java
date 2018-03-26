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
public class Anagram {    
    public void cek(String p1, String p2){
        ArrayList<Character> buang = new ArrayList<>();
        ArrayList<Character> str1 = new ArrayList<>();
        ArrayList<Character> str2 = new ArrayList<>();
        
        for (char c : p1.toCharArray()) {
            str1.add(c);
        }
        
        for (char c : p2.toCharArray()) {
            str2.add(c);
        }
        
        for (Character char1 : str1) {
            if(!str2.contains(char1)){
                buang.add(char1);
            }
        }
        
        for (Character char2 : str2) {
            if(!str1.contains(char2)){
                buang.add(char2);
            }
        }
        
        System.out.print(buang.size() + " # Removing ");
        for (Character b : buang) {
            System.out.print(b + " ");
        }
    }    
}
