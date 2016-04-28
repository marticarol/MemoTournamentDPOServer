package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionsServer extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JComboBox jcbHoraD;
	private JComboBox jcbHoraU;
	private JLabel jlSeparacio;
	private JComboBox jcbMinutsD;
	private JComboBox jcbMinutsU;
	private JComboBox jcbHoraDurD;
	private JComboBox jcbHoraDurU;
	private JLabel jlSeparacioDur;
	private JComboBox jcbMinutsDurD;
	private JComboBox jcbMinutsDurU;

	private JButton jbIniciar;

	private JButton jbGestUsuari;
	private JButton jbClassificacio;
	private JButton jbGraficUsuari;
	
	public OptionsServer() {
		
		///////////////////////////////Inicialitzem variables
		jcbHoraD = new JComboBox();
		jcbHoraU = new JComboBox();
		jlSeparacio = new JLabel(":");
		jcbMinutsD = new JComboBox();
		jcbMinutsU = new JComboBox();
		jcbHoraDurD = new JComboBox();
		jcbHoraDurU = new JComboBox();
		jlSeparacioDur = new JLabel(":");
		jcbMinutsDurD = new JComboBox();
		jcbMinutsDurU = new JComboBox();
		
		jbIniciar = new JButton("Iniciar Competici�");
		
		jbGestUsuari = new JButton ("Gesti� Usuaris");
		jbClassificacio = new JButton ("Classificaci�");
		jbGraficUsuari = new JButton ("Gr�fic Usuari");
		
		//Panell Superior on hi hauran Hora,Duraci� i bot� INICI COMPETICI�
		JPanel jpSuperior = new JPanel();
		jpSuperior.setBorder(BorderFactory.createTitledBorder("Nova Competici�"));
		jpSuperior.setLayout(new BorderLayout());
		
		//Part CENTER del Panell jpSuperior (Anir� - Hora i Duraci�)
		JPanel jpDuracio = new JPanel();
		jpDuracio.setLayout(new GridBagLayout());
		GridBagConstraints k = new GridBagConstraints();
		
		k.gridx = 0;
		k.gridy = 0;
		k.weightx = 1.0;
		k.weighty = 1.0;
		k.insets = new Insets(0,0,0,0);
		k.anchor = GridBagConstraints.LINE_END;
		jpDuracio.add(new JLabel ("Hora Inici:"), k);
		
		k.gridx = 1;
		k.gridy = 0;
		k.weightx = 1.0;
		k.weighty = 1.0;
		jpDuracio.add(jcbHoraD, k);
		
		k.gridx = 2;
		k.gridy = 0;
		k.weightx = 1.0;
		k.weighty = 1.0;
		jpDuracio.add(jcbHoraU, k);
		
		k.gridx = 3;
		k.gridy = 0;
		k.weightx = 1.0;
		k.weighty = 1.0;
		k.anchor = GridBagConstraints.CENTER;
		//jlSeparacio.setHorizontalAlignment(JLabel.CENTER);
		jpDuracio.add(jlSeparacio, k);
		
		k.gridx = 4;
		k.gridy = 0;
		k.weightx = 1.0;
		k.weighty = 1.0;
		k.anchor = GridBagConstraints.LINE_START;
		jpDuracio.add(jcbMinutsD, k);
		
		k.gridx = 5;
		k.gridy = 0;
		k.weightx = 1.0;
		k.weighty = 1.0;
		jpDuracio.add(jcbMinutsU, k);
		
		k.gridx = 6;
		k.gridy = 0;
		k.weightx = 1.0;
		k.weighty = 1.0;
		jpDuracio.add(new JLabel(""), k);
		
		k.gridx = 0;
		k.gridy = 1;
		k.weightx = 1.0;
		k.weighty = 1.0;
		k.anchor = GridBagConstraints.LINE_END;
		jpDuracio.add(new JLabel ("Duracio:"), k);
		
		k.gridx = 1;
		k.gridy = 1;
		k.weightx = 1.0;
		k.weighty = 1.0;
		jpDuracio.add(jcbHoraDurD, k);
		
		k.gridx = 2;
		k.gridy = 1;
		k.weightx = 1.0;
		k.weighty = 1.0;
		jpDuracio.add(jcbHoraDurU, k);
		
		k.gridx = 3;
		k.gridy = 1;
		k.weightx = 1.0;
		k.weighty = 1.0;
		k.anchor = GridBagConstraints.CENTER;
		//jlSeparacioDur.setHorizontalAlignment(JLabel.CENTER);
		jpDuracio.add(jlSeparacioDur, k);
		
		k.gridx = 4;
		k.gridy = 1;
		k.weightx = 1.0;
		k.weighty = 1.0;
		k.anchor = GridBagConstraints.LINE_START;
		jpDuracio.add(jcbMinutsDurD, k);
		
		k.gridx = 5;
		k.gridy = 1;
		k.weightx = 1.0;
		k.weighty = 1.0;
		jpDuracio.add(jcbMinutsDurU, k);
		
		k.gridx = 6;
		k.gridy = 0;
		k.weightx = 0.5;
		k.weighty = 1.0;
		jpDuracio.add(new JLabel(""));
		
		jpSuperior.add(jpDuracio, BorderLayout.CENTER);
		
		//////////////////////////////////Part SOUTH del Panell jpSuperior on anir� bot� INICI COMPETICI�
		JPanel jpIniciarAux = new JPanel();
		jpIniciarAux.setLayout(new GridLayout(1,3));
		jpIniciarAux.add(new JLabel (""));
		jpIniciarAux.add(jbIniciar);
		jpIniciarAux.add(new JLabel (""));
		
		jpSuperior.add(jpIniciarAux, BorderLayout.SOUTH);
		
		/////////////////////////////////Inclusi� de un GridLayout(7,3) al CENTER del BorderLayout jpInferior
		JPanel jpInferior = new JPanel();
		jpInferior.setLayout(new BorderLayout());
		
		JPanel jpAuxInferior = new JPanel();
		jpAuxInferior.setLayout(new GridLayout(7,3));
		
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(new JLabel(""));
		
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(jbGestUsuari);
		jpAuxInferior.add(new JLabel(""));
		
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(new JLabel(""));
		
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(jbClassificacio);
		jpAuxInferior.add(new JLabel(""));
		
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(new JLabel(""));
		
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(jbGraficUsuari);
		jpAuxInferior.add(new JLabel(""));
		
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(new JLabel(""));
		jpAuxInferior.add(new JLabel(""));
	
	
		jpInferior.add(jpAuxInferior, BorderLayout.CENTER);
		
		//////////////////////////////////////Creaci� del panell general jpVServer on incluirem jpSuperior i jpInferior
		JPanel jpVServer = new JPanel();
		jpVServer.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		//c.gridwidth = 1;
		//c.gridheight = 1;
		c.weightx = 1.0;
		c.weighty = 0.5;
		c.fill = GridBagConstraints.BOTH;
		jpVServer.add(jpSuperior, c);
		
		c.gridx = 0;
		c.gridy = 1;
		//c.gridwidth = 1;
		//c.gridheight = 2;
		c.weightx = 1.0;
		c.weighty = 2.0;
		c.fill = GridBagConstraints.BOTH;
		jpVServer.add(jpInferior, c);
		
		this.getContentPane().add(jpVServer);
		this.setSize(650, 450);
		this.setTitle("Menu Server");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		pack();
		this.setLocationRelativeTo(null);
		
		
	}



}
