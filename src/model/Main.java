package model;

import javax.swing.SwingUtilities;
import view.OptionsServer;

public class Main{
		
	public static void main(String[] args) {
		// Aquesta �s la forma recomanda d'iniciar una GUI
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Creem la vista
				OptionsServer vista = new OptionsServer();
				// La fem visible
				vista.setVisible(true);
			}
		});
	}
}
