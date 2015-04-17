package de.dhbw.ravensburg.dame.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Spielstein extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7072613999378116111L;

	public static final int WEISS = 0;
	public static final int SCHWARZ = 1;

	/**
	 * Farbe des Steins.
	 * 
	 * Vergabe über die Enums WEISS und SCHWARZ
	 * 
	 */
	private int farbe;

	public Spielstein(int farbe){
		this.setFarbe(farbe);		
		this.setIcon(drawIcon(farbe));
		this.setBackground(null);
	}
	
	
	
	private ImageIcon drawIcon(int farbe){
		
		Color color = null;
		
		if (farbe == WEISS){
			color = Color.WHITE;
		}else if (farbe == SCHWARZ){
			color = Color.BLACK;
		}
		
		BufferedImage img = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
		
		Graphics2D g = (Graphics2D) img.getGraphics();
		
		g.setColor(color);
		g.fillOval(0, 0, 50, 50);
		g.dispose();
		
		return new ImageIcon(img);
				
	}
	
	public int getFarbe() {
		return farbe;
	}

	public void setFarbe(int farbe) {

		if (farbe == WEISS || farbe == SCHWARZ) {
			this.farbe = farbe;
		} else {
			throw new IllegalArgumentException(
					"Ein Spielstein kann nur schwarz oder weiß sein!");
		}
	}
	
	
	
	
	
	
	
	

}
