package proto.Race;

import proto.Stat.StatistiqueBonus;

/**
 * Nain, créer par Seb
 */
public class Nain extends Race {

    // Constructeur

    public Nain(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _constitutionBonus, StatistiqueBonus _dexteriteBonus) {

        super("Nain",
        "Les nains sont de petite taille mais ils sont plus trapus que les gobelins. Leur atouts sont la force physique et leur intelligence. Ils combattent généralement à la hache ou au marteau.",
        new StatistiqueBonus(0),
        new StatistiqueBonus(0),
        new StatistiqueBonus(0),
        new StatistiqueBonus(0),
        new StatistiqueBonus(0)
        );

    }

}