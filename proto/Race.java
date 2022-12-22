package proto;
// fait par Seb
/**
 * Race
 */
public class Race {
// propriete
private String nom;
private Statistique stat;
// constructeur
public Race(String nom, Statistique stat ) {
nom=_nom;
stat=_stat;    
}

// getters
    public String  GetNom() {
return nom;        
    }
    public Statistique GetStat() {
return stat;        
    }
// Setters
public void SetNom(String _nom) {
    nom=_nom;
}
public void SetStat(Statistique _stat) {
stat=_stat;    
}

    
}