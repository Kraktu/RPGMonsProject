package proto;

/**
 * Voleur
 */
public class Voleur extends Classe {

    public Voleur(String _nom, String _descriptionStatistiqueBonus, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _dexteriteBonus, StatistiqueBonus _constitutionBonus, Sort _sort) {

        super("Voleur", "Malgré son nom, ce n'est pas qu'un simple voleur. Grâce à leur furetivité, ils sont doués en espionnage et en assassinat mais ils ont beaucoup d'habileté pour détecter et désamorcer les pièges", _forceBonus, _intelligenceBonus, _agiliteBonus, _dexteriteBonus, _constitutionBonus, _sort);

    }
}