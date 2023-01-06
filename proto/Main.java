package proto;
import proto.Classes.Classe;
import proto.Race.Race;
import proto.Race.ToutesLesRaces;
import proto.Stat.*;

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

        Task : créer une fonction "DemanderOuiOuNon" pour toute confirmation.

        Question pour Philip :
        1. Comment bien gérer les dossiers (problème d'import lors des tests) ?
        2. Comment appeler une fonction créée dans le main.java, voir exemple test tout en bas ?
        3. Quand peut-on fermer le ou les scanners dans le fichier "Entrée utilisateur" ?
*/
    public static void main(String[] args) {

        // variable boolean pour pouvoir passer la création de personnage.
        // true pour avoir un personnage par defaut, false pour créer le personnage manuellement.
        boolean passerCreationPersonnage = false;

        Main monMain = new Main();
        EntreUtilisateur eUtil = new EntreUtilisateur();
        lesPersonnagesEnCombat persoEnCombat = new lesPersonnagesEnCombat();

        Personnage persoDeBase = new Personnage(
                "default", null, null, 5, 100, 100, new Force(5), new Intelligence(5), new Agilite(5), new Dexterite(5), new Constitution(5));

        Combat combatClass = new Combat();


        String joueurPseudo;
        Race joueurRace;
        Classe joueurClasse;
        Equipement joueurArme;

        if (passerCreationPersonnage) {

                joueurPseudo = "Sans nom";
                joueurRace = ToutesLesRaces.GetInstance().elfe;
                joueurClasse = ToutesLesClasses.GetInstance().archer;
                joueurArme = Arsenal.GetInstance().getDague();

        } else {

        // Definition du pseudo.
        joueurPseudo = eUtil.EntreeUtilisateurString("Bonjour,\nVeuillez entrer un pseudo.");
        System.out.println("votre pseudo sera " + joueurPseudo + ".\n");
        // post-it : demander confirmation pour le nom.

        // Definition de la race.
        joueurRace = eUtil.ChoixRace();

        // Definition de la classe.
        joueurClasse = eUtil.ChoixClasse();

        joueurArme = Arsenal.GetInstance().getDague();

        }

        int joueurNiveauInitial = 5;
        int joueurVieDeBase = 100;
        int joueurManaDeBase = 100;

        Force joueurForceDeBase = new Force(persoDeBase.GetForce().GetValeur() + joueurRace.GetforceBonus().GetValeur() + joueurClasse.GetforceBonus().GetValeur());
        
        Intelligence joueurIntelligenceDeBase = new Intelligence(persoDeBase.GetIntelligence().GetValeur() + joueurRace.GetIntelligenceBonus().GetValeur() + joueurClasse.GetIntelligenceBonus().GetValeur());
        
        Agilite joueurAgiliteDeBase = new Agilite(persoDeBase.GetAgilite().GetValeur() + joueurRace.GetAgiliteBonus().GetValeur() + joueurClasse.GetAgiliteBonus().GetValeur());
        
        Dexterite joueurDexteriteDeBase = new Dexterite(persoDeBase.GetDexterite().GetValeur() + joueurRace.GetDexteriteBonus().GetValeur() + joueurClasse.GetDexteriteBonus().GetValeur());
        
        Constitution joueurConstitutionDeBase = new Constitution(persoDeBase.GetConstitution().GetValeur() + joueurRace.GetConstitutionBonus().GetValeur() + joueurClasse.GetConstitutionBonus().GetValeur());


        // Création de l'objet joueur.
        // post-it : tout remettre sur une ligne a la fin
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
                joueurArme,
                50,
                50
        ); // peut etre obsolete !!!
/*
        System.out.println(persoEnCombat.lePersonnageJouable.GetNom());

        System.out.println("");

        persoEnCombat.lePersonnageJouable.equals(joueur);

        persoEnCombat.lePersonnageJouable.SetNom(joueurPseudo);

        System.out.println("");

        System.out.println(persoEnCombat.lePersonnageJouable.GetNom());

        System.out.println(joueur.toString());

        System.out.println("");
*/
        combatClass.SeBattre();


        // Fermeture du scanner de EntreeUtilisateur. (test)
        eUtil.fermerScanner();
        
    }

}


