package cursojava.classes;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		/* new Aluno() é uma instância de objeto - Criação de Objeto */
		/* aluno1 é uma referência para o objeto Aluno */

		Aluno aluno1 = new Aluno();
		aluno1.setNome("João da Silva");
		System.out.println("Nome é: " + aluno1.getNome());

		Aluno aluno2 = new Aluno();

		Aluno aluno3 = new Aluno();

		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("João", 50);
	}

}
