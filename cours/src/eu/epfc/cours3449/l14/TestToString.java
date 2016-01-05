/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.epfc.cours3449.l14;

/**
 *
 * @author jedepaepe
 */
public class TestToString {
    public static void main(String[] args) {
        Object[] os = new Object[6];
        os[0] = new Object();
        os[1] = new GeometricObject("blanc");
        os[2] = new Circle(100, "noir");
        os[3] = new Square(1000, "orange");
        os[4] = new Object();
        os[5] = new Square(5500, "rose");
        for(int i=0; i < os.length; i++) {
            System.out.println(os[i].toString());
            // ((Circle) os[i]).getRadius(); // bug
            if(os[i] instanceof Circle) {
                Circle c = (Circle) os[i];
                System.out.println(i + " est un cercle de rayon " + c.getRadius());
            }
            if(os[i] instanceof Square) {
                Square s = (Square) os[i];
                System.out.println(i + " est un carré de côté " + s.getSide());
            }
        }
        
        Circle c = new Circle(100, "noir");
        for(int i=0; i<os.length;i++) {
            if(c.equals(os[i])) {
                System.out.println("Trouvé : " + i);
            }
        }
        
        displayObject(new Circle(4, "violet"));
        displayObject(new Square(6, "vert"));
    }
    
    public static void displayObject(GeometricObject geo) {
        System.out.println(geo.toString());
    }
    
}
