package proto;
/**
 * CreationDePersonnage Créé par David, permet de créer le joueur.
 */

import proto.Fonctions.EntreUtilisateur;
import proto.Race.*;
import proto.Classes.*;
import proto.Stat.*;

public class CreationDePersonnage {

    EntreUtilisateur entreUtilisateur = new EntreUtilisateur();
    Personnage persoDeBase = new Personnage("default", null, null, 5, 100, 100, new Force(5), new Intelligence(5), new Agilite(5), new Dexterite(5), new Constitution(5));

    // Les propiétés.
    private String pseudo;
    private Race race;
    private Classe classe;

    private int joueurNiveauInitial;
    private int joueurVieDeBase;
    private int joueurManaDeBase;
    
    private Force joueurForceDeBase;
    private Intelligence joueurIntelligenceDeBase;
    private Agilite joueurAgiliteDeBase;
    private Dexterite joueurDexteriteDeBase;
    private Constitution joueurConstitutionDeBase;

    private Equipement equipement;
    private int experience;
    private int argent;

    private Joueur lePersonnageJouable;

    // getters

    public Joueur GetLePersonnageJouable(){
        return lePersonnageJouable;
    }

    // Fonctions

    public Joueur CreerJoueurRapide(){
        pseudo = "No Name";
        race = ToutesLesRaces.GetInstance().GetHumain();
        classe = ToutesLesClasses.GetInstance().GetGuerrier();
        joueurNiveauInitial = 5;
        joueurVieDeBase = 100;
        joueurManaDeBase = 100;

        joueurForceDeBase = new Force(persoDeBase.GetForce().GetValeur() + race.GetforceBonus().GetValeur() + classe.GetForceBonus().GetValeur());
        joueurIntelligenceDeBase = new Intelligence(persoDeBase.GetIntelligence().GetValeur() + race.GetIntelligenceBonus().GetValeur() + classe.GetIntelligenceBonus().GetValeur());
        joueurAgiliteDeBase = new Agilite(persoDeBase.GetAgilite().GetValeur() + race.GetAgiliteBonus().GetValeur() + classe.GetAgiliteBonus().GetValeur());
        joueurDexteriteDeBase = new Dexterite(persoDeBase.GetDexterite().GetValeur() + race.GetDexteriteBonus().GetValeur() + classe.GetDexteriteBonus().GetValeur());
        joueurConstitutionDeBase = new Constitution(persoDeBase.GetConstitution().GetValeur() + race.GetConstitutionBonus().GetValeur() + classe.GetConstitutionBonus().GetValeur());

        equipement = null;
        experience = 0;
        argent = 0;

        // Construction du personnage jouable.
        lePersonnageJouable = new Joueur(pseudo, race, classe, joueurNiveauInitial, joueurVieDeBase, joueurManaDeBase, joueurForceDeBase, joueurIntelligenceDeBase, joueurAgiliteDeBase, joueurDexteriteDeBase, joueurConstitutionDeBase, equipement, experience, argent);
        return lePersonnageJouable;

    }

    public Joueur CreerJoueur(){
        pseudo = CreerPseudo();
        race = ChoixDeLaRace();
        classe = ChoixDeLaClasse();

        joueurNiveauInitial = 5;
        joueurVieDeBase = 100;
        joueurManaDeBase = 100;

        joueurForceDeBase = new Force(persoDeBase.GetForce().GetValeur() + race.GetforceBonus().GetValeur() + classe.GetForceBonus().GetValeur());
        joueurIntelligenceDeBase = new Intelligence(persoDeBase.GetIntelligence().GetValeur() + race.GetIntelligenceBonus().GetValeur() + classe.GetIntelligenceBonus().GetValeur());
        joueurAgiliteDeBase = new Agilite(persoDeBase.GetAgilite().GetValeur() + race.GetAgiliteBonus().GetValeur() + classe.GetAgiliteBonus().GetValeur());
        joueurDexteriteDeBase = new Dexterite(persoDeBase.GetDexterite().GetValeur() + race.GetDexteriteBonus().GetValeur() + classe.GetDexteriteBonus().GetValeur());
        joueurConstitutionDeBase = new Constitution(persoDeBase.GetConstitution().GetValeur() + race.GetConstitutionBonus().GetValeur() + classe.GetConstitutionBonus().GetValeur());

        equipement = null;
        experience = 0;
        argent = 0;

        // Construction du personnage jouable.
        lePersonnageJouable = new Joueur(pseudo, race, classe, joueurNiveauInitial, joueurVieDeBase, joueurManaDeBase, joueurForceDeBase, joueurIntelligenceDeBase, joueurAgiliteDeBase, joueurDexteriteDeBase, joueurConstitutionDeBase, equipement, experience, argent);
        return lePersonnageJouable;
}

    public String CreerPseudo(){

        String joueurPseudo;
        do {
            joueurPseudo = entreUtilisateur.EntreeUtilisateurString("Veuillez entrer un pseudo.");
            System.out.println("votre pseudo sera " + joueurPseudo + ".\n");
            
        } while (!entreUtilisateur.ConfirmationChoix());
        
        return joueurPseudo;
    }
    public Race ChoixDeLaRace(){
        return entreUtilisateur.ChoixRace();
    }
    public Classe ChoixDeLaClasse(){
        return entreUtilisateur.ChoixClasse();
    }

}