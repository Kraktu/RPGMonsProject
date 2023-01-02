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

        Task : créer une fonction "DemanderOuiOuNon" pour toute confirmation

*/

    public static void main(String[] args) {

        EntreUtilisateur eUtil = new EntreUtilisateur();
        Personnage persoDeBase = new Personnage(
                "default", null, null, 5, 100, 100, new Force(5), new Intelligence(5), new Agilite(5), new Dexterite(5), new Constitution(5));
/*
        String race = eUtil.EntreeUtilisateur("Veuillez choisir une race,\nVoici les différentes races possible :\nHumain - Elfe - Nain - Troll - Gobelin ");

        System.out.println(race);
*/
        // Definition du pseudo.
        //String joueurPseudo = eUtil.EntreeUtilisateur("Bonjour,\nVeuillez entrer un pseudo.");
        //System.out.println("votre pseudo sera " + joueurPseudo + ".\n"); // demander confirmation

        String joueurPseudo = "default";

        Race joueurRace = ToutesLesRaces.GetInstance().humain;
        Classe joueurClasse = ToutesLesClasses.GetInstance().archer;

        int joueurNiveauInitial = 5;
        int joueurVieDeBase = 100;
        int joueurManaDeBase = 100;

        Force joueurForceDeBase = new Force(persoDeBase.GetForce().GetValeur() + joueurClasse.GetforceBonus().GetValeur());
        Intelligence joueurIntelligenceDeBase = new Intelligence(persoDeBase.GetIntelligence().GetValeur() + joueurClasse.GetIntelligenceBonus().GetValeur());
        Agilite joueurAgiliteDeBase = new Agilite(persoDeBase.GetAgilite().GetValeur() + joueurClasse.GetAgiliteBonus().GetValeur());
        Dexterite joueurDexteriteDeBase = new Dexterite(persoDeBase.GetDexterite().GetValeur() + joueurClasse.GetDexteriteBonus().GetValeur());
        Constitution joueurConstitutionDeBase = new Constitution(persoDeBase.GetConstitution().GetValeur() + joueurClasse.GetConstitutionBonus().GetValeur());

        //Agilite joueurAgiliteDeBase = new Agilite(5);
        //Dexterite joueurDexteriteDeBase = new Dexterite(5);
        //Constitution joueurConstitutionDeBase = new Constitution(5);


        // Création du joueur.
        // tout remettre sur une ligne a la fin
        Joueur joueur = new Joueur(
                joueurPseudo,
                joueurRace,
                joueurClasse,
                joueurNiveauInitial,
                joueurVieDeBase,
                joueurManaDeBase,
                joueurForceDeBase,
                joueurIntelligenceDeBase,
                joueurAgiliteDeBase,
                joueurDexteriteDeBase,
                joueurConstitutionDeBase,
                Arsenal.GetInstance().epee,
                50,
                50
        );

        System.out.println(joueur.toString());



    }

}


