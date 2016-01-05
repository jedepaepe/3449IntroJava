
package eu.epfc.cours3449.l14;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + " Circle{" + "radius=" + radius + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof Circle)) {
            return false;
        }
        final Circle other = (Circle) obj;
        return equals(other);
    }

    
    public boolean equals(Circle c) {
        if(radius == c.getRadius() && (getColor().equals(c.getColor()))) {
            return true;
        }
        return false;
    }
    
    
 
    public static void main(String[] args) {
        Circle c = new Circle(10, "jaune");
        System.out.println(c.toString());
    }
}