package cursojava.classes;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		/* new Aluno() � uma inst�ncia de objeto - Cria��o de Objeto */
		/* aluno1 � uma refer�ncia para o objeto Aluno */

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jo�o da Silva");
		System.out.println("Nome �: " + aluno1.getNome());

		Aluno aluno2 = new Aluno();

		Aluno aluno3 = new Aluno();

		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("Jo�o", 50);
	}

}
