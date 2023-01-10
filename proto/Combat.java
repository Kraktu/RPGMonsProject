package proto;

import proto.Fonctions.*;

/**
 * Combat crée par Seb
 */
public class Combat {
    lesPersonnagesEnCombat perso = new lesPersonnagesEnCombat();

    public int JetDeDe() {
        int _jet = 0;
        NbrAleatoire nbrAl = new NbrAleatoire();
        try {
            System.out.println("Le dé est lancé.");
            Thread.sleep(1000);
            _jet = nbrAl.GenererNbrAleatoireBorne(1, 6);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur.");
        }
        return _jet;
    }

    public int FormuleDegatPourEnnemi() {
        return perso.GetLePersonnageJouable().GetForce().GetValeur()
                - perso.GetEnnemisActuel().GetConstitution().GetValeur();

    }

    public int FormuleDegatPourJoueur() {
        return perso.GetEnnemisActuel().GetForce().GetValeur()
                - perso.GetLePersonnageJouable().GetConstitution().GetValeur();
    }

    public void QuiCommence() {
        int _votreJet = JetDeDe();
        System.out.println("Vous avez obtenu " + _votreJet + ".");
        int _jetDeVotreAdversaire = JetDeDe();
        System.out.println("Votre adversaire a obtenu " + _jetDeVotreAdversaire + ".");
        if (_votreJet > _jetDeVotreAdversaire) {
            System.out.println("C'est à vous de commencer.");
        } else if (_jetDeVotreAdversaire > _votreJet) {
            System.out.println("Votre adversaire commence.");
        } else {
            System.out.println("égalité.");
            QuiCommence();
        }
    }

    /*
     * public void SeBattre() {
     * 
     * MenuCombat _MenuCombat = new MenuCombat();
     * do {
     * 
     * 
     * _pointDeVieRestant=FormuleDegat(6, 5);
     * 
     * System.out.
     * println("Vous attaquez votre adversaire.\nSes points de vie restants sont " +
     * _pointDeVieRestant );
     * _MenuCombat.ChoixMenuCombat();
     * 
     * _pointDeVieRestant=formuleCombat(50, 9, 2);
     * System.out.println(
     * "Votre adversaire vous attaque. Vos points de vie restant sont " +
     * _pointDeVieRestant);
     * _MenuCombat.ChoixMenuCombat();
     * 
     * 
     * } while (_pointDeVieRestant>0);
     * }.
     */
}