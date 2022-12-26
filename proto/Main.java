package proto;

/**
 * main, créé par David
 */
public class Main {

    public static void main(String[] args) {

        // Création du joueur.
        Joueur joueur = new Joueur(
                "le nouveau",
                null,
                null,
                5,
                100,
                100,
                new Force(5),
                new Intelligence(5),
                new Agilite(5),
                new Dexterite(5),
                new Constitution(5),
                Arsenal.GetInstance().epee,
                50,
                50);

        // print d'un toString
        System.out.println(Arsenal.GetInstance().epee.toString());

        // Le print de joueur est assez envahissant, faut que je jette un oeil à ca.
        //System.out.println(joueur.toString());

    }

}