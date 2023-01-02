package proto;
/**
* Créé par Simon 
* Ennemi
 */
public class Ennemi extends Personnage {
    private Arme arme;
    private Equipement equipement;
public Ennemi (String _nom, Race _race, Classe _classe, int _niveau, int _vie, int _mana, Statistique _force, Statistique _intelligence, Statistique _agilite, Statistique _dexterite, Statistique _constitution, Arme _arme, Equipement _equipement) {
    super(_nom, _race, _classe, _niveau, _vie, _mana, _force, _intelligence, _agilite, _dexterite, _constitution);
    arme=_arme;
    equipement=_equipement;
}


public Arme GetArme (){
    return arme;
}
public Equipement GetEquipement (){
    return equipement;
}

public void SetArme(Arme _arme) {
    arme=_arme;
}
    public void SetEquipement(Equipement _equipement) {
        equipement=_equipement;    
    }
    // Overrides


    @Override
    public String toString() {
        return "Ennemi{" +
                "arme=" + arme +
                ", equipement=" + equipement +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Ennemi ennemi = (Ennemi) object;
        return java.util.Objects.equals(arme, ennemi.arme) && java.util.Objects.equals(equipement, ennemi.equipement);
    }
}
    
