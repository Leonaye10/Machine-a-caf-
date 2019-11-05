package Machine;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.*;
import java.util.List;

public class Liste extends JFrame implements ListSelectionListener{
	 private JList liste;
	 private String[] couleurs = {"rouge", "bleu" , "gris", "jaune" , "vert" , "noir"};
	 
	 public Liste()
	 {
		 
		setTitle ("Exemple de Liste");
		setSize(400,200);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		 
		 liste = new JList(couleurs);
		 contenu.add(liste);
		 liste.addListSelectionListener(this);	 
	 }
	 
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== liste)
		{
			System.out.println("Liste");
			Object valeur = liste.getSelectedValue();
			System.out.println((String)valeur);
		}
	}
	 
	 public static void main (String args[])
	 {
		 Liste fen = new Liste();
		 fen.setVisible(true);
	 }
}
