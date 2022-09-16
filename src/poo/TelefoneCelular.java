package poo;

public class TelefoneCelular extends Telefone {
	
	public TelefoneCelular() {
		super("Celular");
		
	}
@Override
	
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("Triiim...Triiiim");
			break;
		case 2:
			System.out.println("Plinnn.plinnn");
			break;
		default:
			System.out.println("Truuuum...truummm");
		}
	}
	
@Override
	public void disca(String numero) {
		System.out.println("\n O número é um celular");
	}
	

}
