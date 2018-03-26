/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fakhri Fauzan
 */
public class Problem3 {
    
    ArrayList<String> rule = new ArrayList<>();
    
    public void initializeRule(){
        rule.add("+");        
        rule.add(" ");
        rule.add("-");
        rule.add("(");        
        rule.add(")");
        rule.add("/");        
        rule.add("?");         
        rule.add("*");        
        rule.add(".");
    }
    
    public void normalize(String param){
        String[] number = param.split("");
        ArrayList<Integer> hasil = new ArrayList<>();
        int j = 0;
        for (String i : number) {
            if (!rule.contains(i)) {
                hasil.add(Integer.parseInt(i));
            }
        }
        System.out.print(param + " : ");
        for (int i = 0; i < hasil.size(); i++) {
            System.out.print(hasil.get(i));
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        ArrayList<String> test_cases = new ArrayList<>();
        test_cases.add("-");
        test_cases.add("0");
        test_cases.add("62");
//        test_cases.add("(null)");
        test_cases.add("+6281298490805");
        test_cases.add("6281298490805");
        test_cases.add("08119284411");
        test_cases.add("+1 (804) 244-3470");
        test_cases.add("*083831397998");
        test_cases.add("+1408-888-4919");
        test_cases.add("+1 917 856 9984");
        test_cases.add("?+62 822 42973752?");
        test_cases.add("646.490.2691");
        test_cases.add("+626281322522898");
        test_cases.add("+852-92730944");
        test_cases.add("+62-081377229637");
        test_cases.add("82664848155");
        test_cases.add("08111338062 / 08788");
        test_cases.add("(021) 5736789");

        Problem3 norm = new Problem3();
        norm.initializeRule();
        for (int i = 0; i < test_cases.size(); i++) {
            norm.normalize(test_cases.get(i));
        }
    }
}
