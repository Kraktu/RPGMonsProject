package proto;
/**
 * Troll, créer par Seb
 */
public class Troll extends Race{
    // Constructeur
    public Troll(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _constitutionBonus, StatistiqueBonus _dexteriteBonus) {
        super("Troll", "Le troll est de très grande taille. Grâce à sa constitution robuste, il peut encaisser de fortes attaques. Il n'a pas besoin d'armes pour se batre car il possède aussi de grandes griffes.", new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(5), new StatistiqueBonus(0));
    }

}