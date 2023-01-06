package proto.Classes;

import proto.Sort;
import proto.Stat.StatistiqueBonus;

/**
 * Mage
 */

public class Mage extends Classe {
    // Constructeur
    public Mage (String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _dexteriteBonus, StatistiqueBonus _constitutionBonus, Sort _sort) {
    super("mage", "Le mage n'a pas beaucoup d'aptitudes physiques, son domaine de prédilection est la magie sous toutes ses formes. Ses connaissances s'approfondissent dans un ou plusieurs domaine en fonction de l'aventure.", _forceBonus, _intelligenceBonus, _agiliteBonus, _dexteriteBonus, _constitutionBonus, _sort);
    }
}