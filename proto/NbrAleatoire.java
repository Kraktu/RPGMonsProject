package proto;

import java.util.Random;

/**
 * NbrAleatoire créer par Bruno
 */
public class NbrAleatoire {

	public int GenererNbrAleatoireBorne(int _nbrMin, int _nbrMax) {

		Random random = new Random();

		int _nbrAleatoire = random.nextInt(_nbrMax + _nbrMin) + _nbrMin;

		return _nbrAleatoire;
	}
}