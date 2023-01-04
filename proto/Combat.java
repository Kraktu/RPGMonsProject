import proto.NbrAleatoire;

/**
 * Combat crée par Seb
 */
public class Combat {
public void SeBattre() {
    System.out.println("Le dé est lancé pour déterminer celui qui va engager le combat.");
NbrAleatoire nbrAl = new NbrAleatoire();
int jet = nbrAl.GenererNbrAleatoireBorne(1, 6);
System.out.println("Le chiffre obtenu est " + jet);
if (jet<3) {
System.out.println("C'est à vous de comencer.");    
}
else if (jet>3) {
System.out.println("Votre ennemi commence.");    
}
else {
System.out.println("égalité !");
SeBattre();
}
}
    
}