package proto;

/**
 * main, créé par David
 */
public class Main {

/*

A) Création du personnage 

        1) On nous demande notre pseudo
        2) On nous propose de choisir une Race (Humain, Elfe, Nain, Troll, Gobelin)
        3) On nous propose de choisir une Classe (Archer, Guerrier, Mage, Voleur)
        4) On nous propose de répartir 5 points dans les caractéristiques que l'on veut (Force, Intelligence, Agilité, Dextérité, Constitution).

*/

    public static void main(String[] args) {
/*
        EntreUtilisateur eUtil = new EntreUtilisateur();

        String race = eUtil.EntreeUtilisateur("Veuillez choisir une race,\nVoici les différentes races possible :\nHumain - Elfe - Nain - Troll - Gobelin ");

        System.out.println(race);
*/

        String joueurPseudo = "le bleu";
        Race joueurRace = ToutesLesRaces.GetInstance().humain;
        Classe joueurClasse = ToutesLesClasses.GetInstance().guerrier;
        int joueurNiveauInitial = 5;
        int joueurVieDeBase = 100;


        // Création du joueur.
        // tout remettre sur une ligne a la fin
        Joueur joueur = new Joueur(
                joueurPseudo,
                joueurRace,
                joueurClasse,
                joueurNiveauInitial,
                joueurVieDeBase,
                100,
                new Force(5),
                new Intelligence(5),
                new Agilite(5),
                new Dexterite(5),
                new Constitution(5),
                Arsenal.GetInstance().epee,
                50,
                50
        );



        System.out.println(joueur.toString());



    }

}


