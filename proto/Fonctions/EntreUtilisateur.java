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

    /*
    public int EntreeUtilisateurInt_Obsolete(String _question) {

        // Scanner _entree = new Scanner(System.in);

        System.out.println(_question);

        int _reponse = _entree.nextInt();

        _entree.nextLine();

        // _entree.close();

        return _reponse;

    }
    */

    public int EntreeUtilisateurInt (String _question) {

        // Scanner _entree = new Scanner(System.in);

        int _Responce;

        while (true) {

            System.out.print("\n" + _question + "\nVotre Réponse : ");

            if (_entree.hasNextInt()) {

                _Responce = _entree.nextInt();

                _entree.nextLine();

                return _Responce;

            } else {

                System.err.println("Erreur, veuillez entrer un chiffre.");

                _entree.nextLine();

            }

        }

        // _entree.close();

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

        String _Responce = "";

        while (true) {

            System.out.print("\n" + _Question + " [o/n]\nVotre Réponse : ");

            _Responce = _entree.nextLine().toUpperCase();

            switch (_Responce) {

                case "O":

                    return true;

                case "N":

                    return false;

                default:

                    System.err.println("Erreur, votre réponse doit être \"o\" ou \"n\"");

                    continue;

            }

        }

    }

    public Race ChoixRace() {

        // Scanner _entree = new Scanner(System.in);

        int _choix;

        boolean _doitChoisir = true;

        Race _raceSelection = ToutesLesRaces.GetInstance().GetElfe();

        do {

            do {

                String _question = "Choisissez votre race :\n1 . humain\n2 . elfe\n3 . nain\n4 . troll\n5 . gobelin\n6 . Descriptions des races.";

                _choix = EntreeUtilisateurInt(_question);

                switch (_choix) {
                    case 1:
                        System.out.println("Vous avez choisi humain.");
                        _raceSelection = ToutesLesRaces.GetInstance().GetHumain();
                        _doitChoisir = false;
                        break;
                    case 2:
                        System.out.println("Vous avez choisi elfe.");
                        _raceSelection = ToutesLesRaces.GetInstance().GetElfe();
                        _doitChoisir = false;
                        break;
                    case 3:
                        System.out.println("Vous avez choisi nain.");
                        _raceSelection = ToutesLesRaces.GetInstance().GetNain();
                        _doitChoisir = false;
                        break;
                    case 4:
                        System.out.println("Vous avez choisi troll.");
                        _raceSelection = ToutesLesRaces.GetInstance().GetTroll();
                        _doitChoisir = false;
                        break;
                    case 5:
                        System.out.println("Vous avez choisi gobelin.");
                        _raceSelection = ToutesLesRaces.GetInstance().GetGobelin();
                        _doitChoisir = false;
                        break;
                    case 6:
                        System.out.println("Vous Souhaitez obtenir des informations.");
                        ChoixRaceInformation();
                        break;

                    default:
                        System.out.println("Erreur : vous devez choisir un nombre compris entre 1 et 6.");
                        break;
                }

            } while (_choix < 1 || _choix > 6);
            
        } while (_doitChoisir);

        // _entree.close();

        return _raceSelection;

    }

    public void ChoixRaceInformation() {

        int _choix;

        boolean _souhaiteInformation = true;

        do {

            do {

                String _question = "Veuillez choisir la race à décrire :\n1 . humain\n2 . elfe\n3 . nain\n4 . troll\n5 . gobelin\n6 . Retour à la selection.";

                _choix = EntreeUtilisateurInt(_question);

                switch (_choix) {
                    case 1:
                        System.out.println(ToutesLesRaces.GetInstance().GetHumain().GetDescription() + "\n");
                        break;
                    case 2:
                        System.out.println(ToutesLesRaces.GetInstance().GetElfe().GetDescription() + "\n");
                        break;
                    case 3:
                        System.out.println(ToutesLesRaces.GetInstance().GetNain().GetDescription() + "\n");
                        break;
                    case 4:
                        System.out.println(ToutesLesRaces.GetInstance().GetTroll().GetDescription() + "\n");
                        break;
                    case 5:
                        System.out.println(ToutesLesRaces.GetInstance().GetGobelin().GetDescription() + "\n");
                        break;
                    case 6:
                        System.out.println("Retour au choix de la race.\n");
                        _souhaiteInformation = false;
                        break;

                    default:
                        System.out.println("Erreur : vous devez choisir un nombre compris entre 1 et 6.");
                        break;
                }
            } while (_choix < 1 || _choix > 6);

        } while (_souhaiteInformation);

    }

    public Classe ChoixClasse() {

        // Scanner _entree = new Scanner(System.in);

        int _choix;
        Classe _classeSelection = ToutesLesClasses.GetInstance().GetArcher();
        do {

            String _question = "Choisissez votre classe : tapez\n1 . pour archer, \n2 . pour guerrier, \n3 . pour mage, \n4 . pour voleur \n5 . Descriptions des classes.";

            _choix = EntreeUtilisateurInt(_question);

            switch (_choix) {
                case 1:
                    //System.out.println("Vous avez choisi archer.");
                    //_classeSelection = ToutesLesClasses.GetInstance().GetArcher();
                    System.out.println("Vous avez choissi : " + ToutesLesClasses.GetInstance().TableauToutesLesClasses()[_choix - 1].GetNom());
                    _classeSelection = ToutesLesClasses.GetInstance().TableauToutesLesClasses()[_choix - 1];
                    break;
                case 2:
                    // System.out.println("Vous avez choisi guerrier.");
                    // _classeSelection = ToutesLesClasses.GetInstance().GetGuerrier();
                    System.out.println("Vous avez choissi : " + ToutesLesClasses.GetInstance().TableauToutesLesClasses()[_choix - 1].GetNom());
                    _classeSelection = ToutesLesClasses.GetInstance().TableauToutesLesClasses()[_choix - 1];
                    break;
                case 3:
                    // System.out.println("Vous avez choisi mage.");
                    // _classeSelection = ToutesLesClasses.GetInstance().GetMage();
                    System.out.println("Vous avez choissi : " + ToutesLesClasses.GetInstance().TableauToutesLesClasses()[_choix - 1].GetNom());
                    _classeSelection = ToutesLesClasses.GetInstance().TableauToutesLesClasses()[_choix - 1];
                    break;
                case 4:
                    // System.out.println("Vous avez choisi voleur.");
                    // _classeSelection = ToutesLesClasses.GetInstance().GetVoleur();
                    System.out.println("Vous avez choissi : " + ToutesLesClasses.GetInstance().TableauToutesLesClasses()[_choix - 1].GetNom());
                    _classeSelection = ToutesLesClasses.GetInstance().TableauToutesLesClasses()[_choix - 1];
                    break;
                case 5:
                    System.out.println("Vous Souhaitez obtenir des informations.");
                    ChoixClasseInformation();
                    break;
                default:
                    System.out.println("Erreur, veuillez choisir un nombre compris entre 1 et 5.");
                    break;
            }
        } while (_choix < 1 || _choix > 4);

        // _entree.close();

        return _classeSelection;

    }

    public void ChoixClasseInformation() {

        int _choix;

        boolean _souhaiteInformation = true;

        do {

            do {

                String _question = "Veuillez choisir la classe à décrire :\n1 . archer\n2 . guerrier\n3 . mage\n4 . voleur\n5 . Retour à la selection.";

                _choix = EntreeUtilisateurInt(_question);

                switch (_choix) {
                    case 1:
                        System.out.println(ToutesLesClasses.GetInstance().GetArcher().GetDescription() + "\n");
                        break;
                    case 2:
                        System.out.println(ToutesLesClasses.GetInstance().GetGuerrier().GetDescription() + "\n");
                        break;
                    case 3:
                        System.out.println(ToutesLesClasses.GetInstance().GetMage().GetDescription() + "\n");
                        break;
                    case 4:
                        System.out.println(ToutesLesClasses.GetInstance().GetVoleur().GetDescription() + "\n");
                        break;
                    case 5:
                        System.out.println("Retour au choix de la classe.\n");
                        _souhaiteInformation = false;
                        break;

                    default:
                        System.out.println("Erreur : vous devez choisir un nombre compris entre 1 et 5.");
                        break;
                }
            } while (_choix < 1 || _choix > 6);

        } while (_souhaiteInformation);

    }

    // Fonction qui sert à print un éléments, puis a attendre la validation de l'utilisateurs.
    public void TexteQuiAttend(String _texte){
        System.out.print(_texte);
        _entree.nextLine();
    }

    public int JetDeDeMinMax (int _max) {

        int _jet = 0;

        NbrAleatoire nbrAl = new NbrAleatoire();

        try {

            Thread.sleep(200);

            _jet = nbrAl.GenererNbrAleatoireBorne(1, _max);

        } catch (Exception e) {

            System.out.println("Erreur.");

        }

        return _jet;

    }

}
