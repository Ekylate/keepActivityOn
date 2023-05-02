package launcher;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import services.IOConsoleService;
import services.TimeCalculationService;

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
		askIntervalOfRepetitions();
		askGlobalDuration();
		calculateNumberOfRepetitions();
		launchLoop();
		displayEndingText();
	}

	private static void launchLoop() throws AWTException {
		final Robot robot = new Robot();
		for (int i = 0; i < numberOfRepetitions; i++) {
			typeKeyWithRobot(robot, KeyEvent.VK_WINDOWS);
			robot.delay(1000);
			typeKeyWithRobot(robot, KeyEvent.VK_ESCAPE);
			robot.delay(intervalsDuration);
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
		IOConsoleService.displayMessageInConsole("Sur quelle durée dois-je être en activité ?");
		final String fetchedDataFromConsole = IOConsoleService.fetchDataFromConsole();
		globalDuration = fetchIntegerFromString(fetchedDataFromConsole);
	}

	private static void askIntervalOfRepetitions() {
		IOConsoleService.displayMessageInConsole("Je dois travailler toutes les X minutes : ?");
		final String fetchedDataFromConsole = IOConsoleService.fetchDataFromConsole();
		intervalsDuration = fetchIntegerFromString(fetchedDataFromConsole);
		if(Objects.nonNull(intervalsDuration)) {
			intervalsDuration *= 60000;
		}
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
		numberOfRepetitions = TimeCalculationService.calculateNumberOfLoops(globalDuration, intervalsDuration);
	}
}