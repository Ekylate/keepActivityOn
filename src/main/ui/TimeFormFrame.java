package ui;

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

		final JPanel panel_4 = new JPanel();
		verticalBox.add(panel_4);

				final JSpinner spinner_1_1 = new JSpinner();
				panel_4.add(spinner_1_1);

				final JLabel lblNewLabel_1_1 = new JLabel("Hour");
				panel_4.add(lblNewLabel_1_1);

				final JSpinner spinner_2_1 = new JSpinner();
				panel_4.add(spinner_2_1);

				final JLabel lblNewLabel_2_1 = new JLabel("Min");
				panel_4.add(lblNewLabel_2_1);

				final JSpinner spinner_3_1 = new JSpinner();
				panel_4.add(spinner_3_1);

				final JLabel lblNewLabel_3_1 = new JLabel("Sec");
				panel_4.add(lblNewLabel_3_1);

		final JPanel panel_3 = new JPanel();
		verticalBox.add(panel_3);

		final JButton btnNewButton_2 = new JButton("Valider");
		panel_3.add(btnNewButton_2);

		final JButton btnNewButton_1_1 = new JButton("Effacer");
		panel_3.add(btnNewButton_1_1);
		this.getContentPane().setLayout(groupLayout);
	}
}
