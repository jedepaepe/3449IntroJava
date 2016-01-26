package eu.epfc.cours3449.l17.Part1Personne;

public class TestPersonne {

    public static void main(String[] args) {
        Personne p = new Personne("Alfred", new Adresse("Les maisons", "XL"));
        System.out.println(p);
        p.getAdresse().setRue("Du Coq");
        System.out.println(p);
    }

}
