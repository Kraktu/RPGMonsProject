package proto;

import java.io.IOException;

/**
 * main, créé par David
 */
public class Main {

        // sécurité sur la fonction oui-non
        // sécurité sur la fonction continuer - challenge - quitter attend une int, ne supporte pas les Strings ___ corrigé, a testé

        // dans entreeUtilisateur, essayer de créer un tableau, plutôt qu'un switch ____ WIP

        // a faire :
        // - Répartition des points de stats (Force, Intelligence, Agilité, Dextérité, Constitution).

        public static void main(String[] args) throws InterruptedException, IOException {

                // Toutes les fonctions centralisées.
                ToutesLesFonctions fonctions = ToutesLesFonctions.GetInstance();

                // Salutation.
                System.out.println("Bonjours,");

                //#region - Temporaire : test de la création d'ennemis aléatoires.

                Ennemi ennemiAleatoire;

                for (int i = 0; i < 10; i++) {

                        
                        ennemiAleatoire = TousLesEnnemis.getInstance().GenererEnnemiAleatoire();

                        System.out.print(
                                "\nNom : " + ennemiAleatoire.GetNom() +
                                "\nRace : " + ennemiAleatoire.GetRace().GetNom() +
                                "\nClasse : " + ennemiAleatoire.GetClasse().GetNom() +
                                "\nNiveau : " + ennemiAleatoire.GetNiveau()
                                );                        
                
                }

                System.out.println("");

                //#endregion - Temporaire : fin du test de la création d'ennemis aléatoires.

                // Création du personnage joueur.
                Joueur leJoueur = CreationDuPersonnage();

                // Enregistrement du personnage nouvellement créé dans le fichier
                fonctions.GetLesPersonnagesEnCombat().SetLePersonnageJouable(leJoueur);

                // Début de l'aventure.
                LancerNouvelleAventure();

                // Fermeture du scanner de EntreeUtilisateur. (test)
                fonctions.GetEntreUtilisateur().fermerScanner();

        }

        private static Joueur CreationDuPersonnage() {

                ToutesLesFonctions _fonctions = ToutesLesFonctions.GetInstance();

                Joueur _joueur;

                if (_fonctions.GetEntreUtilisateur().DemanderOuiOuNon("Souhaitez-vous personnaliser votre personnage ?")) {

                        _joueur = _fonctions.GetCreationDePersonnage().CreerJoueur();

                        System.out.println(_fonctions.GetCreationDePersonnage().GetLePersonnageJouable().toString());

                        return _joueur;

                } else {

                        _joueur = _fonctions.GetCreationDePersonnage().CreerJoueurRapide();

                        System.out.println(_fonctions.GetCreationDePersonnage().GetLePersonnageJouable().toString());

                        return _joueur;
                }

        }

        private static void LancerNouvelleAventure() {

                ToutesLesFonctions _fonctions = ToutesLesFonctions.GetInstance();

                boolean aventureEnCours = true;

                int choixEntreLesCombats;


                System.out.println("A présent, votre aventure commence.");

                while (aventureEnCours) {

                        do {

                                choixEntreLesCombats = _fonctions.GetEntreUtilisateur().EntreeUtilisateurInt("Que voulez-vous faire ?\n[1 : Lancer un combat]\n[2 : Lancer un challenge]\n[3 : quitter]");

                                switch (choixEntreLesCombats) {

                                        case 1:
                                                System.out.print("\n");

                                                LancerNouveauCombat();

                                                break;

                                        case 2:
                                                System.out.print("\n");

                                                LancerNouveauChallenge();

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

        }

        private static void LancerNouveauCombat() {

                ToutesLesFonctions _fonctions = ToutesLesFonctions.GetInstance();

                System.out.println("Vous vous battez !\n");

                //crée un nombre aléatoire dont la portée est comprise entre 1 et la taille maximal du tableau des ennemis disponibles.
                int ennemiAleatoireIndex = _fonctions.GetNbrAleatoire().GenererNbrAleatoireBorne(1, TousLesEnnemis.getInstance().GetTableauTousLesEnnemis().length - 1);

                // va chercher un ennemi dans le tableau des ennemis, et passe ses propriété dans "lesPersonnagesEnCombat".
                //_fonctions.GetLesPersonnagesEnCombat().SetEnnemisActuel(TousLesEnnemis.getInstance().GetTableauTousLesEnnemis()[ennemiAleatoireIndex]);

                // va chercher un ennemi dans le tableau des ennemis, et passe ses propriété dans "lesPersonnagesEnCombat".
                _fonctions.GetLesPersonnagesEnCombat().InitialiseNewEnnemi(TousLesEnnemis.getInstance().GetTableauTousLesEnnemis()[ennemiAleatoireIndex]);

                // Affiche les statistiques de l'ennemis choisis.
                _fonctions.GetEntreUtilisateur().TexteQuiAttend(_fonctions.GetLesPersonnagesEnCombat().GetEnnemisActuel().toString());

                System.out.println("");

                // Lance la fonction SeBattre du combatManageur.
                _fonctions.GetCombatManageur().SeBattre(_fonctions.GetLesPersonnagesEnCombat());

        }

        private static void LancerNouveauChallenge() {

                ToutesLesFonctions _fonctions = ToutesLesFonctions.GetInstance();

                System.out.println("Challenge !");

                _fonctions.GetChallengeFonctions().PrintDescriptionChallenge(_fonctions.GetLesPersonnagesEnCombat());

        }

}