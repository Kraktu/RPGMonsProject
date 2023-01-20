package proto.Fonctions;

import java.util.Random;

public class MathFonction {

    public int NbrAleatoireEntreDeuxValeur(int _minimum, int _maximum){

        Random aleatoire = new Random();

        return aleatoire.nextInt((_maximum + 1) - _minimum) + _minimum;

    }
    
}
