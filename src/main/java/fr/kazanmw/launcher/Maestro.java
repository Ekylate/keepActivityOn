package fr.kazanmw.launcher;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.StringUtils;

import fr.kazanmw.services.IOConsoleService;
import fr.kazanmw.services.TimeCalculationService;

/**
 * @author Sceok
 *
 */
public class Maestro {

	private static Integer intervalsDuration;

	private static Integer numberOfRepetitions;

	private static Integer globalDuration;


	/**
	 * @param args
	 * @throws AWTException
	 */
	public static void main(String[] args) throws AWTException {
		displayWelcomingText();
		askGlobalDuration();
		askIntervalOfRepetitions();
		calculateNumberOfRepetitions();
		launchLoop();
		displayEndingText();
	}

	private static void launchLoop() throws AWTException {
		final Robot robot = new Robot();
		for (int i = 0; i < numberOfRepetitions; i++) {
			typeKeyWithRobot(robot, KeyEvent.VK_WINDOWS);
			robot.delay(500);
			typeKeyWithRobot(robot, KeyEvent.VK_ESCAPE);
			robot.delay(getIntervalDurationInMillisecondes());
		}
	}

	private static void typeKeyWithRobot(final Robot robot, final int intKeyToType) {
		robot.keyPress(intKeyToType);
		robot.keyRelease(intKeyToType);
	}

	private static void displayWelcomingText() {
		IOConsoleService.displayMessageInConsole("Pourquoi tu veux me faire travailler ? :( :(");
	}

	private static void askGlobalDuration() {
		IOConsoleService.displayMessageInConsole("Sur quelle durée (minutes) dois-je être en activité ?");
		final String fetchedDataFromConsole = IOConsoleService.fetchDataFromConsole();
		globalDuration = fetchIntegerFromString(fetchedDataFromConsole);
	}

	private static void askIntervalOfRepetitions() {
		IOConsoleService.displayMessageInConsole("Je dois travailler toutes les X minutes : ?");
		final String fetchedDataFromConsole = IOConsoleService.fetchDataFromConsole();
		intervalsDuration = fetchIntegerFromString(fetchedDataFromConsole);
	}

	//TODO : handle NumberFormatException case
	private static Integer fetchIntegerFromString(String stringParam) {
		if (StringUtils.isNotBlank(stringParam)) {
			return Integer.parseInt(stringParam);
		}
		return null;
	}

	private static void displayEndingText() {
		IOConsoleService.displayMessageInConsole("Aaaah ! Enfin ! J'en avais marre de travailler !");
		IOConsoleService.displayMessageInConsole("Allez, ciao !");
	}

	private static void calculateNumberOfRepetitions() {
		numberOfRepetitions = TimeCalculationService.calculateNumberOfLoops(getGlobalDurationInSecondes(), getIntervalDurationInSecondes());
	}

	private static int getIntervalDurationInMinutes() {
		return intervalsDuration;
	}
	private static int getIntervalDurationInSecondes() {
		return getIntervalDurationInMinutes()*60;
	}
	private static int getIntervalDurationInMillisecondes() {
		return getIntervalDurationInSecondes()*1000;
	}

	private static int getGlobalDurationInMinutes() {
		return globalDuration;
	}
	private static int getGlobalDurationInSecondes() {
		return getGlobalDurationInMinutes()*60;
	}
	private static int getGlobalDurationInMillisecondes() {
		return getIntervalDurationInSecondes()*1000;
	}
}