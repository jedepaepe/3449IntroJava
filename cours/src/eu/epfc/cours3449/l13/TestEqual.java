package eu.epfc.cours3449.l13;

public class TestEqual {

    @Override
    public String toString() {
        return "Hey, this code is ... very bad"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return 10; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2));
        o2 = o1;
        System.out.println(o1.equals(o2));
        
        String s1 = new String("s1");
        String s2 = new String("s2");
        System.out.println(s1.equals(s2));
        s2 = "s1";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(o2));
        o2 = s1;
        System.out.println(s1.equals(o2));
        char c =((String) o2).charAt(1);
        System.out.println(c);
    }
}
