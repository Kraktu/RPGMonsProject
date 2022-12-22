package proto;
/**
 * InnerClasse
 */
public class Classe {

    // Propriétés

    private String nom;
    private String description;

    public Classe(String _nom, String _description){
        nom = _nom;
        description = _description;
    }
    
    // getters

    public String GetNom(){
        return nom;
    }

    public String GetDescription(){
        return description;
    }

    // setters

    public void SetNom(String _nom){
        nom = _nom;
    }

    public void SetDescription(String _description){
        description = _description;
    }

}

// string name, explanation;

// Stat strengthModifier, intelligenceModifier, agilityModifier, dexterityModifier, constitutionModifier;

// Spell[] classSpells;