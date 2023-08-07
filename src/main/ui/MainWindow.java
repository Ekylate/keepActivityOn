package ui;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class MainWindow extends JFrame {

	private static final String TOOLTIP_01 = "Cliquez ici pour renseigner cette information";
	private static final String TOOLTIP_02 = "Cliquez sur le premier ou le second choix pour les renseigner";
	private static final long serialVersionUID = 6841497333789115515L;
	private final JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					final MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (final Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 300, 263);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setContentPane(this.contentPane);
		this.contentPane.setLayout(new MigLayout("", "[310px]", "[72px][10px]"));

		final JPanel panel_1 = new JPanel();
		this.contentPane.add(panel_1, "cell 0 0,alignx center,aligny center");
		panel_1.setLayout(new MigLayout("", "[188px][10px]", "[24px][]"));

		final JPanel panel = new JPanel();
		panel_1.add(panel, "cell 0 0,alignx left,aligny top");

		final JLabel questionOneLabel = new JLabel("À quel intervalle dois-je me réveiller ?");
		panel.add(questionOneLabel);

		final JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "cell 0 1,alignx center,aligny center");

		final JSpinner spinner = new JSpinner();
		panel_2.add(spinner);

		final JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(3);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"H", "Min", "Sec"}));
		comboBox.setSelectedIndex(0);
		panel_2.add(comboBox);

		final JPanel panel_3 = new JPanel();
		this.contentPane.add(panel_3, "cell 0 1,alignx center,aligny center");
		panel_3.setLayout(new MigLayout("", "[195px,grow]", "[24px][grow][grow][grow][]"));

		final JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, "cell 0 0,alignx left,aligny top");

		final JLabel lblNewLabel = new JLabel("Quand dois-je arrêter de me réveiller ?");
		panel_4.add(lblNewLabel);
		panel_4.setToolTipText(TOOLTIP_02);

		final JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			MainWindow.this.openTimeFormFrame();
			}

		});

		panel_5.setToolTipText(TOOLTIP_01);
		panel_3.add(panel_5, "cell 0 1,grow");

		final JLabel lblNewLabel_1 = new JLabel("dans...");
		panel_5.add(lblNewLabel_1);

		final JPanel panel_5_1 = new JPanel();
		panel_3.add(panel_5_1, "cell 0 2,grow");

		final JLabel lblNewLabel_1_1 = new JLabel("OU");
		panel_5_1.add(lblNewLabel_1_1);
		panel_5_1.setToolTipText(TOOLTIP_02);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainWindow.this.openTimeFormFrame();
			}
		});
		panel_3.add(panel_5_1_1, "cell 0 3,grow");

		final JLabel lblNewLabel_1_1_1 = new JLabel("à cette heure précise :");
		panel_5_1_1.add(lblNewLabel_1_1_1);
		panel_5_1_1.setToolTipText(TOOLTIP_01);
	}

	private void openTimeFormFrame() {
		// TODO Auto-generated method stub
		final TimeFormFrame popupWindow = new TimeFormFrame();
		popupWindow.setVisible(true);
	}
}
