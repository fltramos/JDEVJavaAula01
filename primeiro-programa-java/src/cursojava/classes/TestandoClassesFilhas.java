package cursojava.classes;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.setNome("Francisco");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setNome("João");
		diretor.setRegistroGeral("12345678");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Luiz");
		secretario.setExperiencia("Administração");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println("--------------------------------------------------------");
		System.out.println(diretor);
		System.out.println("--------------------------------------------------------");
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.getIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade() + " - " + diretor.getIdade());
		System.out.println(secretario.pessoaMaiorIdade() + " - " + secretario.getIdade());
		
		System.out.println(aluno.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é: " + pessoa.getNome() + " e o seu salário é de: " + pessoa.salario());
	}

}
