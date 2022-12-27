package proto;

/**
 * Classe, modifier par Bruno.
 */

// Les différentes Classe = (Archer, Guerrier, Mage, Voleur)

// les propriétés de Classe.
// string name
// string explanation
// ForceBonus strengthModifier
// IntelligenceBonus intelligenceModifier
// AgiliteBonus agilityModifier
// DexteriteBonus dexterityModifier
// ConstitutionBonus constitutionModifier
// Spell[] classSpells

public class Classe {

    // Propriétés

    protected String nom;
    protected String description;

    public Classe(String _nom, String _description) {
        nom = _nom;
        description = _description;
    }

    // getters

    public String GetNom() {
        return nom;
    }

    public String GetDescription() {
        return description;
    }

    // setters

    public void SetNom(String _nom) {
        nom = _nom;
    }

    public void SetDescription(String _description) {
        description = _description;
    }

    // Overrides

    @Override
    public String toString() {
        String str = "Nom : " + nom + "\nDescription" + description;
        return str;
    }

    @Override
    public boolean equals(Object _o) {
        if (_o == null) {
            return false;
        }
        if (_o.getClass() != getClass()) {
            return false;
        }
        Classe _classe = (Classe) _o;
        if (_classe.nom.equals(nom) && _classe.description.equals(description)) {
            return true;
        }
        return false;
    }
}