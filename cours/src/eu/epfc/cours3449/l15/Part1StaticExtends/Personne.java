
package eu.epfc.cours3449.l15.Part1StaticExtends;

public class Personne {
    static int gen_id = 0;
    private int id;
    private String nom;

    public Personne(String nom) {
        this.id = gen_id;
        gen_id++;
        // this.id = gen_id++; // code condensé
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + '}';
    }
    
    public static void main(String[] args) {
        System.out.println(new Personne("Donatien"));
        System.out.println(new Personne("Jeremy"));
        System.out.println(new Personne("Jo"));
    }
    
}
