package proto;

/**
 * Combat crée par Seb
 */
public class Combat {
    public int JetDeDe() {
        NbrAleatoire nbrAl = new NbrAleatoire();
        try {
            System.out.println("Le dé est lancé.");
            Thread.sleep(1000);
            int _jet = nbrAl.GenererNbrAleatoireBorne(1, 6);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur.");
        }
        return _jet;
    }

    public int formuleCombat(int _pointDeVie, int _force, int _constitution) {
        int _pointDeVieRestant = _pointDeVie - (_constitution - _force);
        return _pointDeVieRestant;
    }

    public void SeBattre() {

            int _votreJet = JetDeDe();
            System.out.println("Vous avez obtenu " + _votreJet + ".");
            int _jetDeVotreAdversaire = JetDeDe();
            System.out.println("Votre adversaire a obtenu " + _jetDeVotreAdversaire + ".");
            if (_votreJet > _jetDeVotreAdversaire) {
                System.out.println(
                        "Vous attaquez votre adversaire.\nSes points de vie restants sont " + formuleCombat(50, 6, 5));

            } else if (_jetDeVotreAdversaire > _votreJet) {

                System.out.println(
                        "Votre adversaire vous attaque. Vos points de vie restant sont " + formuleCombat(50, 9, 2));

            } else {
                System.out.println("égalité.");
                SeBattre();
            }
        }
    
}