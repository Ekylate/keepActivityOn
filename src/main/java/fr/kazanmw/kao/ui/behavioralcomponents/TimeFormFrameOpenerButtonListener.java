package fr.kazanmw.kao.ui.behavioralcomponents;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fr.kazanmw.kao.ui.TimeFormFrame;

/**
 * @author Sceok
 *
 */
public class TimeFormFrameOpenerButtonListener extends MouseAdapter {

	private Frame timeFormFrameParent;

	@Override
	public void mouseClicked(MouseEvent e) {
		this.openTimeFormFrame();
	}

	public void openTimeFormFrame() {
		// TODO Auto-generated method stub
		final TimeFormFrame popupWindow = new TimeFormFrame();
		popupWindow.setVisible(true);
	}
}
