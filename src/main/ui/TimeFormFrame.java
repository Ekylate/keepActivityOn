package ui;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TimeFormFrame extends JDialog {
	/**
	 *
	 */
	private static final long serialVersionUID = -5769229015939015571L;

	public TimeFormFrame() {

		final JPanel panel_1 = new JPanel();
		final GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(149, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(149, Short.MAX_VALUE))
		);

		final JLabel lblNewLabel = new JLabel("New label");

		final JPanel panel = new JPanel();

		final JSpinner spinner_1 = new JSpinner();
		panel.add(spinner_1);

		final JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);

		final JSpinner spinner_2 = new JSpinner();
		panel.add(spinner_2);

		final JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2);

		final JSpinner spinner_3 = new JSpinner();
		panel.add(spinner_3);

		final JLabel lblNewLabel_3 = new JLabel("New label");
		panel.add(lblNewLabel_3);

		final JButton btnNewButton = new JButton("Valider");

		final JButton btnNewButton_1 = new JButton("Effacer");
		final GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
							.addGap(34)
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1)
							.addContainerGap())))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(104)
					.addComponent(lblNewLabel)
					.addContainerGap(135, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(18)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)))
		);
		panel_1.setLayout(gl_panel_1);
		this.getContentPane().setLayout(groupLayout);
	}
}
