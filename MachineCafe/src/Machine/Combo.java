package Machine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Combo extends JFrame implements ActionListener, ItemListener{
	
	 private JComboBox combo;
	 private String[] couleurs = {"rouge", "bleu" , "gris", "jaune" , "vert" , "noir"};
	 
	 public Combo()
	 {
		 setTitle("Exemple de Combo");
		 setSize(400,200);
		 Container contenu = getContentPane();
		 contenu.setLayout(new FlowLayout());
		 
		 combo = new JComboBox(couleurs);
		 contenu.add(combo);
		 combo.addItemListener(this);
	 }
	 
	 public void itemStateChanged(ItemEvent e) {
		Object valeur = combo.getSelectedItem();
		System.out.println((String)valeur);
	 }

	 public void actionPerformed(ActionEvent e) {
		Object valeur = combo.getSelectedItem();
		System.out.println((String)valeur);
	 }

	 public static void main (String args[])
	 {
		 Combo fen = new Combo();
		 fen.setVisible(true);
	 }
}
