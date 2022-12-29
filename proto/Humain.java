package proto;

/**
 * Humain, créer par Seb
 */

public class Humain extends Race {

    // Constructeur

    public Humain(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _constitutionBonus, StatistiqueBonus _dexteriteBonus) {
        super("Humain", "C'est un humain", new StatistiqueBonus(5), new StatistiqueBonus(5), new StatistiqueBonus(5), new StatistiqueBonus(5), new StatistiqueBonus(5));
    }
}