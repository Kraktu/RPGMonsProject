package proto;
/**
 * main, créé par David
 */
public class Main {

    public static void main(String[] args) {

        // Création du joueur.
        // tout remettre sur une ligne a la fin
        Joueur joueur = new Joueur(
                "le nouveau",
                ToutesLesRaces.GetInstance().humain,
                ToutesLesClasses.GetInstance().guerrier,
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
        // System.out.println(Arsenal.GetInstance().epee.toString());

        System.out.println(joueur.toString());

        // System.out.println(joueur.GetEquipement());

    }

}