package poo;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TelefoneCelular celular = new TelefoneCelular();
		TelefoneFixo fixo = new TelefoneFixo();
		TelefonePublico publico = new TelefonePublico();
		
		Telefone telefone = null; // criando uma variável do tipo telefone, como é uma classe abstrata não pode ser instanciada como objeto
		
		int n = (int) (Math.random()*3.0);
		
		System.out.println("\nO número escolhido foi: " + n);
		
		switch (n) {
		case 0: telefone = celular;break;
		case 1: telefone = fixo;break;
		case 2 : telefone = publico;break;
		default: System.out.println("\nErro Inesperado...");
		}
		
		if (telefone != null) {
			
			telefone.disca("929345144");
			telefone.toca(2);
		}

	}

}
