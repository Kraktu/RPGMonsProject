package proto;

/**
 * lesPersonnagesEnCombat, creer par David.
 */
public class lesPersonnagesEnCombat {

    private Joueur lePersonnageJouable = new Joueur(null, null, null, 5, 0, 0, null, null, null, null, null, null, 0, 0);

    private  Ennemi ennemisActuel = new Ennemi(null, null, null, 5, 0, 0, null, null, null, null, null, null, null);


    // getters

    public Joueur GetLePersonnageJouable(){
        return lePersonnageJouable;
    }

    public Ennemi GetEnnemisActuel(){
        return ennemisActuel;
    }

    // setters

    public void SetLePersonnageJouable(Joueur _lePersonnageJouable){
        lePersonnageJouable = _lePersonnageJouable;
    }

    public void SetEnnemisActuel(Ennemi _ennemisActuel){
        ennemisActuel = _ennemisActuel;
    }

    // fonctions

    public Ennemi InitialiseNewEnnemi (Ennemi _newEnnemi){

        ennemisActuel.nom = _newEnnemi.nom;
        ennemisActuel.race = _newEnnemi.race;
        ennemisActuel.classe = _newEnnemi.classe;
        ennemisActuel.niveau = _newEnnemi.niveau;
        ennemisActuel.vie = _newEnnemi.vie;
        ennemisActuel.mana = _newEnnemi.mana;
        ennemisActuel.force = _newEnnemi.force;
        ennemisActuel.intelligence = _newEnnemi.intelligence;
        ennemisActuel.agilite = _newEnnemi.agilite;
        ennemisActuel.dexterite = _newEnnemi.dexterite;
        ennemisActuel.constitution = _newEnnemi.constitution;
        ennemisActuel.SetArme(_newEnnemi.GetArme());
        ennemisActuel.SetEquipement(_newEnnemi.GetEquipement());

        return _newEnnemi;
    }

}