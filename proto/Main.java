package proto;

import java.io.IOException;

/**
 * main, créé par David
 */
public class Main {


        // sécurité sur la fonction oui-non
        // sécurité sur la fonction continuer - challenge - quitter attend une int, ne supporte pas les Strings

        // créer une fonction qui réinitialise (ou initialise) les ennemis



        // a faire :
        // - Répartition des points de stats (Force, Intelligence, Agilité, Dextérité, Constitution).

        public static void main(String[] args) throws InterruptedException, IOException {

                // Toutes les fonctions centralisées.
                ToutesLesFonctions fonctions = ToutesLesFonctions.GetInstance();

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

        private static void LancerNouvelleAventure() {

                ToutesLesFonctions _fonctions = ToutesLesFonctions.GetInstance();

                boolean aventureEnCours = true;

                int choixEntreLesCombats;


                System.out.println("A présent, votre aventure commence.\n");

                while (aventureEnCours) {

                        do {

                                choixEntreLesCombats = _fonctions.GetEntreUtilisateur().EntreeUtilisateurInt("Que voulez-vous faire ?\n[1 : continuer]\n[2 : autre]\n[3 : quitter]");

                                switch (choixEntreLesCombats) {

                                        case 1:

                                                LancerNouveauCombat();

                                                break;

                                        case 2:

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

                System.out.println("Vous vous battez !");

                int ennemiAleatoireIndex = _fonctions.GetNbrAleatoire().GenererNbrAleatoireBorne(1, TousLesEnnemis.getInstance().GetTableauTousLesEnnemis().length - 1);

                // GetLesPersonnagesEnCombat().SetEnnemisActuel(TousLesEnnemis.getInstance().tableauTousLesEnnemis[ennemiAleatoireIndex]);
                _fonctions.GetLesPersonnagesEnCombat().SetEnnemisActuel( TousLesEnnemis.getInstance().GetTableauTousLesEnnemis()[ennemiAleatoireIndex]);

                _fonctions.GetEntreUtilisateur().TexteQuiAttend(_fonctions.GetLesPersonnagesEnCombat().GetEnnemisActuel().toString());

                _fonctions.GetCombatManageur().SeBattre(_fonctions.GetLesPersonnagesEnCombat());

        }

        private static void LancerNouveauChallenge() {

                ToutesLesFonctions _fonctions = ToutesLesFonctions.GetInstance();

                System.out.println("Challenge !");

                _fonctions.GetChallengeFonctions().PrintDescriptionChallenge(_fonctions.GetLesPersonnagesEnCombat());

        }

}