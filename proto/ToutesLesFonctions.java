package proto;

import proto.Fonctions.*;

/**
 * temp
 */
public final class ToutesLesFonctions {

    private static ToutesLesFonctions instance;

    // constructeur privé.
    private ToutesLesFonctions(){

    }

    public static ToutesLesFonctions GetInstance(){
        if (instance == null) {
            instance = new ToutesLesFonctions();
        }
        return instance;
    }

    public Main monFichierMain = new Main();
    public EntreUtilisateur eUtil = new EntreUtilisateur();
    public NbrAleatoire nombreGenererAleatoirement = new NbrAleatoire();
    public CreationDePersonnage creationDePersonnage = new CreationDePersonnage();
    public lesPersonnagesEnCombat lesPersos = new lesPersonnagesEnCombat();
    public CombatManageur combatManageur = new CombatManageur();
    public ChallengeFonctions challengeFonction = new ChallengeFonctions();


}