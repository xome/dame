package de.dhbw.ravensburg.dame.ui;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4887977417521151920L;

	Container pane = this.getContentPane();

	public MainFrame() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		pane.add(new Brett(), c);
		pane.add(new Spielfeld2(), c);

		setSize(pane.getPreferredSize().width + 10,
				pane.getPreferredSize().height + 30);
		this.setLocationRelativeTo(null);

	}

	public void initGui() {

		this.setVisible(true);

	}

	public static void main(String[] args) {
		new MainFrame().initGui();
	}

}
