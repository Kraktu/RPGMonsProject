package proto;
import proto.Fonctions.*;

/**
 * main, créé par David
 */
public class Main {
/*
A) Création du personnage.

        1) On nous demande notre pseudo.
        2) On nous propose de choisir une Race (Humain, Elfe, Nain, Troll, Gobelin).
        3) On nous propose de choisir une Classe (Archer, Guerrier, Mage, Voleur).
        4) On nous propose de répartir 5 points dans les caractéristiques que l'on veut (Force, Intelligence, Agilité, Dextérité, Constitution).

        Question pour Philip :
        1. Quand peut-on fermer le ou les scanners dans le fichier "Entrée utilisateur" ?
*/
    public static void main(String[] args) {

        // variable boolean pour pouvoir passer la création de personnage.
        // true pour avoir un personnage par defaut, false pour créer le personnage manuellement.
        final boolean passerCreationPersonnage = true;

        // défini si le jeu en lui même est en cours ou non
        boolean aventureEnCours = false;

        EntreUtilisateur eUtil = new EntreUtilisateur();
        CreationDePersonnage creationDePersonnage = new CreationDePersonnage();
        lesPersonnagesEnCombat lesPersos = new lesPersonnagesEnCombat();
        Combat combatClass = new Combat();


        // Création du personnage joueur.

        if (passerCreationPersonnage) {
               creationDePersonnage.CreerJoueurRapide();
               System.out.println(creationDePersonnage.lePersonnageJouable.toString());
        } else {
                creationDePersonnage.CreerJoueur();
                System.out.println(creationDePersonnage.lePersonnageJouable.toString());
        }


        // Début de l'aventure.

        int choixEntreLesCombats;
        aventureEnCours = true;

        System.out.println("");

        while (aventureEnCours) {

                do {

                        choixEntreLesCombats = eUtil.EntreeUtilisateurInt("Que voulez-vous faire ?\n[1 : continuer]\n[2 : autre]\n[3 : quitter]");

                        switch (choixEntreLesCombats) {
                                case 1:
                                        System.out.println("Vous vous battez !");
                                        combatClass.SeBattre();
                                        break;
                                case 2:
                                        System.out.println("Un autre évènement se produit !");
                                        break;
                                case 3:
                                        System.out.println("Au revoir.");
                                        aventureEnCours = false;
                                        break;
                                default:
                                        System.out.println("ERREUR.");
                                        break;
                        }

                } while (choixEntreLesCombats < 1 || choixEntreLesCombats > 3);

        }

        // Fermeture du scanner de EntreeUtilisateur. (test)
        eUtil.fermerScanner();

    }

}