package proto;

import proto.Fonctions.*;

/**
 * ToutesLesFonctions, créé par David.
 */
public final class ToutesLesFonctions {

    private static ToutesLesFonctions instance;

    // constructeur privé.
    private ToutesLesFonctions() {

    }

    public static ToutesLesFonctions GetInstance() {
        if (instance == null) {
            instance = new ToutesLesFonctions();
        }
        return instance;
    }

    private EntreUtilisateur eUtil = new EntreUtilisateur();
    private NbrAleatoire nombreGenererAleatoirement = new NbrAleatoire();
    private CreationDePersonnage creationDePersonnage = new CreationDePersonnage();
    private lesPersonnagesEnCombat lesPersos = new lesPersonnagesEnCombat();
    private CombatManageur combatManageur = new CombatManageur();
    private ChallengeFonctions challengeFonction = new ChallengeFonctions();

    // Getters

    public EntreUtilisateur GetEntreUtilisateur() {
        return eUtil;
    }

    public NbrAleatoire GetNbrAleatoire() {
        return nombreGenererAleatoirement;
    }

    public CreationDePersonnage GetCreationDePersonnage(){
        return creationDePersonnage;
    }

    public lesPersonnagesEnCombat GetLesPersonnagesEnCombat(){
        return lesPersos;
    }

    public CombatManageur GetCombatManageur(){
        return combatManageur;
    }

    public ChallengeFonctions GetChallengeFonctions(){
        return challengeFonction;
    }

}