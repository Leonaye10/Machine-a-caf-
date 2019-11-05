package Machine;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;

public class Lemain extends JFrame {

	private JPanel contentPane;
	
	public int nbre;
	public int val5 = 0;
	public int val10 = 0;
	public int val20 = 0;
	public int monnaie = 0;
	public String affiche = "";
	public String resultat = "";
	Piece vPiece = new Piece();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lemain frame = new Lemain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lemain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(299, 34, 208, 283);
		panel.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(289, 116, 258, 265);
		
		JTextPane txtResultat = new JTextPane();
		txtResultat.setBounds(10, 11, 188, 159);
		
		JTextPane txtAffiche = new JTextPane();
		txtAffiche.setBounds(10, 34, 266, 169);
		
		
		
		txtAffiche.setText("Le prix d'un cafe est de 45 Euro\r\nIntroduisez vos piece\n");
		
		JButton btn5Euro = new JButton("5 Euro");
		JButton btn10Euro = new JButton("10 Euro");
		JButton btn20Euro = new JButton("20 Euro");
		
		btn5Euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vPiece.valeur += 5;
				val5++;
				//if(val5>0)
					resultat += "Vous avez introduit " + val5 + " piece de 5 Euro\n";
					txtResultat.setText(resultat);
					
					if(vPiece.valeur>=45)
					{
						monnaie = vPiece.valeur-45;
						affiche += "Votre cafe est pret\n"
								+"Vous avez introduit " + vPiece.valeur +"Euro\n"
								+"Votre monnaie est de " + monnaie + " Euro\n";
						txtAffiche.setText(affiche);
						btn5Euro.setVisible(false);
						btn10Euro.setVisible(false);
						btn20Euro.setVisible(false);
						
					}
			}
		});
		btn5Euro.setBounds(10, 181, 188, 23);
		panel.add(btn5Euro);
		
		
		btn10Euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vPiece.valeur += 10;
				val10++;
				//if(val10>0)
					resultat += "Vous avez introduit " + val10 + " piece de 10 Euro\n";
					txtResultat.setText(resultat);
					
					if(vPiece.valeur>=45)
					{
						monnaie = vPiece.valeur-45;
						affiche += "Votre cafe est pret\n"
								+"Vous avez introduit " + vPiece.valeur +"Euro\n"
								+"Votre monnaie est de " + monnaie + " Euro\n";
						txtAffiche.setText(affiche);
						btn5Euro.setVisible(false);
						btn10Euro.setVisible(false);
						btn20Euro.setVisible(false);
						
					}
			}
		});
		btn10Euro.setBounds(10, 215, 188, 23);
		panel.add(btn10Euro);
		
		
		btn20Euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vPiece.valeur += 20;
				val20++;
				//if(val20>0)
					resultat += "Vous avez introduit " + val20 + " piece de 20 Euro\n";
					txtResultat.setText(resultat);
					
					if(vPiece.valeur>=45)
					{
						monnaie = vPiece.valeur-45;
						affiche += "Votre cafe est pret\n"
								+"Vous avez introduit " + vPiece.valeur +"Euro\n"
								+"Votre monnaie est de " + monnaie + " Euro\n";
						txtAffiche.setText(affiche);
						btn5Euro.setVisible(false);
						btn10Euro.setVisible(false);
						btn20Euro.setVisible(false);
						
					}
			}
		});
		btn20Euro.setBounds(10, 249, 188, 23);
		panel.add(btn20Euro);
					
		
		contentPane.add(panel);
		
		panel.add(txtResultat);
		
		contentPane.add(txtAffiche);
		
	}
}
