package proto.Fonctions;

import proto.Classes.*;

/**
 * EntreUtilisateur, Créer par Seb.
 */
import java.util.Scanner;

import proto.Race.*;

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

        _entree.nextLine();

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

    public boolean DemanderOuiOuNon(String _Question) {

        String _choix;

        do {

            System.out.println(_Question + "\n[o/n]");

            _choix = _entree.nextLine().toLowerCase();
    
            if (_choix.equals("o")) {
    
                return true;
    
            } else  {
    
                return false;
    
            }

        } while (!(_choix.equals("o") || _choix.equals("n")));

    }

    public Race ChoixRace() {

        // Scanner _entree = new Scanner(System.in);

        int _choix;

        Race _raceSelection = ToutesLesRaces.GetInstance().GetElfe();

        do {

            String _question = "Choisissez votre race : tapez\n1 pour humain\n2 pour elfe\n3 pour nain\n4 pour troll\n5 pour gobelin";

            _choix = EntreeUtilisateurInt(_question);

            switch (_choix) {
                case 1:
                    System.out.println("Vous avez choisi humain.");
                    _raceSelection = ToutesLesRaces.GetInstance().GetHumain();
                    break;
                case 2:
                    System.out.println("Vous avez choisi elfe.");
                    _raceSelection = ToutesLesRaces.GetInstance().GetElfe();
                    break;
                case 3:
                    System.out.println("Vous avez choisi nain.");
                    _raceSelection = ToutesLesRaces.GetInstance().GetNain();
                    break;
                case 4:
                    System.out.println("Vous avez choisi troll.");
                    _raceSelection = ToutesLesRaces.GetInstance().GetTroll();
                    break;
                case 5:
                    System.out.println("Vous avez choisi gobelin.");
                    _raceSelection = ToutesLesRaces.GetInstance().GetGobelin();
                    break;

                default:
                    System.out.println("Erreur, vous devez choisir un nombre compris entre 1 et 5.");
                    break;
            }
        } while (_choix < 1 || _choix > 5);
        // _entree.close();

        return _raceSelection;

    }

    public Classe ChoixClasse() {

        // Scanner _entree = new Scanner(System.in);

        int _choix;
        Classe _classeSelection = ToutesLesClasses.GetInstance().GetArcher();
        do {

            String _question = "Choisissez votre classe : tapez\n1 pour archer, \n2 pour guerrier, \n3 pour mage, \n4 pour voleur";

            _choix = EntreeUtilisateurInt(_question);

            switch (_choix) {
                case 1:
                    System.out.println("Vous avez choisi archer.");
                    _classeSelection = ToutesLesClasses.GetInstance().GetArcher();
                    break;
                case 2:
                    System.out.println("Vous avez choisi guerrier.");
                    _classeSelection = ToutesLesClasses.GetInstance().GetGuerrier();
                    break;
                case 3:
                    System.out.println("Vous avez choisi mage.");
                    _classeSelection = ToutesLesClasses.GetInstance().GetMage();
                    break;
                case 4:
                    System.out.println("Vous avez choisi voleur.");
                    _classeSelection = ToutesLesClasses.GetInstance().GetVoleur();
                    break;
                default:
                    System.out.println("Erreur, veuillez choisir un nombre compris entre 1 et 4.");
                    break;
            }
        } while (_choix < 1 || _choix > 4);

        // _entree.close();

        return _classeSelection;

    }

    // Fonction qui sert à print un éléments, puis a attendre la validation de l'utilisateurs.
    public void TexteQuiAttend(String _texte){
        System.out.print(_texte);
        _entree.nextLine();
    }

}
