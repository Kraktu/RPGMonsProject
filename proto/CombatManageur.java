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

        do {

            if (leJoueurCommence) {
                // Instruction pour le cas où le joueur commence.
                _pointDeVieRestantDeEnnemi = ennemi.GetVie() - FormuleDegat(joueur, ennemi);
                System.out
                        .println("Vous attaquez votre adversaire.\n Il lui reste " + _pointDeVieRestantDeEnnemi + ".");
                ennemi.SetVie(_pointDeVieRestantDeEnnemi);
                _pointDeVieRestantDuJoueur = joueur.GetVie() - FormuleDegat(ennemi, joueur);
                System.out.println(
                        "C'est au tour de votre ennemi de vous attaquer.\nIl vous reste " + _pointDeVieRestantDuJoueur);
                joueur.SetVie(_pointDeVieRestantDuJoueur);
            } else {
                // Instruction pour le cas où l'ennemi commence.
                _pointDeVieRestantDuJoueur = joueur.GetVie() - FormuleDegat(ennemi, joueur);
                System.out.println(
                        "C'est au tour de votre ennemi de vous attaquer.\nIl vous reste " + _pointDeVieRestantDuJoueur);
                joueur.SetVie(_pointDeVieRestantDuJoueur);
                _pointDeVieRestantDeEnnemi = ennemi.GetVie() - FormuleDegat(joueur, ennemi);
                System.out
                        .println("Vous attaquez votre adversaire.\n Il lui reste " + _pointDeVieRestantDeEnnemi + ".");
                ennemi.SetVie(_pointDeVieRestantDeEnnemi);
            }

        } while (_pointDeVieRestantDeEnnemi > 0 && _pointDeVieRestantDuJoueur > 0);

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

    public int FormuleDegat(Personnage _attaquant, Personnage _defenseur) {
        int _degatsFinaux=_attaquant.GetForce().GetValeur() - _defenseur.GetConstitution().GetValeur();
        if (_degatsFinaux==0) {
_degatsFinaux=1;            
        }
        return _degatsFinaux;

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