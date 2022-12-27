package proto;

import java.util.Objects;

/**
 * Personnage créé par Philip
 */
public class Personnage {
    //Properties
    protected String nom;
    protected Race race;
    protected Classe classe;
    protected int niveau,vie,mana;
    protected Statistique force,intelligence,agilite,dexterite,constitution;

    //Magic
    //Constructeur


    public Personnage(String _nom, Race _race, Classe _classe, int _niveau, int _vie, int _mana, Statistique _force, Statistique _intelligence, Statistique _agilite, Statistique _dexterite, Statistique _constitution) {
        nom = _nom;
        race = _race;
        classe = _classe;
        niveau = _niveau;
        vie = _vie;
        mana = _mana;
        force = _force;
        intelligence = _intelligence;
        agilite = _agilite;
        dexterite = _dexterite;
        constitution = _constitution;
    }

    //Getters
    public String GetNom() {
        return nom;
    }
    public Race GetRace() {
        return race;
    }
    public Classe GetClasse() {
        return classe;
    }
    public int GetNiveau() {
        return niveau;
    }
    public int GetVie() {
        return vie;
    }
    public int GetMana() {
        return mana;
    }
    public Statistique GetForce() {
        return force;
    }
    public Statistique GetIntelligence() {
        return intelligence;
    }
    public Statistique GetAgilite() {
        return agilite;
    }
    public Statistique GetDexterite() {
        return dexterite;
    }
    public Statistique GetConstitution() {
        return constitution;
    }
    //Setters

    public void SetNom(String _nom) {
        nom = _nom;
    }

    public void SetRace(Race _race) {
        race = _race;
    }

    public void SetClasse(Classe _classe) {
        classe = _classe;
    }

    public void SetNiveau(int _niveau) {
        niveau = _niveau;
    }

    public void SetVie(int _vie) {
        vie = _vie;
    }

    public void SetMana(int _mana) {
        mana = _mana;
    }

    public void SetForce(Statistique _force) {
        force = _force;
    }

    public void SetIntelligence(Statistique _intelligence) {
        intelligence = _intelligence;
    }

    public void SetAgilite(Statistique _agilite) {
        agilite = _agilite;
    }

    public void SetDexterite(Statistique _dexterite) {
        dexterite = _dexterite;
    }

    public void SetConstitution(Statistique _constitution) {
        constitution = _constitution;
    }


    //Override


    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", race=" + race +
                ", classe=" + classe +
                ", niveau=" + niveau +
                ", vie=" + vie +
                ", mana=" + mana +
                ", force=" + force +
                ", intelligence=" + intelligence +
                ", agilite=" + agilite +
                ", dexterite=" + dexterite +
                ", constitution=" + constitution +
                '}';
    }

    @Override
     public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnage _personnage = (Personnage) o;
        return niveau == _personnage.niveau && vie == _personnage.vie && mana == _personnage.mana && Objects.equals(nom, _personnage.nom) && Objects.equals(race, _personnage.race) && Objects.equals(classe, _personnage.classe) && Objects.equals(force, _personnage.force) && Objects.equals(intelligence, _personnage.intelligence) && Objects.equals(agilite, _personnage.agilite) && Objects.equals(dexterite, _personnage.dexterite) && Objects.equals(constitution, _personnage.constitution);
    }

}