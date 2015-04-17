package de.dhbw.ravensburg.dame.ui;

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
