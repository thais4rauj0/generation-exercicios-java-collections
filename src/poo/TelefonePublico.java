package poo;

public class TelefonePublico extends Telefone {

		public TelefonePublico() {
			super("Público");
		}
	
		public void disca(String numero) {
			if(numero.charAt(0)=='9' || numero.charAt(0)=='8') {
				System.out.println("\nEste telefone não liga para celular!");
			}else {
				System.out.println("\nDiscando: " + numero);
			}
		}
		
		public void toca(int numToques) {
			
			for(int i=0;i<numToques;i++) {
				System.out.println("\nPiririnpinprin...");
			}
		}

}
