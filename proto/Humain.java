package proto;

/**
 * Humain, créer par Seb
 */

public class Humain extends Race {

    // Constructeur

    public Humain(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _constitutionBonus, StatistiqueBonus _dexteriteBonus) {
        super("Humain", "Un humain est un personnage classique, sans traits physiques particuliers. Ils se battent autant avec des armes blanches qu'avec des armes à distance ou encore avec la magie.", new StatistiqueBonus(5), new StatistiqueBonus(5), new StatistiqueBonus(5), new StatistiqueBonus(5), new StatistiqueBonus(5));
    }
}