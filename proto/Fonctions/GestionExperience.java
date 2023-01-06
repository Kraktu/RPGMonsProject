package proto.Fonctions;

/**
 * GainExperience, créé par Simon
 */
public class GestionExperience {

    // fonction gainExperience.
    // entrée : un montant d'experience acquis après un évènement en int.
    // instruction : le calcul du nouveau montant total d'experience.
    // sortie : le montant final d'experience en int.
    public int GainExperience(int _xpActuelle, int _xpMontante) {
        return _xpActuelle+_xpMontante;
    }

}