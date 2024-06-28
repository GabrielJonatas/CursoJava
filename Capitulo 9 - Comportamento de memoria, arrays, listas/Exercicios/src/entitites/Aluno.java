package entitites;

public class Aluno {
	private String nome;
	private double notaSemestre1;
	private double notaSemestre2;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.notaSemestre1 = nota1;
		this.notaSemestre2 = nota2;
	}
	
	public String getNome() {
		return nome;
	}

	public double getNotaSemestre1() {
		return notaSemestre1;
	}

	public double getNotaSemestre2() {
		return notaSemestre2;
	}
}
