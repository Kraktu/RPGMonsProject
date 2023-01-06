package proto;

// 1) Je donne un nom de classe comme n'importe quelle autre classe
public final class Singleton {

    // 2) Je crée une variable du type de ma classe qui s'appelle instance
    private static Singleton instance;
    // 3) Je déclare mes propriétés, certaines que je vais donner à la construction de l'objet et/ou certaines qui ont des valeurs fixes
    public String value;
    public Classe machin = new Classe("machin", "c'est un machin");

    // 4) Je passe mon constructeur en privé sinon, le reste ne change pas
    private Singleton(String _value) {
        value = _value;
    }

    // 5) C'est ici en dessous que je vais déclarer mon "vrai" constructeur que je vais appeler de l'exetieur, pour être sur de ne pas avoir 2x d'instance de cette classe. Single = simple, seul
    public static Singleton GetInstance(String value) {
        // Si l'instance n'existe pas, il n'y a pas encore d'instance de ma classe, donc j'en crée une avec les paramètres qu'il faut
        if (instance == null) {
            instance = new Singleton(value);
        }
        // Sinon, ça veut dire que j'ai déjà créé ma classe, et donc je la récupère, mais je n'en crée pas une nouvelle.
        return instance;
    }

    // 6) Utiliser le Singleton comme ceci :

    public static void main(String[] args) {
        // Je crée une instance de mon singleton
        Singleton singleton = Singleton.GetInstance("test");
        // Je peux accéder aux données de mon singleton !
        System.out.println(singleton.machin);
    }
}