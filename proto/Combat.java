package proto;

/**
 * Combat crée par Seb
 */
public class Combat {
public int formuleCombat (int _force, int _constitution) {
int _pointDeVie=_constitution-_force;
return _pointDeVie;
}
   public void SeBattre() {
        System.out.println("Le dé est lancé pour déterminer celui qui va engager le combat.");
        NbrAleatoire nbrAl = new NbrAleatoire();
        int jet = nbrAl.GenererNbrAleatoireBorne(1, 6);
        System.out.println("Le chiffre obtenu est " + jet);
        if (jet < 3) {
            System.out.println("C'est à vous de comencer.");
            System.out.println("Vous attaquez votre ennemi.\nSes points de vie restants sont " +             formuleCombat(9, 2));
            
        } else {
            System.out.println("Votre ennemi commence.");
            System.out.println("Il vous attaque. Vos points de vie restant sont " +             formuleCombat(9, 2));
            
        }

    }

}