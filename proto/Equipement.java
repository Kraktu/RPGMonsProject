package proto;

/**
 * Equipement Créé par Philip
 */
public class Equipement {

    //Properties
    protected String nom, description, rarete;
    protected Statistique forceBonus, intelligenceBonus, agiliteBonus, dexteriteBonus, constitutionBonus;
    protected int prix;

    //Magic
    //Constructor

    public Equipement(String _nom, String _description, String _rarete, int _prix, Statistique _forceBonus,Statistique _intelligenceBonus,Statistique _agilityBonus,Statistique _dexteriteBonus,Statistique _constitutionBonus){
        nom = _nom;
        description = _description;
        rarete = _rarete;
        forceBonus= _forceBonus;
        intelligenceBonus = _intelligenceBonus;
        agiliteBonus = _agilityBonus;
        dexteriteBonus = _dexteriteBonus;
        constitutionBonus = _constitutionBonus;
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
    public Statistique GetForceBonus(){
        return forceBonus;
    }
    public Statistique GetIntelligenceBonus(){
        return intelligenceBonus;
    }
    public Statistique GetAgiliteBonus(){
        return agiliteBonus;
    }
    public Statistique GetDexteriteBonus(){
        return dexteriteBonus;
    }
    public Statistique GetConstitutionBonus(){
        return constitutionBonus;
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
    public void SetForceBonus(Statistique _forceBonus)
    {
        forceBonus = _forceBonus;
    }
    public void SetIntelligenceBonus(Statistique _intelligenceBonus)
    {
        intelligenceBonus = _intelligenceBonus;
    }
    public void SetAgiliteBonus(Statistique _agiliteBonus)
    {
        agiliteBonus = _agiliteBonus;
    }
    public void SetDexteriteBonus(Statistique _dexteriteBonus)
    {
        dexteriteBonus = _dexteriteBonus;
    }
    public void SetConstitutionBonus(Statistique _constitutionBonus)
    {
        constitutionBonus = _constitutionBonus;
    }
    public void SetPrix(int _prix)
    {
        prix = _prix;
    }

    //Overrides

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String returnString = "Nom : " + nom + "\t rareté : " + rarete + 
        "\nprix : " + prix + "G"+
        "\n\nDescription" + description;
        // Rajouter les ifs sur les statistiques quans Simon aura fini
        return returnString;
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
        Equipement _equipement = (Equipement)_o;
        if(_equipement.nom.equals(nom) && _equipement.rarete.equals(rarete) && _equipement.description.equals(description)&& _equipement.prix==prix && _equipement.forceBonus.equals(forceBonus) && _equipement.intelligenceBonus.equals(intelligenceBonus) &&_equipement.agiliteBonus.equals(agiliteBonus)&& _equipement.dexteriteBonus.equals(dexteriteBonus)&&_equipement.constitutionBonus.equals(constitutionBonus))
        {
            return true;
        }
        return false;
    }
}