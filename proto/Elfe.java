package proto;
/**
 * Elfe créé par Seb
 */


public class Elfe extends Race {

    // Constructeur
    public Elfe(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _constitutionBonus, StatistiqueBonus _dexteriteBonus) {
        super("Elfe", "C'est un elfe", new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(5), new StatistiqueBonus(0), new StatistiqueBonus(0));
    }


}