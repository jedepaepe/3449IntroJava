
package eu.epfc.cours3449.l15.Part2Abstract;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(new Object());
        a.add(new Integer(10));
        a.add(new String("hi"));
        for(int i=0; i<a.size(); i++) {
            System.out.println(a.get(i));
            if(a.get(i) instanceof String) {
                String s = (String) a.get(i);
                System.out.println(s.contains("hi"));
            }
        }
        
        System.out.println("");
        ArrayList<String> s = new ArrayList<>();
        s.add("S1");
        s.add("S2");
        for(int i=0; i<s.size(); i++) {
            System.out.println(s.get(i));
            System.out.println(s.get(i).contains("S"));
        }
    }
    
}
