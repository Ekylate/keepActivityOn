package fr.kazanmw.kao.launcher;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 * @author Sceok
 *
 */
public class Maestro {

	/**
	 * @param args
	 * @throws AWTException
	 */
	public static void main(String[] args) throws AWTException {
		final Robot robot = new Robot();
		for (int i = 0; i < 3; i++) {
			typeKeyWithRobot(robot, KeyEvent.VK_WINDOWS);
			robot.delay(1000);
			typeKeyWithRobot(robot, KeyEvent.VK_ESCAPE);
			robot.delay(5000);
		}
	}

	private static void typeKeyWithRobot(final Robot robot, final int intKeyToType) {
		robot.keyPress(intKeyToType);
		robot.keyRelease(intKeyToType);
	}

}