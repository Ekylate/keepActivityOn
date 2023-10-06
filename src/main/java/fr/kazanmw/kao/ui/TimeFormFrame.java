package fr.kazanmw.kao.ui;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class TimeFormFrame extends JDialog {
	/**
	 *
	 */
	private static final long serialVersionUID = -5769229015939015571L;
	private final JPanel panel_4;

	public TimeFormFrame() {

		final Box verticalBox = Box.createVerticalBox();
		final GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(verticalBox, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(verticalBox, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
					.addGap(10))
		);

		final JPanel panel_2 = new JPanel();
		verticalBox.add(panel_2);

		final JLabel lblNewLabel_4 = new JLabel("End of work on...");
		panel_2.add(lblNewLabel_4);

		this.panel_4 = new JPanel();
		verticalBox.add(this.panel_4);

		final JSpinner spinner_1_1 = new JSpinner();
		this.panel_4.add(spinner_1_1);

		final JLabel lblNewLabel_1_1 = new JLabel("Hour");
		this.panel_4.add(lblNewLabel_1_1);

		final JSpinner spinner_2_1 = new JSpinner();
		this.panel_4.add(spinner_2_1);

		final JLabel lblNewLabel_2_1 = new JLabel("Min");
		this.panel_4.add(lblNewLabel_2_1);

		final JSpinner spinner_3_1 = new JSpinner();
		this.panel_4.add(spinner_3_1);

		final JLabel lblNewLabel_3_1 = new JLabel("Sec");
		this.panel_4.add(lblNewLabel_3_1);

		final JPanel panel_3 = new JPanel();
		verticalBox.add(panel_3);

		final JButton btnNewButton_2 = new JButton("Valider");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_3.add(btnNewButton_2);

		final JButton btnNewButton_1_1 = new JButton("Effacer");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TimeFormFrame.this.eraseValues();
			}
		});
		panel_3.add(btnNewButton_1_1);
		this.getContentPane().setLayout(groupLayout);
	}

	private void eraseValues() {
		final List<JSpinner> spinners = this.getJSpinnerFromJPanel();
		this.reinitJSpinnerValues(spinners);
	}

	private List<JSpinner> getJSpinnerFromJPanel() {
		final List<JSpinner> result = new ArrayList<>();
		for (final Component loopComponent : this.panel_4.getComponents()) {
			if(loopComponent instanceof JPanel) {
				result.add((JSpinner) loopComponent);
			}
		}
		return result;
	}

	private void reinitJSpinnerValues(List<JSpinner> spinners) {
		if(Objects.nonNull(spinners)) {
			spinners.forEach(sp -> sp.setValue(0));
		}
	}
}
