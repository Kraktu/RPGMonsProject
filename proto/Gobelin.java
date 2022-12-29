package proto;
/**
 * Gobelin, créer par Seb
 */
public class Gobelin extends Race{
    public Gobelin(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _constitutionBonus, StatistiqueBonus _dexteriteBonus) {
        super("Gobelin", "C'est un gobelin", new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(5));
    }

}