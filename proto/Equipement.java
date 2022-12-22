package proto;

/**
 * Equipement
 */
public class Equipement {

    //Properties
    String nom, description, rarete;
    int prix;

    //Magic
    //Constructor
    public Equipement(String _nom, String _description, String _rarete, int _prix){
        nom = _nom;
        description = _description;
        rarete = _rarete;
        prix = _prix;
    }

    // Getter

    public String GetNom()
    {
        return nom;
    }
    public String GetDescription()
    {
        return description;
    }
    public String GetRarete()
    {
        return rarete;
    }
    public int GetPrix()
    {
        return prix;
    }

    // Setter

    public void SetNom(String _nom)
    {
        nom=_nom;
    }
    public void SetDescription(String _description)
    {
        description=_description;
    }
    public void SetRarete(String _rarete)
    {
        rarete = _rarete;
    }
    public void SetPrix(int _prix)
    {
        prix = _prix;
    }

    //Overrides

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nom : " + nom + "\t rareté : " + rarete + 
        "\nprix : " + prix + "G"+
        "\n\nDescription" + description; 
    }
    @Override
    public boolean equals(Object _o) {
        // TODO Auto-generated method stub
        if(_o == null)
        {
            return false;
        }
        if(_o.getClass()!=getClass())
        {
            return false;
        }
        Equipement _person = (Equipement)_o;
        if(_person.nom.equals(nom) && _person.rarete.equals(rarete) && _person.description.equals(description)&& _person.prix==prix)
        {
            return true;
        }
        return false;
    }
}