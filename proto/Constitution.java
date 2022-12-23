package proto;

/**
 * Force par David
 */

public class Constitution extends Statistique {

    public Constitution (int _valeur){
        super("Constitution", "Statistiques prise en compte pour les actions qui demande de la resistance physique (ne pas se blesser quand il se prend un piège, ne pas se faire empoisonner, resister aux maladies,...). Augmente le nombre total de point de vie, la qualité des armures qu'il peut porter et la resistance aux dégâts.", _valeur);
    }

}