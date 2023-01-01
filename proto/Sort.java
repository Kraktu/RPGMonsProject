package proto;

/**
 * Sort créer par Bruno
*/
public class Sort {

    //Propriétés

    private String nom;

    private String description;

    private int niveauObtention;

    private int degatMin;

    private int degatMax;

    private int coutMana;

    private boolean isDegat;

    //Constructeur

    public Sort(String _nom, String _description, int _niveauObtention, int _degatMin, int _degatMax, int _coutMana, boolean _isDegat) {

        nom = _nom;

        description = _description;

        niveauObtention = _niveauObtention;

        degatMin = _degatMin;

        degatMax = _degatMax;

        coutMana = _coutMana;

        isDegat = _isDegat;
    }

    // Getters

    public String GetNom() {

        return nom;
    }

    public String GetDescription() {

        return description;
    }

    public int GetNiveauObtention() {

        return niveauObtention;
    }

    public int GetDegatMin() {

        return degatMin;
    }

    public int GetDegatMax() {

        return degatMax;
    }

    public int GetCoutMana() {

        return coutMana;
    }

    public boolean GetIsDegat() {

        return isDegat;
    }

    // Setters

    public void SetNom(String _nom) {

        nom = _nom;
    }

    public void SetDescription(String _description) {

        description = _description;
    }

    public void SetNiveauObtention(int _niveauObtention) {

        niveauObtention = _niveauObtention;
    }

    public void SetDegatMin(int _degatMin) {

       degatMin = _degatMin;
   }

   public void SetDegatMax(int _degatMax) {

   degatMax = _degatMax;
}

public void SetCoutMana(int _coutMana) {

   coutMana = _coutMana;
}

public void SetIsDegat(boolean _isDegat) {
    isDegat = _isDegat;
}

// Overrides :

    @Override

    public String toString() {

        String returnString = "Nom : " + nom +

        "\nDéscription : " + description +

        "\nNiveau pour le débloquer : " + niveauObtention +

        "\nDégat minimum causé : " + degatMin +

        "\nDégat Maximum causé : " + degatMax +

        "\nLa magie a causé " + coutMana + " vies." +

        "Dégat ? " + isDegat;

        return returnString;
    }

    //@Override

    @Override

    public boolean equals(Object _o) {

        if (_o == null) {

            return false;
        }

        if (_o.getClass() != getClass()) {

            return false;

        }

        Sort _sort = (Sort)_o;

        if (nom.equals(_sort.nom) && description.equals(_sort.description) && niveauObtention == _sort.niveauObtention && degatMin == _sort.degatMin && degatMax == _sort.degatMax && coutMana == _sort.coutMana && isDegat == _sort.isDegat) {

            return true;
        }
        
        return false;
    }

}