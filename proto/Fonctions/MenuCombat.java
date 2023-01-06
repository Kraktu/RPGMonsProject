package proto.Fonctions;
import proto.Combat;

/**
 * MenuCombat crée par Seb
 */
public class MenuCombat {
public int ChoixMenuCombat() {
int _choix;
    EntreUtilisateur _EntreUtilisateur = new EntreUtilisateur();
    Combat _Combat = new Combat();
do {
    _choix=_EntreUtilisateur.EntreeUtilisateurInt("Que souhaitez-vous faire ?\nEntrer 1 pour lancer le combat,\nTaper 2 pour fuire,");
switch (_choix) {
    case 1:
        System.out.println("C'est parti.");
        _Combat.SeBattre();
        break;
case 2 :
System.out.println("On dirait que vous avez peur !");
    default:
    System.out.println("Erreur.");
        break;
}    
} while (_choix<1 || _choix>2);





return _choix;
}
    
}