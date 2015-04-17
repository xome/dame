package de.dhbw.ravensburg.dame.ui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridBagConstraints;

import javax.swing.JPanel;

import de.dhbw.ravensburg.dame.modell.SpielfeldDaten;

public class Spielfeld2 extends JPanel {
	
	
	private SpielfeldDaten feld;	
	public Spielfeld2(){
		
		feld = new SpielfeldDaten();
		
		
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		GridBagConstraints c = new GridBagConstraints();
		
		
		for (Component comp : this.getComponents()){
			if (comp instanceof Spielstein){
				this.remove(comp);
			}	
		}
		
		
		for (int y = 0; y < 8; y++){
			for (int x = 0; x < 8; x++){
				if (feld.getCell(x, y) == SpielfeldDaten.WEISS){
					c.gridx = x;
					c.gridy = y;
					this.add(new Spielstein(Spielstein.WEISS), c);
				} else if (feld.getCell(x, y) == SpielfeldDaten.SCHWARZ){
					c.gridx = x;
					c.gridy = y;
					this.add(new Spielstein(Spielstein.SCHWARZ), c);
				}
			}
		}
		
		
		revalidate();
	}
	

	
	
	

}
