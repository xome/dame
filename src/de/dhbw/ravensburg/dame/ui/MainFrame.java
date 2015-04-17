package de.dhbw.ravensburg.dame.ui;

import java.awt.Container;

import javax.swing.JFrame;



public class MainFrame extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4887977417521151920L;
	
	Container pane = this.getContentPane();
	
	
	public MainFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		
		
		
	}
	
	
	
	
	
	
	public void initGui(){
		
		pane.add(new Spielstein(Spielstein.WEISS));
		
		
		this.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new MainFrame().initGui();
	}
	

}
