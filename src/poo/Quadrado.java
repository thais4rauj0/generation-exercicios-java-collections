package poo;

public class Quadrado extends BaseFigura implements Figuras{ //Múltipla Herança

	// A subclasse Quadrado herda BaseFigura e implementa a interface Figuras

	Quadrado(double lado, String nome){
		super(lado,lado,nome);
		
		nomeClasse = "Quadrado";
	}

	@Override
	public double getDiagonal() {
		// TODO Auto-generated method stub
		return Math.sqrt(2)*lado1;
	}
	
	
}
