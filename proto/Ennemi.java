
/**
* Créé par Simon 
* Ennemi
 */
public class Ennemi extends Personnage {
    private Arme arme;
    private Classe classe;
    private Equipement equipement;
public Ennemi (String _nom, Race _race, Classe _classe, int _niveau, int _vie, int _mana, Statistique _force, Statistique _intelligence, Statistique _agilite, Statistique _dexterite, Statistique _constitution, Arme _arme, Equipement _equipement) {
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
    
