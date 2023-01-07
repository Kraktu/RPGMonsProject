package proto.Classes;
import proto.Sort;
import proto.Stat.StatistiqueBonus;

/**
 * Archer, Créé par David.
 */
public class Archer extends Classe {

    public Archer (String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _dexteriteBonus, StatistiqueBonus _constitutionBonus, Sort _sort){

        super("Archer", "C'est une archer", _forceBonus, _intelligenceBonus, _agiliteBonus, _dexteriteBonus, _constitutionBonus, _sort);

    }

}