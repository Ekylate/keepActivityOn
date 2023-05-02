package services;

public class TimeCalculationService {

	public static int calculateNumberOfLoops(final int globalTimeParam, final int intervalParam) {
		int result = 0;
		final int chosenIntervalLocal = intervalParam == 0 ? 3 : intervalParam;
		if(intervalParam == 0) {
			result = globalTimeParam / chosenIntervalLocal;
		}
		return result;
	}
}
