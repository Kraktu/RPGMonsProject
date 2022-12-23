package proto;

/**
 * Sort créer par Bruno
*/
public class Sort {

    //Propriétés

    private String nom;

    private String description;

    private int niveauObtention;

    private int dommageMin;

    private int dommageMax;

    private int coutMana;

    private boolean isDommage;

    //Constructeur

    public Sort(String _nom, String _description, int _niveauObtention, int _dommageMin, int _dommageMax, int _coutMana, Boolean _isDommage) {

        nom = _nom;

        description = _description;

        niveauObtention = _niveauObtention;

        dommageMin = _dommageMin;

        dommageMax = _dommageMax;

        coutMana = _coutMana;

        isDommage = _isDommage;
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

    public int GetDommageMin() {

        return dommageMin;
    }

    public int GetGommageMax() {

        return dommageMax;
    }

    public int GetCoutMana() {

        return coutMana;
    }

    public boolean GetIsDommage() {

        return isDommage;
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

    public void SetDommageMin(int _dommageMin) {

       dommageMin = _dommageMin;
   }

   public void SetDommageMax(int _dommageMax) {

   dommageMax = _dommageMax;
}

public void SetCoutMana(int _coutMana) {

   coutMana = _coutMana;
}

public void SetIsDommage(boolean _isDommage) {
    isDommage = _isDommage;
}

// fonctions magiques :

	// fonction toString

	//@Override

    @Override

    public String toString() {

        String returnString = "Nom : " + nom +

        "\nDéscription : " + description +

        "\nNiveau pour le débloquer : " + niveauObtention +

        "\nDommage minimum causé : " + dommageMin +

        "\nDommage Maximum causé : " + dommageMax +

        "\nLa magie a causé " + coutMana + " vies." +

        "Dommage ? " + isDommage;

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

        if (nom.equals(_sort.nom) && description.equals(_sort.description) && niveauObtention == _sort.niveauObtention && dommageMin == _sort.dommageMin && dommageMax == _sort.dommageMax && isDommage == _sort.isDommage) {

            return true;
        }
        
        return false;
    }

}