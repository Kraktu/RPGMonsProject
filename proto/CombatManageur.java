package proto;

import proto.Fonctions.*;

/**
 * Combat crée par Seb
 */

// Les changements :
// - constantes joueur et ennemi pour raccourcir les lignes de codes.
// - formule de combat avec deux paramêtre Personnage.

public class CombatManageur {

    // integration des classes.
    final lesPersonnagesEnCombat perso = new lesPersonnagesEnCombat();
    final MenuCombat _MenuCombat = new MenuCombat();


    public void SeBattre(lesPersonnagesEnCombat _lesPerso) {

        int _pointDeVieRestantDuJoueur = 0;
        int _pointDeVieRestantDeEnnemi = 0;

        Joueur joueur = _lesPerso.GetLePersonnageJouable();
        Ennemi ennemi = _lesPerso.GetEnnemisActuel();

        boolean leJoueurCommence = QuiCommence();


        //System.out.println(_lesPerso.GetLePersonnageJouable().GetNom());


        do {

            if (leJoueurCommence) {
                // Instruction pour le cas où le joueur commence.
                _pointDeVieRestantDeEnnemi = ennemi.GetVie() - FormuleDegat(joueur, ennemi);
                System.out.println("Vous attaquez votre adversaire.\n Il lui reste " + _pointDeVieRestantDeEnnemi + ".");

                _pointDeVieRestantDuJoueur = joueur.GetVie() - FormuleDegat(ennemi, joueur);
                System.out.println("C'est au tour de votre ennemi de vous attaquer.\nIl vous reste " + _pointDeVieRestantDuJoueur);

            } else {
                // Instruction pour le cas où l'ennemi commence.
                _pointDeVieRestantDuJoueur = joueur.GetVie() - FormuleDegat(ennemi, joueur);
                System.out.println("C'est au tour de votre ennemi de vous attaquer.\nIl vous reste " + _pointDeVieRestantDuJoueur);

                _pointDeVieRestantDeEnnemi = ennemi.GetVie() - FormuleDegat(joueur, ennemi);
                System.out.println("Vous attaquez votre adversaire.\n Il lui reste " + _pointDeVieRestantDeEnnemi + ".");

            }

        } while (_pointDeVieRestantDeEnnemi > 0 && _pointDeVieRestantDuJoueur > 0);


/*
        do {

            if (leJoueurCommence) {
                // Instruction pour le cas où le joueur commence.
                _pointDeVieRestantDeEnnemi = perso.GetEnnemisActuel().GetVie() - FormuleDegatPourEnnemi();
                System.out.println("Vous attaquez votre adversaire.\n Il lui reste " + _pointDeVieRestantDeEnnemi + ".");
                _pointDeVieRestantDuJoueur = perso.GetLePersonnageJouable().GetVie() - FormuleDegatPourJoueur();
                System.out.println("C'est au tour de votre ennemi de vous attaquer.\nIl vous rest " + _pointDeVieRestantDuJoueur);
            } else {
                // Instruction pour le cas où l'ennemi commence.
                _pointDeVieRestantDuJoueur = perso.GetLePersonnageJouable().GetVie() - FormuleDegatPourJoueur();
                System.out.println("Votre ennemi vous attaque.\nIl vous rest " + _pointDeVieRestantDuJoueur);
                _pointDeVieRestantDeEnnemi = perso.GetEnnemisActuel().GetVie() - FormuleDegatPourEnnemi();
                System.out.println("C'est à votre tour d'attaquer votre adversaire.\n Il lui reste " + _pointDeVieRestantDeEnnemi + ".");
            }

        } while (_pointDeVieRestantDeEnnemi > 0 || _pointDeVieRestantDuJoueur > 0);
*/
    }

    public int JetDeDe() {
        int _jet = 0;
        NbrAleatoire nbrAl = new NbrAleatoire();
        try {
            System.out.println("Le dé est lancé.");
            Thread.sleep(1000);
            _jet = nbrAl.GenererNbrAleatoireBorne(1, 6);
        } catch (Exception e) {
            System.out.println("Erreur.");
        }
        return _jet;
    }

    public int FormuleDegatPourEnnemi() {
        return perso.GetLePersonnageJouable().GetForce().GetValeur() - perso.GetEnnemisActuel().GetConstitution().GetValeur();
    }

    public int FormuleDegatPourJoueur() {
        return perso.GetEnnemisActuel().GetForce().GetValeur() - perso.GetLePersonnageJouable().GetConstitution().GetValeur();
    }

    public int FormuleDegat(Personnage _attaquant, Personnage _defenseur){
        return _attaquant.GetForce().GetValeur() - _defenseur.GetConstitution().GetValeur();
    }

    public boolean QuiCommence() {
        int _votreJet = JetDeDe();
        System.out.println("Vous avez obtenu " + _votreJet + ".");
        int _jetDeVotreAdversaire = JetDeDe();
        System.out.println("Votre adversaire a obtenu " + _jetDeVotreAdversaire + ".");

        if (_votreJet > _jetDeVotreAdversaire) {
            System.out.println("C'est à vous de commencer.");
            return true;

        } else if (_jetDeVotreAdversaire > _votreJet) {
            System.out.println("Votre adversaire commence.");
            return false;

        } else {
            System.out.println("égalité.");
            return QuiCommence();
        }
    }

}