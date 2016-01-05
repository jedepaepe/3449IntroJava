
package eu.epfc.cours3449.l14;

public class TestEquals {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        
        refEqual(o1, o2);
        System.out.println(o1.equals(o2));
        
        o1 = o2;
        refEqual(o1, o2);
        System.out.println(o1.equals(o2));
        
    }

    private static void refEqual(Object o1, Object o2) {
        if(o1 == o2) {
            System.out.println("o1 == o2");
        } else {
            System.out.println("o1 != o2");
        }
    }
}
