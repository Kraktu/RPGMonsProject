package proto;

/**
 * EntreUtilisateur, Créer par Seb.
 */
import java.util.Scanner;

public class EntreUtilisateur {

    public String EntreeUtilisateurString(String _question) {

        Scanner entree = new Scanner(System.in);

        System.out.println(_question);

        String reponse = entree.nextLine();

        entree.close();

        return reponse;
    }

    public int EntreeUtilisateurInt(String _question) {

        Scanner entree = new Scanner(System.in);

        System.out.println(_question);

        int reponse = entree.nextInt();

        entree.close();

        return reponse;
    }

    public int ChoixClasse() {
        int _choix = EntreeUtilisateurInt(
                "Choisissez votre classe [tapez 1 pour guerrier, \n2 pour mage, \n3 pour voleur, \n4 pour archer");
        switch (_choix) {
            case 1:
                System.out.println("Vous avez choisi guerrier.");
                return _choix;
            case 2:
                System.out.println("Vous avez choisi mage.");
                return _choix;
            case 3:
                System.out.println("Vous avez choisi voleur.");
                return _choix;
            case 4:
                System.out.println("Vous avez choisi archer.");
                return _choix;
            default:
                System.out.println("Erreur, veuillez choisir un nombre compris entre 1 et 4.");
                ChoixClasse();
                break;
        }
        return _choix;

    }

    public int ChoixRace() {
        int _choix = EntreeUtilisateurInt(
                "Choisissez votre race [tapez 1 pour humain\n2 pour gobelin\n3 pour nain\n4 pour troll\n5 pour elfe");
        switch (_choix) {
            case 1:

                System.out.println("Vous avez choisi humain.");
                return _choix;
            case 2:
                System.out.println("Vous avez choisi gobelin.");
                return _choix;
            case 3:
                System.out.println("Vous avez choisi nain.");
                return _choix;
            case 4:
                System.out.println("Vous avez choisi troll.");
                return _choix;
            case 5:
                System.out.println("Vous avez choisi elfe.");
                return _choix;
            default:
                System.out.println("Erreur, vous devez choisir un nombre compris entre 1 et 5.");
                ChoixRace();
                break;
        }
        return _choix;
    }
}
