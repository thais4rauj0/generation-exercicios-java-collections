package poo;

public abstract class Telefone {

	private String tipo;
		
	abstract public void disca(String numero);
	abstract public void toca(int numToques);
	
	//Criando construtor
	public Telefone(String tipo) {
		super();
		this.tipo = tipo;
	}
	//Getters and Setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
