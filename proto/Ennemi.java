
/**
 * Ennemi
 */
public class Ennemi extends Personnage {
    private Arme arme;
    private Classe classe;
    private Equipement Equipement;
public Ennemi (Arme _arme, Classe _classe, Equipement _equipement) {
    super(_nom, _race, _classe, _niveau, _vie, _mana, _force, _intelligence, _agilite, _dexterite, _constitution);
    arme=_arme;
    classe=_classe;
    equipement=_equipement;
}


public Arme GetArme (){
    return arme;
}
public Classe GetClasse() {
    return classe;
}
public Equipement GetEquipement (){
    return equipement;
}

public void SetArme(Arme _arme) {
    arme=_arme;
}
public void SetClasse(Classe _classe){
classe=_classe;
}
    public void SetEquipement(Equipement _equipement) {
        equipement=_equipement;    
    }

}
    
