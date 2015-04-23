package de.dhbw.ravensburg.dame.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Spielstein extends JLabel {

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
		this.setPreferredSize(new Dimension(this.getIcon().getIconWidth(), this.getIcon().getIconHeight()));
		this.setText("Hallo");
		System.out.println("Spielstein added!");
		System.out.println(this);
	}
	
	
	
	private ImageIcon drawIcon(int farbe){
		
		Color color = null;
		
		
		try {
		
		if (farbe == WEISS){
//			color = Color.WHITE;
			
			return new ImageIcon(ImageIO.read(new File("textures" + System.getProperty("file.separator") + "spielstein_weiss.png")));
			
			
		}else if (farbe == SCHWARZ){
//			color = Color.GRAY;
			
			
			return new ImageIcon(ImageIO.read(new File("textures" + System.getProperty("file.separator") + "spielstein_schwarz.png")));
			
		}
		
		} catch (IOException e){
			e.printStackTrace();
		}
		
		BufferedImage img = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
		
//		Graphics2D g = (Graphics2D) img.getGraphics();
//		
//		g.setColor(color);
//		g.fillOval(0, 0, 50, 50);
//		g.dispose();
//		
		
		
		
		
		
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
