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
    public String GetForce() {
        return nom;
    }

    public String GetIntelligence() {
        return description;
    }

    public int GetAgilite() {
        return valeur;
    }

    /**
     * setters
     */
    public void SetForce(String _nom) {
        nom = _nom;
    }

    public void SetIntelligence(String _description) {
        description = _description;
    }

    public void SetAgilite(int _valeur) {
        valeur = _valeur;
    }

}