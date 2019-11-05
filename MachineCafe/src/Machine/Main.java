package Machine;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Le prix d'un cafe est de 45 Euro\n"
				+ "Introduisez vos pieces\n"
				+ "La machine n'accepte que des pieces de 5, 10 et 20 Euro\n");
		Piece vPiece = new Piece();
		int nbre,val5=0,val10=0,val20=0,monnaie;
		do{
			nbre = sc.nextInt();	
			vPiece.verifierPiece(nbre);
			if(nbre == 5)
			{
				val5++;
			}
			else if (nbre == 10)
			{
				val10++;
			}
			else if (nbre == 20)
			{
				val20++;
			}
			if(val5>0)
				System.out.println("Vous avez introduit " + val5 + " piece de 5 Euro\n");
			if(val10>0)
				System.out.println("Vous avez introduit " + val10 + " piece de 10 Euro\n");
			if(val20>0)
				System.out.println("Vous avez introduit " + val20 + " piece de 20 Euro\n");
			if(vPiece.valeur>0)
				System.out.println("Vous avez intoduit au total  " + vPiece.valeur + " Euro\n");
		}while(vPiece.valeur<=45);
		if(vPiece.valeur>45)
		{
			monnaie = vPiece.valeur-45;
			System.out.println("Votre cafe est pret et votre monnaie est de " + monnaie + " Euro\n");
		}
		else{
			System.out.println("Votre cafe est pret\n");
		}
		
	}

}
