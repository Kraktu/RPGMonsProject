package proto.Stat;

/**
 * fait par Simon
 */
public class Statistique {

	private String nom;
	private String description;
	private int valeur;

	public Statistique(String _nom, String _description, int _valeur) {

		nom = _nom;
		description = _description;
		valeur = _valeur;
	}


	 // getters.
	 
	public String GetNom() {
		return nom;
	}

	public String GetDescription() {
		return description;
	}

	public int GetValeur() {
		return valeur;
	}

	
	// setters.
	
	public void SetNom(String _nom) {
		nom = _nom;
	}

	public void SetDescription(String _description) {
		description = _description;
	}

	public void SetValeur(int _valeur) {
		valeur = _valeur;
	}

	// Override

	@Override
/*
	public String toString() {

		String returnString = "Nom : " + nom +

				"\nDéscription : " + description +

				"\nValeur statistique : " + valeur;

		return returnString;

	}
*/
	public String toString() {

		String returnString = " : " + valeur;

		return returnString;

	}

	@Override

	public boolean equals(Object _o) {

		if (_o == null) {

			return false;

		}

		if (_o.getClass() != getClass()) {

			return false;

		}

		Statistique _statistique = (Statistique) _o;

		if (nom.equals(_statistique.nom) && description.equals(_statistique.description) && valeur == _statistique.valeur) {

			return true;

		}

		return false;

	}
}