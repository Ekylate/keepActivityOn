package fr.kazanmw.services;

public class TimeCalculationService {

	/**
	 * Calcule le nombre de répétitions à effectuer en fonction des deux paramètres de temps exprimés en secondes.
	 * @param globalTimeParam nombre de secondes de la durée totale de travail.
	 * @param intervalParam nombre de secondes entre chaque intervention/répétition.
	 * @return
	 */
	public static int calculateNumberOfLoops(final int globalTimeParam, final int intervalParam) {
		int result = 0;
		final int chosenIntervalLocal = intervalParam == 0 ? 3 : intervalParam;
		if(chosenIntervalLocal != 0) {
			result = globalTimeParam / chosenIntervalLocal;
		}
		return result;
	}
}
