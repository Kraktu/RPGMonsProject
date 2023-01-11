package proto;

import java.io.IOException;
/**
 * main, créé par David
 */
public class Main {

// A) Création du personnage.

//         a faire :
//         - Menu de description pour les Classes.
//         - Répartition des points de stats (Force, Intelligence, Agilité, Dextérité, Constitution).

//         Runtime.getRuntime().exec("cls");
//         pour clean la console.

    public static void main(String[] args) throws InterruptedException, IOException {

        // variable boolean pour pouvoir passer la création de personnage.
        // true pour avoir un personnage par defaut, false pour créer le personnage manuellement.
        //final boolean passerCreationPersonnage = false;

        // défini si le jeu en lui même est en cours ou non
        boolean aventureEnCours = false;

        ToutesLesFonctions fonctions = ToutesLesFonctions.GetInstance();

        // Création du personnage joueur.
        Joueur leJoueur = CreationDuPersonnage();


        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


        // Enregistrement du personnage nouvellement créé dans le fichier LesPersonnagesEnCombat.
        fonctions.GetLesPersonnagesEnCombat().SetLePersonnageJouable(leJoueur);

        // TEMPORAIRE ; Explication concernant l'enregistrement des variables.
        ExplicationEnregistrementVariable();

        // Début de l'aventure.

        aventureEnCours = true;
        int choixEntreLesCombats;

        System.out.println("A présent, votre aventure commence.\n");

        while (aventureEnCours) {

                do {

                        choixEntreLesCombats = fonctions.GetEntreUtilisateur().EntreeUtilisateurInt("Que voulez-vous faire ?\n[1 : continuer]\n[2 : autre]\n[3 : quitter]");

                        switch (choixEntreLesCombats) {
                                case 1:
                                        LancerNouveauCombat();
                                        break;
                                case 2:
                                        System.out.println("Challenge !");
                                        //challengeFonction.PrintDescriptionChallenge();
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
        fonctions.GetEntreUtilisateur().fermerScanner();

    }

    private static Joueur CreationDuPersonnage(){

        ToutesLesFonctions _fonctions = ToutesLesFonctions.GetInstance();

        Joueur _joueur;

        if (_fonctions.GetEntreUtilisateur().DemanderOuiOuNon("Creer votre personnage ?")) {
                _joueur = _fonctions.GetCreationDePersonnage().CreerJoueur();
                System.out.println(_fonctions.GetCreationDePersonnage().GetLePersonnageJouable().toString());
                return _joueur;
        } else {
                _joueur = _fonctions.GetCreationDePersonnage().CreerJoueurRapide();
                System.out.println(_fonctions.GetCreationDePersonnage().GetLePersonnageJouable().toString());
                return _joueur;
        }

    }

    private static void ExplicationEnregistrementVariable(){

        ToutesLesFonctions _fonctions = ToutesLesFonctions.GetInstance();

        if (_fonctions.GetEntreUtilisateur().DemanderOuiOuNon("Souhaitez vous relire les explications concernant l'enregistrement de fichier ?")) {

                _fonctions.GetEntreUtilisateur().TexteQuiAttend("\nBonjour, je vais vous expliquer le principe de stocker nos personnages dans un autre fichier");

                _fonctions.GetEntreUtilisateur().TexteQuiAttend("Quand le joueur est creer toutes ses informations sont stocké dans un autre fichier qui sert de mémoire.");
                _fonctions.GetEntreUtilisateur().TexteQuiAttend("Se fichier s'appelle les personnages en combat.");
                _fonctions.GetEntreUtilisateur().TexteQuiAttend("Vu que le jeu propose des combats en 1 contre 1, le fichier ne contient que un joueur et un ennemis.");

                _fonctions.GetEntreUtilisateur().TexteQuiAttend("passons au concret");

                _fonctions.GetEntreUtilisateur().TexteQuiAttend("d'abord, je print les valeurs nom, force et constitution du joueur qui se trouve dans le fichier les personnages en combats");

                _fonctions.GetEntreUtilisateur().TexteQuiAttend("Pour le nom par exemple, je fait un print de GetLesPersonnagesEnCombat().GetLePersonnageJouable().GetNom()");
                _fonctions.GetEntreUtilisateur().TexteQuiAttend("les résultats pour nom, force et constitution est :");

        System.out.println(_fonctions.GetLesPersonnagesEnCombat().GetLePersonnageJouable().GetNom());
        System.out.println(_fonctions.GetLesPersonnagesEnCombat().GetLePersonnageJouable().GetForce());
        System.out.println(_fonctions.GetLesPersonnagesEnCombat().GetLePersonnageJouable().GetConstitution());

        _fonctions.GetEntreUtilisateur().TexteQuiAttend("toute les valeurs sont null car l'objet de base est vide");
        _fonctions.GetEntreUtilisateur().TexteQuiAttend("maintenant je vais remplir le fichier avec les valeurs generé par la création de personnage");
        _fonctions.GetEntreUtilisateur().TexteQuiAttend("pour ca j'utilise la commande :");
        _fonctions.GetEntreUtilisateur().TexteQuiAttend("GetLesPersonnagesEnCombat().SetLePersonnageJouable(GetCreationDePersonnage().GetLePersonnageJouable());");

        _fonctions.GetLesPersonnagesEnCombat().SetLePersonnageJouable(_fonctions.GetCreationDePersonnage().GetLePersonnageJouable());

        //System.out.println(GetLesPersonnagesEnCombat().GetLePersonnageJouable().toString());
        System.out.println(_fonctions.GetLesPersonnagesEnCombat().GetLePersonnageJouable().GetNom());
        System.out.println(_fonctions.GetLesPersonnagesEnCombat().GetLePersonnageJouable().GetForce());
        System.out.println(_fonctions.GetLesPersonnagesEnCombat().GetLePersonnageJouable().GetConstitution());

        _fonctions.GetEntreUtilisateur().TexteQuiAttend("voila, maintenant, les informations de la création de personnage sont stockée dans le fichier les personnages en combat.");

        }

    }

    private static void LancerNouveauCombat(){

        ToutesLesFonctions _fonctions = ToutesLesFonctions.GetInstance();

        System.out.println("Vous vous battez !");

        int ennemiAleatoireIndex = _fonctions.GetNbrAleatoire().GenererNbrAleatoireBorne(1, TousLesEnnemis.getInstance().GetTableauTousLesEnnemis().length - 1);
        
        //GetLesPersonnagesEnCombat().SetEnnemisActuel(TousLesEnnemis.getInstance().tableauTousLesEnnemis[ennemiAleatoireIndex]);
        _fonctions.GetLesPersonnagesEnCombat().SetEnnemisActuel(TousLesEnnemis.getInstance().GetTableauTousLesEnnemis()[ennemiAleatoireIndex]);
        
        _fonctions.GetEntreUtilisateur().TexteQuiAttend(_fonctions.GetLesPersonnagesEnCombat().GetEnnemisActuel().toString());
        
        _fonctions.GetCombatManageur().SeBattre(_fonctions.GetLesPersonnagesEnCombat());
    }

    // public final static void clearConsole()
    // {
    //     try
    //     {
    //         final String os = System.getProperty("os.name");
            
    //         if (os.contains("Windows"))
    //         {
    //             Runtime.getRuntime().exec("cls");
    //         }
    //         else
    //         {
    //             Runtime.getRuntime().exec("clear");
    //         }
    //     }
    //     catch (final Exception e)
    //     {
    //         //  Handle any exceptions.
    //     }
    // }
    
}