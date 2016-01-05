
package eu.epfc.cours3449.l14;

public class GeometricObject extends Object {
    private String color;

    public GeometricObject() {
        System.out.println("GeometricObject() appelé");;
    }

    public GeometricObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Color = " + color;
    }

    public static void main(String[] args) {
        GeometricObject g = new GeometricObject("brun");
        String s = g.toString();
        System.out.println(s + " " + g.hashCode());
    }
}
