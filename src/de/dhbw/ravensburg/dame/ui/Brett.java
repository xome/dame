package de.dhbw.ravensburg.dame.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import de.dhbw.ravensburg.dame.modell.SpielfeldDaten;

public class Brett extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1567185804146865289L;
	
	private static final int HELLE_ZELLE = 0;
	private static final int DUNKLE_ZELLE = 1;
	
	public Brett(){
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				c.gridx = x;
				c.gridy = y;

				JLabel lbl = new JLabel();
				lbl.setIcon(drawCell((x + y) % 2));
				this.add(lbl, c);
				

			}
		}

		
		
		
		
	}
	
	
	private ImageIcon drawCell(int farbe) {

		File file = null;

		if (farbe == HELLE_ZELLE) {
			file = new File("textures" + System.getProperty("file.separator")
					+ "helles_holz.jpg");
		} else if (farbe == DUNKLE_ZELLE) {
			file = new File("textures" + System.getProperty("file.separator")
					+ "dunkles_holz.jpg");
		} else {
			throw new IllegalArgumentException(
					"Spielfeld muss die Farbe HELL oder DUNKEL haben! Dein Argument: "
							+ farbe);
		}

		BufferedImage img = null;

		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			System.err.println("Die Texturdatei " + file.getAbsolutePath()
					+ " fehlt oder du hast keine Zugriffsrechte!");
			return null;
		}

		return new ImageIcon(img);
	}

	
	
	

}
