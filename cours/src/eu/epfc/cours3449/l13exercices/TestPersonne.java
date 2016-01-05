package eu.epfc.cours3449.l13exercices;

public class TestPersonne {

    public static void main(String[] args) {
        Personne[] ps = new Personne[4];
        ps[0] = new Personne("Dubois", "Jean", "Rue du Paradis 4, 1000 Bruxelles", "023418811", 25, "belge");
        ps[1] = new Personne("Durant", "Marcelle", "Rue des nuages 5, 1000 Bruxelles", "027002011", 80, "belge");
        ps[2] = new Personne("Dubois", "Jean", "Rue du Paradis 4, 1000 Bruxelles", "023418811", 25, "belge");
        ps[1] = new Personne("Alembert", "Jeanne", "Rue du Talent 1, 1000 Bruxelles", "021122331", 50, "belge");
        for(int i=0; i<ps.length-1; i++) {
            for(int j=i+1; j<ps.length; j++) {
                if(ps[i].equals(ps[j])) {
                    System.out.println(i + " equals " + j);
                    System.out.println(i + " : " + ps[i].toString());
                    System.out.println(j + " : " + ps[j].toString() );
                }
            }
        }
    }

}
