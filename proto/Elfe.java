package proto;
/**
 * Elfe créé par Seb
 */


public class Elfe extends Race {

    // Constructeur
    public Elfe(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _constitutionBonus, StatistiqueBonus _dexteriteBonus) {
        super("Elfe", "L'elfe est longiligne avec des oreilles pointues. ses principals atous sont l'agilité et la furtivité. Il a une bonne capacité de visée qui permet une attaque à distance efficace.", new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(5), new StatistiqueBonus(0), new StatistiqueBonus(0));
    }


}