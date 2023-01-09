package proto;

/**
 * lesPersonnagesEnCombat, creer par David.
 */
public class lesPersonnagesEnCombat {

    private Joueur lePersonnageJouable = new Joueur(null, null, null, 0, 0, 0, null, null, null, null, null, null, 0, 0);

    private  Ennemi ennemisActuel = new Ennemi(null, null, null, 0, 0, 0, null, null, null, null, null, null, null);


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

}