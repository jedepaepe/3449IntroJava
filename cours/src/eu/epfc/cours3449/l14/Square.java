
package eu.epfc.cours3449.l14;

public class Square extends GeometricObject {
    private double side;

    public Square() {
        // le constructeur de la classe mère est appelé implicitement
        // pas la peine d'écrire:
        // super();
    }

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public String toString() {
        return getColor() + ", " + side;
    }
    
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq.getSide());
        System.out.println(sq.getColor());
        
        sq = new Square(5, "blanc");
        System.out.println(sq.getSide());
        System.out.println(sq.getColor());
        System.out.println(sq.toString());
        
        double d;
        // System.out.println(d); // error : vous devez l'initialiser
    }
}
