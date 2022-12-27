package proto;
/**
 * Humain, créer par Seb
 */
public class Humain extends Race {

    public Humain(String _nom, Force _forceBonus, Intelligence _intelBonus, Agilite _agilBonus) {

        super("Humain", new Force(5), new Intelligence(5), new Agilite(5));

    }

}
