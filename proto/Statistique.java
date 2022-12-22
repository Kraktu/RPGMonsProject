package proto;

/**
 * fait par Simon
 */
public class Statistique {

    private String nom;
    private String description;
    private int valeur;

    public Statistique (String _nom, String _description, int _valeur) {

        nom = _nom;
        description = _description;
        valeur = _valeur;
    }

    /**
     * getters
     */
    public String GetNom() {
        return nom;
    }

    public String GetDescription() {
        return description;
    }

    public int GetValeur() {
        return valeur;
    }

    /**
     * setters
     */
    public void SetNom(String _nom) {
        nom = _nom;
    }

    public void SetDescription(String _description) {
        description = _description;
    }

    public void SetValeur(int _valeur) {
        valeur = _valeur;
    }

}