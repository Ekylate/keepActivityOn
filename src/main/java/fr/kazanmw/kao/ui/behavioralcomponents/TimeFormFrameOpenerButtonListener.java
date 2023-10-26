package fr.kazanmw.kao.ui.behavioralcomponents;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

import fr.kazanmw.kao.ui.MainWindow;
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
		final TimeFormFrame popupWindow = new TimeFormFrame(this.timeFormFrameParent);
		popupWindow.setVisible(true);
	}

	public void setTimeFormFrameParent(MainWindow mainWindowParam) {
		if(!Objects.isNull(mainWindowParam)) {
			this.timeFormFrameParent = mainWindowParam;
		}
	}
}
