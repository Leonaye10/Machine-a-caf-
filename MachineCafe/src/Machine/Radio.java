package Machine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Radio extends JFrame implements ActionListener{
	
	private JRadioButton radio1, radio2, radio3;
	private JButton etat;
	
	public Radio()
	{
		setTitle ("Exemple de cases à cocher");
		setSize(400,100);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		ButtonGroup groupe = new ButtonGroup();
		
		radio1 = new JRadioButton("Radio 1 ");
		contenu.add(radio1);
		groupe.add(radio1);
		radio1.addActionListener(this);
		
		radio2 = new JRadioButton("Radio 3 ");
		contenu.add(radio2);
		groupe.add(radio2);
		radio2.addActionListener(this);
		
		radio3 = new JRadioButton("Radio 3 ");
		contenu.add(radio3);
		groupe.add(radio3);
		radio3.addActionListener(this);
		
		etat = new JButton("ETAT");
		contenu.add(etat);
		etat.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent ev)
	{
		Object source = ev.getSource();
		if(source == radio1) System.out.println("action Radio 1");
		if(source == radio2) System.out.println("action Radio 2");
		if(source == radio3) System.out.println("action Radio 3");
		if(source == etat) System.out.println("Etat Radio : " + radio1.isSelected() + " " + radio2.isSelected() + " " + radio3.isSelected());
	}
	
	public static void main(String args[])
	{
		Radio fen = new Radio();
		fen.setVisible(true);
	}
}
