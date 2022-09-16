package poo;

public interface Figuras {
	
	//Interface 
	
	//Na interface não precisamos implementar nada
	
	public String nomeInterface =  "Figuras";
	
	//Métodos da Interface
	abstract public String getNome();
	abstract public void setNome(String nome);
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	
	

}
