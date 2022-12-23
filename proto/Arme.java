package proto;

/**
 * Creer par David.
 */
public class Arme extends Equipement {

    protected String type;
    protected int minDegat;
    protected int maxDegat;

    //private Element

    public Arme(String _nom, String _description, String _rarete, int _prix, Statistique _forceBonus,Statistique _intelligenceBonus, Statistique _agiliteBonus, Statistique _dexteriteBonus, Statistique _constitutionBonus, String _type, int _minDegat, int _maxDegat){
        
        super(_nom, _description, _rarete, _prix, _forceBonus, _intelligenceBonus, _agiliteBonus, _dexteriteBonus, _constitutionBonus);

        type = _type;
        minDegat = _minDegat;
        maxDegat = _maxDegat;

    }

    public String GetType(){
        return type;
    }
    public int GetMinDegat(){
        return minDegat;
    }
    public int GetMaxDegat(){
        return maxDegat;
    }

    public void SetType(String _type){
        type = _type;
    }
    public void SetMinDegat(String _minDegat){
        type = _minDegat;
    }
    public void SetMaxDegat(String _maxDegat){
        type = _maxDegat;
    }




// string name,description, rarity;
// int price;
// Stat strengthModifier, intelligenceModifier, agilityModifier, dexterityModifier, constitutionModifier;


// Class Weapon : Equipement

// string type; // Si c'est une épée, une dague,... Héritage ?
// int minDamage,maxDamage;
// Element element;
}