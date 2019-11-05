package Machine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Text extends JFrame implements ActionListener{
	
	private JTextField saisie, copie;
	private JButton bouton;
	
	public Text()
	{
		setTitle ("Exemple de cases à cocher");
		setSize(400,100);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		
		saisie = new JTextField(20);
		contenu.add(saisie);
		saisie.addActionListener(this);
		
	}
	
	public void actionPerformed (ActionEvent e)
	{
		if(e.getSource()== bouton)
		{
			String texte = saisie.getText();
			copie.setText(texte);
		}
	}
	
	public static void main (String args[])
	{
		Text fen = new Text();
		fen.setVisible(true);
	}

}
