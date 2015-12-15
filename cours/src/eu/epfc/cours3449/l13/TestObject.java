
package eu.epfc.cours3449.l13;

import javafx.scene.control.Button;

public class TestObject {
    double d = 273.15;
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.toString());
        System.out.println(o.hashCode());
        System.out.println( Integer.toHexString(o.hashCode()));
        System.out.println("");
        
        Object[] os = new Object[4];
        os[0] = o;
        // os[1] = new Button("coucou"); // interdit : problème de contexte TBC
        os[1] = new Vehicule();
        os[2] = new String("This is a string");
        os[3] = new TestObject();
        for(int i=0; i<os.length; i++) {
            System.out.println(os[i].toString());
        }
    }
    
    @Override
    public String toString() {
        return "TestObject " + d;
    }    
}
