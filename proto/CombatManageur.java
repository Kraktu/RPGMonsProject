package proto;

import proto.Fonctions.*;

/**
 * Combat crée par Seb
 */

public class CombatManageur {

    public void SeBattre(lesPersonnagesEnCombat _lesPerso) {

        MenuCombat menuCombat = ToutesLesFonctions.GetInstance().GetMenuCombat();
        EntreUtilisateur entreeUtilisateur = ToutesLesFonctions.GetInstance().GetEntreUtilisateur();

        int _pointDeVieRestantDuJoueur = 0;
        int _pointDeVieRestantDeEnnemi = 0;
        Joueur joueur = _lesPerso.GetLePersonnageJouable();
        Ennemi ennemi = _lesPerso.GetEnnemisActuel();
        boolean leJoueurCommence;
        boolean combatFini = false;

        while (!combatFini) {

            // tous les personnages peuvent se battre !

            //while (menuCombat.ChoixMenuCombat() == 1) {

                switch (menuCombat.ChoixMenuCombat()) {
                    case 1:

                    leJoueurCommence = QuiCommence();

                    if (leJoueurCommence) {
                        // Instruction pour le cas où le joueur commence.
                        System.out.println("");
                        _pointDeVieRestantDeEnnemi = ennemi.GetVie() - FormuleDegat(joueur, ennemi);
                        entreeUtilisateur.TexteQuiAttend("Vous attaquez votre adversaire.");
                        entreeUtilisateur.TexteQuiAttend("Il lui reste " + _pointDeVieRestantDeEnnemi + " points de vie.");
                        ennemi.SetVie(_pointDeVieRestantDeEnnemi);
    
                        _pointDeVieRestantDuJoueur = joueur.GetVie() - FormuleDegat(ennemi, joueur);
                        entreeUtilisateur.TexteQuiAttend("C'est au tour de votre ennemi de vous attaquer.");
                        entreeUtilisateur.TexteQuiAttend("Il vous reste " + _pointDeVieRestantDuJoueur + " points de vie.");
                        joueur.SetVie(_pointDeVieRestantDuJoueur);
                        // menucombat.ChoixMenuCombat();
                    } else {
                        // Instruction pour le cas où l'ennemi commence.
                        System.out.println("");
                        _pointDeVieRestantDuJoueur = joueur.GetVie() - FormuleDegat(ennemi, joueur);
                        entreeUtilisateur.TexteQuiAttend("C'est au tour de votre ennemi de vous attaquer.");
                        entreeUtilisateur.TexteQuiAttend("Il vous reste " + _pointDeVieRestantDuJoueur + " points de vie.");
                        joueur.SetVie(_pointDeVieRestantDuJoueur);
    
                        _pointDeVieRestantDeEnnemi = ennemi.GetVie() - FormuleDegat(joueur, ennemi);
                        entreeUtilisateur.TexteQuiAttend("Vous attaquez votre adversaire.");
                        entreeUtilisateur.TexteQuiAttend("Il lui reste " + _pointDeVieRestantDeEnnemi + " points de vie.");
                        ennemi.SetVie(_pointDeVieRestantDeEnnemi);
                        // menucombat.ChoixMenuCombat();
                    }
    
                    if (joueur.GetVie() <= 0 || ennemi.GetVie() <= 0) {
                        combatFini = true;
                    }
                        
                        break;
                    case 2:
                        combatFini = true;
                        
                        break;
                }



            //}

        }

        System.out.println("\nIl y a un vainqueur !");

    }

    public int JetDeDe() {
        int _jet = 0;
        NbrAleatoire nbrAl = new NbrAleatoire();
        try {
            Thread.sleep(1000);
            _jet = nbrAl.GenererNbrAleatoireBorne(1, 6);
        } catch (Exception e) {
            System.out.println("Erreur.");
        }
        return _jet;
    }

    public int FormuleDegat(Personnage _attaquant, Personnage _defenseur) {
        int _degatsFinaux = _attaquant.GetForce().GetValeur() - _defenseur.GetConstitution().GetValeur();
        if (_degatsFinaux <= 0) {
            _degatsFinaux = 1;
        }
        return _degatsFinaux;
    }

    public boolean QuiCommence() {

        EntreUtilisateur entreeUtilisateur = ToutesLesFonctions.GetInstance().GetEntreUtilisateur();

        System.out.println("\nLe dé est lancé");
        int _votreJet = JetDeDe();
        int _jetDeVotreAdversaire = JetDeDe();
        entreeUtilisateur.TexteQuiAttend(
                "Vous avez obtenu " + _votreJet + " et votre adversaire a obtenu " + _jetDeVotreAdversaire + ".");
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