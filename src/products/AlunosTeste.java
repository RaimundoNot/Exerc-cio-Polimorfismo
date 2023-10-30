package products;

import entities.Alunos;

public class AlunosTeste {

	public static void main(String[] args) {
		Alunos al = new Alunos();
		
		al.nome = "Raimundo Mota";
		al.matricula = 3400;
		al.endereco = "Rua Alfinete, 400";
		al.telefone = 92930293;
		al.curso = "Analise de sistemas";
		al.nota1 = 7.0;
		al.nota2 = 2.2;
		al.nota3 = 8.7;
		
		al.calcMedia();
		
		System.out.println(al);

	}

}
