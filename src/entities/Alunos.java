package entities;

public class Alunos {
	public int matricula;
	public String nome;
	public String endereco;
	public int telefone;
	public String curso;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	public String status;
	
	public void calcMedia() {
		media = nota1 + nota2 + nota3 / 3.0;
		if(media > 6.0) {
			status = "APROVADO";
		} else if (media > 4.0 && media < 5.9){
			status = "EM RECUPERAÇÃO";
		} else {
			status = "REPROVADO";
		}
	}

	@Override
	public String toString() {
		return "Matricula: " + matricula + String.format("%n") +
				"Nome: " + nome + String.format("%n") +
				"Endereco: " + endereco + String.format("%n") +
				"Telefone: " + telefone + String.format("%n") +
				"Curso: " + curso + String.format("%n") +
				String.format("Media: %.2f%n", media) +
				"Status: " + status;
	}
	
}

