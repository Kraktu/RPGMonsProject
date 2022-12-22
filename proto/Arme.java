package proto;

/**
 * Arme
 */
public class Arme extends Equipement {

    private String type;
    private int minDegat;
    private int maxDegat;

    //private Element

    public Arme(String _nom, String _description, String _rarete, int _prix, String _type, int _minDegat, int _maxDegat){
        
        super(_nom, _description, _rarete, _prix);

        type = _type;
        minDegat = _minDegat;
        maxDegat = _maxDegat;
        
    }



// string name,description, rarity;
// int price;
// Stat strengthModifier, intelligenceModifier, agilityModifier, dexterityModifier, constitutionModifier;


// Class Weapon : Equipement

// string type; // Si c'est une épée, une dague,... Héritage ?
// int minDamage,maxDamage;
// Element element;
}