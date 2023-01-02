package proto;

/*Element créé par Bruno
 */
public class Element {

    /*
    string name;
    Element beatenElement, loosingElement; efficace

    int bonusAgainstBeatenElement, malusAgainstLoosingElement;*/

    // Propriétés :

    protected String nom;

    protected Element efficaciterElement,inneficaciterElement;

    protected int efficaciterBonus,inneficaciterMalus;

    // Constructeur


    public Element(String _nom, Element _efficaciterElement, Element _inneficaciterElement, int _efficaciterBonus, int _inneficaciterMalus) {
        nom = _nom;
        efficaciterElement = _efficaciterElement;
        inneficaciterElement = _inneficaciterElement;
        efficaciterBonus = _efficaciterBonus;
        inneficaciterMalus = _inneficaciterMalus;
    }

    // Getters :


    public String GetNom() {
        return nom;
    }

    public Element GetEfficaciterElement() {
        return efficaciterElement;
    }

    public Element GetInneficaciterElement() {
        return inneficaciterElement;
    }

    public int GetEfficaciterBonus() {
        return efficaciterBonus;
    }

    public int GetInneficaciterMalus() {
        return inneficaciterMalus;
    }

    // Setters :


    public void SetNom(String _nom) {
        nom = _nom;
    }

    public void SetEfficaciterElement(Element _efficaciterElement) {
        efficaciterElement = _efficaciterElement;
    }

    public void SetInneficaciterElement(Element _inneficaciterElement) {
        inneficaciterElement = _inneficaciterElement;
    }

    public void SetEfficaciterBonus(int _efficaciterBonus) {
        efficaciterBonus = _efficaciterBonus;
    }

    public void SetInneficaciterMalus(int _inneficaciterMalus) {
        inneficaciterMalus = _inneficaciterMalus;
    }

    // Override


    @Override
    public java.lang.String toString() {
        return "Element{" +
                "nom='" + nom + '\'' +
                ", efficaciterElement=" + efficaciterElement +
                ", inneficaciterElement=" + inneficaciterElement +
                ", efficaciterBonus=" + efficaciterBonus +
                ", inneficaciterMalus=" + inneficaciterMalus +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Element element = (Element) object;
        return efficaciterBonus == element.efficaciterBonus && inneficaciterMalus == element.inneficaciterMalus && java.util.Objects.equals(nom, element.nom) && java.util.Objects.equals(efficaciterElement, element.efficaciterElement) && java.util.Objects.equals(inneficaciterElement, element.inneficaciterElement);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), efficaciterBonus, inneficaciterMalus);
    }
}