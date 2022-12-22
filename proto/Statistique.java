package proto;

/**
 * Statistique
 */
public class Statistique {

private int force;
private int intelligence;
private int agilite;
private int dexterite;
private int constitution;
public Animal(int _force, int _intelligence, int _agilite, int _dexterite, int _constitution) {
    force=_force;
}intelligence=_intelligence;
agilite=_agilite;
dexterite=_dexterite;
constitution=_constitution

/**
 * getters
 */
public int GetForce(){
    return force;
}
public int GetIntelligence() {return intelligence;
    
}
public int GetAgilite() {return agilite;
    
}
public int GetDexterite(){
    return dexterite;
}
public int GetConstitution() {
    return constitution;
}

/**
 * setters
 */
public void SetForce(int _newForce) {
    force=_newForce;
}
public void SetIntelligence(int _newIntelligence) {
    intelligence=_newIntelligence
}
public void SetAgilite(int _newAgilite) {
    agilite=_newAgilite
}
public void SetDexterite(int _newDexterite) {
    dexterite=_newDexterite;
    public void SetConstitution(int _newConstitution) {
        constitution=_newConstitution
    }
}
}