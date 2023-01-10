package proto;
import proto.Fonctions.*;

/**
 * main, créé par David
 */
public class Main {
/*
A) Création du personnage.

        1) On nous demande notre pseudo.
        2) On nous propose de choisir une Race (Humain, Elfe, Nain, Troll, Gobelin).
        3) On nous propose de choisir une Classe (Archer, Guerrier, Mage, Voleur).
        4) On nous propose de répartir 5 points dans les caractéristiques que l'on veut (Force, Intelligence, Agilité, Dextérité, Constitution).

        Question pour Philip :
        1. Quand peut-on fermer le ou les scanners dans le fichier "Entrée utilisateur" ?
*/
    public static void main(String[] args) {

        // variable boolean pour pouvoir passer la création de personnage.
        // true pour avoir un personnage par defaut, false pour créer le personnage manuellement.
        //final boolean passerCreationPersonnage = false;

        // défini si le jeu en lui même est en cours ou non
        boolean aventureEnCours = false;

        Main monFichierMain = new Main();
        EntreUtilisateur eUtil = new EntreUtilisateur();
        NbrAleatoire nombreGenererAleatoirement = new NbrAleatoire();
        CreationDePersonnage creationDePersonnage = new CreationDePersonnage();
        lesPersonnagesEnCombat lesPersos = new lesPersonnagesEnCombat();
        CombatManageur combatManageur = new CombatManageur();
        ChallengeFonctions challengeFonction = new ChallengeFonctions();


        // Création du personnage joueur.
        Joueur leJoueur = monFichierMain.CreationDuPersonnage(eUtil, creationDePersonnage);

        // Enregistrement du personnage nouvellement créé dans le fichier LesPersonnagesEnCombat.
        lesPersos.SetLePersonnageJouable(leJoueur);

        // TEMPORAIRE ; Explication concernant l'enregistrement des variables.
        monFichierMain.ExplicationEnregistrementVariable(eUtil, lesPersos, creationDePersonnage);

        // Début de l'aventure.

        aventureEnCours = true;
        int choixEntreLesCombats;

        System.out.println("A présent, votre aventure commence.\n");

        while (aventureEnCours) {

                do {

                        choixEntreLesCombats = eUtil.EntreeUtilisateurInt("Que voulez-vous faire ?\n[1 : continuer]\n[2 : autre]\n[3 : quitter]");

                        switch (choixEntreLesCombats) {
                                case 1:
                                        System.out.println("Vous vous battez !");

                                        int ennemiAleatoireIndex = nombreGenererAleatoirement.GenererNbrAleatoireBorne(1, 5);
                                        eUtil.TexteQuiAttend("le nombre générer est : " + ennemiAleatoireIndex);

                                        switch (ennemiAleatoireIndex) {
                                                case 1:
                                                lesPersos.SetEnnemisActuel(TousLesEnnemis.getInstance().GetBruno());
                                                eUtil.TexteQuiAttend(lesPersos.GetEnnemisActuel().toString());
                                                        break;
                                                case 2:
                                                lesPersos.SetEnnemisActuel(TousLesEnnemis.getInstance().GetLeRater());
                                                eUtil.TexteQuiAttend(lesPersos.GetEnnemisActuel().toString());
                                                        break;
                                                case 3:
                                                lesPersos.SetEnnemisActuel(TousLesEnnemis.getInstance().GetLeRuser());
                                                eUtil.TexteQuiAttend(lesPersos.GetEnnemisActuel().toString());
                                                        break;
                                                case 4:
                                                lesPersos.SetEnnemisActuel(TousLesEnnemis.getInstance().GetFlecheur());
                                                eUtil.TexteQuiAttend(lesPersos.GetEnnemisActuel().toString());
                                                        break;
                                                case 5:
                                                lesPersos.SetEnnemisActuel(TousLesEnnemis.getInstance().GetLePtitGars());
                                                eUtil.TexteQuiAttend(lesPersos.GetEnnemisActuel().toString());
                                                        break;
                                        }
                                        System.out.println(lesPersos.GetLePersonnageJouable().GetNom());
                                        combatManageur.SeBattre(lesPersos);
                                        break;
                                case 2:
                                        System.out.println("Challenge !");
                                        challengeFonction.PrintDescriptionChallenge();
                                        break;
                                case 3:
                                        System.out.println("Au revoir.");
                                        aventureEnCours = false;
                                        break;
                                default:
                                        System.out.println("ERREUR.");
                                        break;
                        }

                } while (choixEntreLesCombats < 1 || choixEntreLesCombats > 3);

        }

        // Fermeture du scanner de EntreeUtilisateur. (test)
        eUtil.fermerScanner();

    }

    private Joueur CreationDuPersonnage(EntreUtilisateur eUtil, CreationDePersonnage creationDePersonnage){

        Joueur _joueur;

        if (eUtil.DemanderOuiOuNon("Creer votre personnage ?")) {
                _joueur = creationDePersonnage.CreerJoueur();
                System.out.println(creationDePersonnage.GetLePersonnageJouable().toString());
                return _joueur;
        } else {
                _joueur = creationDePersonnage.CreerJoueurRapide();
                System.out.println(creationDePersonnage.GetLePersonnageJouable().toString());
                return _joueur;
        }

    }

    private void ExplicationEnregistrementVariable(EntreUtilisateur eUtil, lesPersonnagesEnCombat lesPersos, CreationDePersonnage creationDePersonnage){

        if (eUtil.DemanderOuiOuNon("Souhaitez vous relire les explications concernant l'enregistrement de fichier ?")) {

        eUtil.TexteQuiAttend("\nBonjour, je vais vous expliquer le principe de stocker nos personnages dans un autre fichier");

        eUtil.TexteQuiAttend("Quand le joueur est creer toutes ses informations sont stocké dans un autre fichier qui sert de mémoire.");
        eUtil.TexteQuiAttend("Se fichier s'appelle les personnages en combat.");
        eUtil.TexteQuiAttend("Vu que le jeu propose des combats en 1 contre 1, le fichier ne contient que un joueur et un ennemis.");

        eUtil.TexteQuiAttend("passons au concret");

        eUtil.TexteQuiAttend("d'abord, je print les valeurs nom, force et constitution du joueur qui se trouve dans le fichier les personnages en combats");

        eUtil.TexteQuiAttend("Pour le nom par exemple, je fait un print de lesPersos.GetLePersonnageJouable().GetNom()");
        eUtil.TexteQuiAttend("les résultats pour nom, force et constitution est :");

        System.out.println(lesPersos.GetLePersonnageJouable().GetNom());
        System.out.println(lesPersos.GetLePersonnageJouable().GetForce());
        System.out.println(lesPersos.GetLePersonnageJouable().GetConstitution());

        eUtil.TexteQuiAttend("toute les valeurs sont null car l'objet de base est vide");
        eUtil.TexteQuiAttend("maintenant je vais remplir le fichier avec les valeurs generé par la création de personnage");
        eUtil.TexteQuiAttend("pour ca j'utilise la commande :");
        eUtil.TexteQuiAttend("lesPersos.SetLePersonnageJouable(creationDePersonnage.GetLePersonnageJouable());");

        lesPersos.SetLePersonnageJouable(creationDePersonnage.GetLePersonnageJouable());

        //System.out.println(lesPersos.GetLePersonnageJouable().toString());
        System.out.println(lesPersos.GetLePersonnageJouable().GetNom());
        System.out.println(lesPersos.GetLePersonnageJouable().GetForce());
        System.out.println(lesPersos.GetLePersonnageJouable().GetConstitution());

        eUtil.TexteQuiAttend("voila, maintenant, les informations de la création de personnage sont stockée dans le fichier les personnages en combat.");

        }

    }

}