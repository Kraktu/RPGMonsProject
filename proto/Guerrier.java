package proto;

/**
 * Guerrier
 * Créé par Simon
 */
public class Guerrier extends Classe {

    public Guerrier (String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _dexteriteBonus, StatistiqueBonus _constitutionBonus, Sort _sort){
        super("Guerrier", "Le barbare est formé au maniement de toutes les armes courantes et de guerre, ainsi qu’au port des armures légères et intermédiaires, et à l’utilisation des boucliers (à l’exception des pavois).", _forceBonus, _intelligenceBonus, _agiliteBonus, _dexteriteBonus, _constitutionBonus, _sort);
    }
}