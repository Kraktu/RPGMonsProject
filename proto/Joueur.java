import proto.Equipement;
import proto.Personnage;

/**
 * Joueur créé par Seb
 */
public class Joueur extends Personnage {
    // proprietes

    private Equipement equipement;
    private int experience, argent;

    // constructeur

    public Joueur(String _nom, Race _race, Classe _classe, int _niveau, int _vie, int _mana, Statistique _force,
            Statistique _intelligence, Statistique _agilite, Statistique _dexterite, Statistique _constitution,
            Equipement _equipement, int experiance, int argent) {
        super(_nom, _race, _classe, _niveau, _vie, _mana, _constitution, _constitution, _constitution, _constitution,
                _constitution);
        equipement = _equipement;
        experience = _experience;
        argent = _argent;
    }

    // getters

    public Equipement GEtEquipement() {
        return equipement;
    }

    public int GetExperience() {
        return experience;
    }

    public int GetArgent() {
        return argent;
    }

    // setters
    public void SetEquipement(Equipement _Equipement) {
        equipement = _Equipement;
    }

    public void SetExperience(int _experience) {
        experience = _experience;
    }

    public void SetArgent(int _argent) {
        argent = _argent;
    }
}