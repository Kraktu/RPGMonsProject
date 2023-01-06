package proto;

import proto.Fonctions.*;

/**
 * Combat crée par Seb
 */
public class Combat {
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

    public int formuleCombat(int _pointDeVie, int _force, int _constitution) {
        return _pointDeVie - (_constitution - _force);
    }

    public void SeBattre() {
        int _pointDeVieRestant=0;
    MenuCombat _MenuCombat = new MenuCombat();
       do  {
            
        
        int _votreJet = JetDeDe();
        System.out.println("Vous avez obtenu " + _votreJet + ".");
        int _jetDeVotreAdversaire = JetDeDe();
        System.out.println("Votre adversaire a obtenu " + _jetDeVotreAdversaire + ".");
        if (_votreJet > _jetDeVotreAdversaire) {
            _pointDeVieRestant=formuleCombat(50, 6, 5);
            System.out.println(
                    "Vous attaquez votre adversaire.\nSes points de vie restants sont " + _pointDeVieRestant);
        } else if (_jetDeVotreAdversaire > _votreJet) {
            _pointDeVieRestant=formuleCombat(50, 9, 2);
            System.out.println(
                    "Votre adversaire vous attaque. Vos points de vie restant sont " + _pointDeVieRestant);
        } else {
            System.out.println("égalité.");
            SeBattre();
        }
    } while (_pointDeVieRestant>0);
    }
}