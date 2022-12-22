package proto;

/**
 * Armure Créé par Philip
 */
public class Armure extends Equipement {

    //Properties
    private String type;
    private int armureBonus;
    //Constructeur
    public Armure(String _nom, String _description, String _rarete, int _prix, Statistique _forceBonus,Statistique _intelligenceBonus,Statistique _agilityBonus,Statistique _dexteriteBonus,Statistique _constitutionBonus,String _type, int _armureBonus)
    {
        super(_nom,_description,_rarete,_prix,_forceBonus,_intelligenceBonus,_agilityBonus,_dexteriteBonus,_constitutionBonus);
        type=_type;
        armureBonus = _armureBonus;
    }
    // Getter
    public String GetType(){
        return type;
    }
    public int GetArmureBonus(){
        return armureBonus;
    }
    //Setters
    public void SetType(String _type)
    {
        type=_type;
    }
    public void SetArmorBonus(int _armureBonus)
    {
        armureBonus=_armureBonus;
    }
    //Overrides
    @Override
    public String toString() {
           // TODO Auto-generated method stub
           String returnString = "Nom : " + nom +"\tEmplacement : " + type +  "\t rareté : " + rarete + 
           "\nprix : " + prix + "G"+
           "\n\nDescription" + description +
           "\n Modificateur d'Armure : " + armureBonus;
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
        Armure _armure = (Armure)_o;
        if(_armure.nom.equals(nom) && _armure.rarete.equals(rarete) && _armure.description.equals(description)&& _armure.prix==prix && _armure.forceBonus.equals(forceBonus) && _armure.intelligenceBonus.equals(intelligenceBonus) &&_armure.agiliteBonus.equals(agiliteBonus)&& _armure.dexteriteBonus.equals(dexteriteBonus)&&_armure.constitutionBonus.equals(constitutionBonus))
        {
            return true;
        }
        return false;
    }
}