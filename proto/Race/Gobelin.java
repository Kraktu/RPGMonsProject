package proto.Race;

import proto.Stat.StatistiqueBonus;

/**
 * Gobelin, créer par Seb
 */
public class Gobelin extends Race{
    public Gobelin(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _constitutionBonus, StatistiqueBonus _dexteriteBonus) {
        super("Gobelin", "Les gobelins sont de petite taille, similaire à celle des nains mais plus maigres. Ils sont vicieux et sebattent avec de petites armes comme le poignard.", new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(5));
    }

}