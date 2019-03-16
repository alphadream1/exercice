package jeudedes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class IHM {

	// Outils

	// Composants graphique
	JFrame frame;
	private JTextField textFieldScoreJ1;
	private JTextField textFieldDe1;
	private JTextField textFieldDe2;
	private JTextField textFieldScoreJ2;
	private JButton btnLancerJ1;
	private JLabel labelTourValue;
	private JButton btnLancerJ2;
	private JButton btnRestart;
	private JLabel lblJoueur2;
	JCheckBox cbJ1, cbJ2;
	private JLabel lblJoueur1;

	// Controler
	private Controler controler;
	private JLabel lblMessage;

	/**
	 * Create the application.
	 */
	public IHM() {
		initialize();
	}

	// ------------------------------------
	// Methode pour mettre jour les donn�es
	// ------------------------------------
	public void majJ1(String nom, String score, boolean tricheur) {
		lblJoueur1.setText(nom);
		textFieldScoreJ1.setText(score);
		cbJ1.setSelected(tricheur);
	}

	public void majJ2(String nom, String score, boolean tricheur) {
		lblJoueur2.setText(nom);
		textFieldScoreJ2.setText(score);
		cbJ2.setSelected(tricheur);
	}

	public void majTour(String nbTour) {
		labelTourValue.setText(nbTour);
	}

	public void majDe(String scoreDe1, String scoreDe2) {
		textFieldDe1.setText(scoreDe1);
		textFieldDe2.setText(scoreDe2);
	}

	public void majScorePartieJ1(String scorePartie) {
		textFieldScoreJ1.setText(scorePartie);
	}

	public void majScorePartieJ2(String scorePartie) {
		textFieldScoreJ2.setText(scorePartie);
	}

	public void updateVisibilityButtons(boolean btLancerJ1, boolean btLancerJ2, boolean btRestart) {
		btnLancerJ1.setVisible(btLancerJ1);
		btnLancerJ2.setVisible(btLancerJ2);
		btnRestart.setVisible(btRestart);
	}

	public void updateMessage(String message) {
		lblMessage.setText(message);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 682, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblJoueur1 = new JLabel("Joueur 1");
		lblJoueur1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJoueur1.setBounds(39, 45, 82, 18);
		frame.getContentPane().add(lblJoueur1);

		lblJoueur2 = new JLabel("Joueur 2");
		lblJoueur2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJoueur2.setBounds(500, 45, 108, 18);
		frame.getContentPane().add(lblJoueur2);

		final JLabel lblDe1 = new JLabel("DE 1");
		lblDe1.setBounds(235, 123, 46, 14);
		frame.getContentPane().add(lblDe1);

		final JLabel lblDe2 = new JLabel("DE 2");
		lblDe2.setBounds(315, 123, 46, 14);
		frame.getContentPane().add(lblDe2);

		final JLabel lblScoreJ1 = new JLabel("Score");
		lblScoreJ1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblScoreJ1.setBounds(33, 93, 57, 23);
		frame.getContentPane().add(lblScoreJ1);

		textFieldScoreJ1 = new JTextField();
		textFieldScoreJ1.setEditable(false);
		textFieldScoreJ1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldScoreJ1.setBackground(Color.WHITE);
		textFieldScoreJ1.setText("0");
		textFieldScoreJ1.setBounds(86, 96, 35, 20);
		frame.getContentPane().add(textFieldScoreJ1);
		textFieldScoreJ1.setColumns(10);

		textFieldDe1 = new JTextField();
		textFieldDe1.setEditable(false);
		textFieldDe1.setText("1");
		textFieldDe1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDe1.setColumns(10);
		textFieldDe1.setBackground(Color.WHITE);
		textFieldDe1.setBounds(211, 148, 70, 64);
		frame.getContentPane().add(textFieldDe1);

		textFieldDe2 = new JTextField();
		textFieldDe2.setEditable(false);
		textFieldDe2.setText("1");
		textFieldDe2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDe2.setColumns(10);
		textFieldDe2.setBackground(Color.WHITE);
		textFieldDe2.setBounds(304, 148, 70, 64);
		frame.getContentPane().add(textFieldDe2);

		final JLabel labelScoreJ2 = new JLabel("Score : ");
		labelScoreJ2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelScoreJ2.setBounds(479, 93, 57, 23);
		frame.getContentPane().add(labelScoreJ2);

		textFieldScoreJ2 = new JTextField();
		textFieldScoreJ2.setEditable(false);
		textFieldScoreJ2.setText("0");
		textFieldScoreJ2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldScoreJ2.setColumns(10);
		textFieldScoreJ2.setBackground(Color.WHITE);
		textFieldScoreJ2.setBounds(532, 96, 35, 20);
		frame.getContentPane().add(textFieldScoreJ2);

		final JLabel lblTour = new JLabel("Tour : ");
		lblTour.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTour.setBounds(247, 36, 67, 27);
		frame.getContentPane().add(lblTour);

		labelTourValue = new JLabel("0");
		labelTourValue.setFont(new Font("Tahoma", Font.PLAIN, 22));
		labelTourValue.setBounds(324, 36, 37, 27);
		frame.getContentPane().add(labelTourValue);

		btnLancerJ1 = new JButton("Lancer");
		btnLancerJ1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controler.clicLancerJ1();
			}
		});

		btnLancerJ1.setBounds(33, 169, 89, 23);
		frame.getContentPane().add(btnLancerJ1);

		btnLancerJ2 = new JButton("Lancer");
		btnLancerJ2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controler.clicLancerJ2();
			}

		});

		btnLancerJ2.setBounds(479, 169, 89, 23);
		frame.getContentPane().add(btnLancerJ2);

		btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controler.clicRestart();
			}

		});

		btnRestart.setBounds(224, 263, 140, 23);
		frame.getContentPane().add(btnRestart);

		cbJ1 = new JCheckBox("Tricheur");
		cbJ1.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				controler.checkChangeJ1(cbJ1.isSelected());
			}
		});

		cbJ1.setBounds(24, 119, 97, 23);
		frame.getContentPane().add(cbJ1);

		cbJ2 = new JCheckBox("Tricheur");
		cbJ2.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				controler.checkChangeJ2(cbJ2.isSelected());
			}
		});

		cbJ2.setBounds(470, 119, 97, 23);
		frame.getContentPane().add(cbJ2);

		lblMessage = new JLabel("message");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMessage.setBounds(183, 312, 226, 23);
		frame.getContentPane().add(lblMessage);

	}

	// --------------------
	// GETTER / SETTER
	// ------------------------

	public void setControler(Controler controler) {
		this.controler = controler;
	}

	public Controler getControler() {
		return controler;
	}

	public JTextField getTextFieldScoreJ1() {
		return textFieldScoreJ1;
	}

	public void setTextFieldScoreJ1(JTextField textFieldScoreJ1) {
		this.textFieldScoreJ1 = textFieldScoreJ1;
	}

	public JTextField getTextFieldDe1() {
		return textFieldDe1;
	}

	public void setTextFieldDe1(JTextField textFieldDe1) {
		this.textFieldDe1 = textFieldDe1;
	}

	public JTextField getTextFieldDe2() {
		return textFieldDe2;
	}

	public void setTextFieldDe2(JTextField textFieldDe2) {
		this.textFieldDe2 = textFieldDe2;
	}

	public JTextField getTextFieldScoreJ2() {
		return textFieldScoreJ2;
	}

	public void setTextFieldScoreJ2(JTextField textFieldScoreJ2) {
		this.textFieldScoreJ2 = textFieldScoreJ2;
	}

	public JButton getBtnLancerJ1() {
		return btnLancerJ1;
	}

	public void setBtnLancerJ1(JButton btnLancerJ1) {
		this.btnLancerJ1 = btnLancerJ1;
	}

	public JLabel getLabelTourValue() {
		return labelTourValue;
	}

	public void setLabelTourValue(JLabel labelTourValue) {
		this.labelTourValue = labelTourValue;
	}

	public JButton getBtnLancerJ2() {
		return btnLancerJ2;
	}

	public void setBtnLancerJ2(JButton btnLancerJ2) {
		this.btnLancerJ2 = btnLancerJ2;
	}

	public JButton getBtnRestart() {
		return btnRestart;
	}

	public void setBtnRestart(JButton btnRestart) {
		this.btnRestart = btnRestart;
	}

	public JLabel getLblJoueur2() {
		return lblJoueur2;
	}

	public void setLblJoueur2(JLabel lblJoueur2) {
		this.lblJoueur2 = lblJoueur2;
	}

	public JCheckBox getCbJ1() {
		return cbJ1;
	}

	public void setCbJ1(JCheckBox cbJ1) {
		this.cbJ1 = cbJ1;
	}

	public JCheckBox getCbJ2() {
		return cbJ2;
	}

	public void setCbJ2(JCheckBox cbJ2) {
		this.cbJ2 = cbJ2;
	}

	public JLabel getLblJoueur1() {
		return lblJoueur1;
	}

	public void setLblJoueur1(JLabel lblJoueur1) {
		this.lblJoueur1 = lblJoueur1;
	}
}