package entitites;

public class Pessoa {
	private String nome;
	private char genero;
	private	int idade;
	private double altura = 0;
	
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa (char genero, double altura) {
		this.genero = genero;
		this.altura = altura;
	}	
	
	public Pessoa (String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	public char getGenero() {
		return genero;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
}
