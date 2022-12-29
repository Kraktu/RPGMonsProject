package proto;
/**
 * Troll, créer par Seb
 */
public class Troll extends Race{
    // Constructeur
    public Troll(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _constitutionBonus, StatistiqueBonus _dexteriteBonus) {
        super("Troll", "C'est un troll", new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(5), new StatistiqueBonus(0));
    }

}