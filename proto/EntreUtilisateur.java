package proto;

/**
 * EntreUtilisateur, Créer par Seb.
 */
import java.util.Scanner;

// post-it : trouver le bon moment ou la bonne méthode pour fermer les scanners.

public class EntreUtilisateur {

    // Ouverture du scanner.
    private Scanner _entree = new Scanner(System.in);

    // Fonction pour pouvoir fermer le scanner.
    public void fermerScanner() {

        _entree.close();

    }

    public String EntreeUtilisateurString(String _question) {

        // Scanner _entree = new Scanner(System.in);

        System.out.println(_question);

        String _reponse = _entree.nextLine();

        // _entree.close();

        return _reponse;

    }

    public int EntreeUtilisateurInt(String _question) {

        // Scanner _entree = new Scanner(System.in);

        System.out.println(_question);

        int _reponse = _entree.nextInt();

        // _entree.close();

        return _reponse;

    }

    public boolean ConfirmationChoix() {
        System.out.println("Confirmez-vous votre choix ? [o/n]");
        String _choix = _entree.nextLine();
        if (_choix.toLowerCase().equals("o")) {
            return true;
        } else if (_choix.toLowerCase().equals("n")) {
            return false;
        } else {
            System.out.println("Erreur.");
            return ConfirmationChoix();
        }
    }

    public Race ChoixRace() {

        // Scanner _entree = new Scanner(System.in);

        int _choix;
        Race _raceSelection = ToutesLesRaces.GetInstance().elfe;

        do {

            String _question = "Choisissez votre race : tapez\n1 pour humain\n2 pour elfe\n3 pour nain\n4 pour troll\n5 pour gobelin";

            _choix = EntreeUtilisateurInt(_question);

            switch (_choix) {
                case 1:
                    System.out.println("Vous avez choisi humain.");
                    _raceSelection = ToutesLesRaces.GetInstance().humain;
                    break;
                case 2:
                    System.out.println("Vous avez choisi elfe.");
                    _raceSelection = ToutesLesRaces.GetInstance().elfe;
                    break;
                case 3:
                    System.out.println("Vous avez choisi nain.");
                    _raceSelection = ToutesLesRaces.GetInstance().nain;
                    break;
                case 4:
                    System.out.println("Vous avez choisi troll.");
                    _raceSelection = ToutesLesRaces.GetInstance().troll;
                    break;
                case 5:
                    System.out.println("Vous avez choisi gobelin.");
                    _raceSelection = ToutesLesRaces.GetInstance().gobelin;
                    break;
                default:
                    System.out.println("Erreur, vous devez choisir un nombre compris entre 1 et 5.");
                    break;
            }
        } while (ConfirmationChoix());
        // _entree.close();

        return _raceSelection;

    }

    public Classe ChoixClasse() {

        // Scanner _entree = new Scanner(System.in);

        int _choix;
        Classe _classeSelection = ToutesLesClasses.GetInstance().archer;
        do {

            String _question = "Choisissez votre classe : tapez\n1 pour archer, \n2 pour guerrier, \n3 pour mage, \n4 pour voleur";

            _choix = EntreeUtilisateurInt(_question);

            switch (_choix) {
                case 1:
                    System.out.println("Vous avez choisi archer.");
                    _classeSelection = ToutesLesClasses.GetInstance().archer;
                    break;
                case 2:
                    System.out.println("Vous avez choisi guerrier.");
                    _classeSelection = ToutesLesClasses.GetInstance().guerrier;
                    break;
                case 3:
                    System.out.println("Vous avez choisi mage.");
                    _classeSelection = ToutesLesClasses.GetInstance().mage;
                    break;
                case 4:
                    System.out.println("Vous avez choisi voleur.");
                    _classeSelection = ToutesLesClasses.GetInstance().voleur;
                    break;
                default:
                    System.out.println("Erreur, veuillez choisir un nombre compris entre 1 et 4.");
                    break;
            }
        } while (ConfirmationChoix());

        // _entree.close();

        return _classeSelection;

    }

    /*
     * public int ChoixRace() {
     * int _choix = EntreeUtilisateurInt(
     * "Choisissez votre race [tapez 1 pour humain\n2 pour gobelin\n3 pour nain\n4 pour troll\n5 pour elfe"
     * );
     * switch (_choix) {
     * case 1:
     * System.out.println("Vous avez choisi humain.");
     * return _choix;
     * case 2:
     * System.out.println("Vous avez choisi gobelin.");
     * return _choix;
     * case 3:
     * System.out.println("Vous avez choisi nain.");
     * return _choix;
     * case 4:
     * System.out.println("Vous avez choisi troll.");
     * return _choix;
     * case 5:
     * System.out.println("Vous avez choisi elfe.");
     * return _choix;
     * default:
     * System.out.
     * println("Erreur, vous devez choisir un nombre compris entre 1 et 5.");
     * ChoixRace();
     * break;
     * }
     * return _choix;
     * }
     */

    /*
     * public int ChoixClasse() {
     * int _choix = EntreeUtilisateurInt(
     * "Choisissez votre classe [tapez 1 pour guerrier, \n2 pour mage, \n3 pour voleur, \n4 pour archer"
     * );
     * switch (_choix) {
     * case 1:
     * System.out.println("Vous avez choisi guerrier.");
     * return _choix;
     * case 2:
     * System.out.println("Vous avez choisi mage.");
     * return _choix;
     * case 3:
     * System.out.println("Vous avez choisi voleur.");
     * return _choix;
     * case 4:
     * System.out.println("Vous avez choisi archer.");
     * return _choix;
     * default:
     * System.out.println("Erreur, veuillez choisir un nombre compris entre 1 et 4."
     * );
     * ChoixClasse();
     * break;
     * }
     * return _choix;
     * 
     * }
     */

}
