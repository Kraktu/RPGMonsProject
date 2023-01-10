package proto.Classes;

import proto.Sort;
import proto.Stat.StatistiqueBonus;

/**
 * Classe Créer par Bruno.
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

	private StatistiqueBonus forceBonus;

	private StatistiqueBonus intelligenceBonus;

	private StatistiqueBonus agiliteBonus;

	private StatistiqueBonus dexteriteBonus;

	private StatistiqueBonus constitutionBonus;

	private Sort sort;

	public Classe(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _dexteriteBonus, StatistiqueBonus _constitutionBonus, Sort _Sort) {

		nom = _nom;

		description = _description;

		forceBonus = _forceBonus;

		intelligenceBonus = _intelligenceBonus;

		agiliteBonus = _agiliteBonus;

		dexteriteBonus = _dexteriteBonus;

		constitutionBonus = _constitutionBonus;

		sort = _Sort;
	}

	// Getters :

	public String GetNom() {

		return nom;

	}

	public String GetDescription() {

		return description;

	}

	public StatistiqueBonus GetForceBonus() {

		return forceBonus;

	}

	public StatistiqueBonus GetIntelligenceBonus() {

		return intelligenceBonus;

	}

	public StatistiqueBonus GetAgiliteBonus() {

		return agiliteBonus;

	}

	public StatistiqueBonus GetDexteriteBonus() {

		return dexteriteBonus;

	}

	public StatistiqueBonus GetConstitutionBonus() {

		return constitutionBonus;

	}

	public Sort getSort() {

		return sort;

	}

	// Setters :

	public void SetNom(String _nom) {

		nom = _nom;

	}

	public void SetDescription(String _description) {

		description = _description;

	}

	public void SetForceBonus(StatistiqueBonus _forceBonus) {

		forceBonus = _forceBonus;

	}

	public void SetIntelligenceBonus(StatistiqueBonus _intelligenceBonus) {

		intelligenceBonus = _intelligenceBonus;

	}

	public void SetAgiliteBonus(StatistiqueBonus _agiliteBonus) {

		agiliteBonus = _agiliteBonus;

	}

	public void SetDexteriteBonus(StatistiqueBonus _dexteriteBonus) {

		dexteriteBonus = _dexteriteBonus;

	}

	public void SetConstitutionBonus(StatistiqueBonus _constitutionBonus) {

		constitutionBonus = _constitutionBonus;

	}

	public void SetSort(Sort _Sort) {

		sort = _Sort;

	}

	// Override

	@Override
	public java.lang.String toString() {
		return "Classe{" +
				"nom='" + nom + '\'' +
				", description='" + description + '\'' +
				", forceBonus=" + forceBonus +
				", intelligenceBonus=" + intelligenceBonus +
				", agiliteBonus=" + agiliteBonus +
				", dexteriteBonus=" + dexteriteBonus +
				", constitutionBonus=" + constitutionBonus +
				", sort=" + sort +
				'}';
	}

	@Override

	public boolean equals(Object object) {
		if (this == object) return true;

		if (object == null || getClass() != object.getClass()) return false;
		if (!super.equals(object)) return false;

		Classe classe = (Classe) object;

		return java.util.Objects.equals(nom, classe.nom) && java.util.Objects.equals(description, classe.description) && java.util.Objects.equals(forceBonus, classe.forceBonus) && java.util.Objects.equals(intelligenceBonus, classe.intelligenceBonus) && java.util.Objects.equals(agiliteBonus, classe.agiliteBonus) && java.util.Objects.equals(dexteriteBonus, classe.dexteriteBonus) && java.util.Objects.equals(constitutionBonus, classe.constitutionBonus) && java.util.Objects.equals(sort, classe.sort);
	}
}