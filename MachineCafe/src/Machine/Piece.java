package Machine;

public class Piece {
	public int valeur;
	
	public Piece()
	{
		
	}
	
	public int getValeur()
	{
		return valeur;
	}
	
	public void setValeur(int n)
	{
		this.valeur = n;
	}
	
	public void verifierPiece(int n)
	{
		if(n==5)
			this.valeur +=n;
		else if(n==10)
			this.valeur +=n;
		else if(n==20)
			this.valeur +=n;
		else
			System.out.println("La machine n'accepte que des pieces de 5, 10 et 20 Euro");
	}
}
