
package eu.epfc.cours3449.l14;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        String[] stable = new String[2];
        ArrayList<String> als = new ArrayList<>();
        
        stable[0] = "Alain";
        als.add("Alain");
        
        stable[1] = "Margot";
        als.add("Margot");
        
        als.add("Didier");
        
        for(int i=0; i<stable.length; i++) {
            System.out.println(stable[i]);
        }
        
        for(int i=0; i<als.size(); i++) {
            System.out.println(als.get(i));
        }
        System.out.println("\nLe dernier "+als.get(als.size()-1));
        
    }
    
}
