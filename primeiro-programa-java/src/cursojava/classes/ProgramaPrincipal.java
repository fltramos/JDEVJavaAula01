package cursojava.classes;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		/* new Aluno() � uma inst�ncia de objeto - Cria��o de Objeto */
		/* aluno1 � uma refer�ncia para o objeto Aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do Aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento do nome do Aluno?");
		String rg = JOptionPane.showInputDialog("RG do Aluno?");
		String cpf = JOptionPane.showInputDialog("CPF do Aluno?");
		String mae = JOptionPane.showInputDialog("Nome da m�e do Aluno?");
		String pai = JOptionPane.showInputDialog("Nome do pai do Aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola?");
		String matricula = JOptionPane.showInputDialog("Data da Matricula?");
		String serie = JOptionPane.showInputDialog("Serie do Aluno?");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCPF(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
			
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));		
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));		
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));		
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		/*System.out.println("Nome �			  	: " + aluno1.getNome());
		System.out.println("Idade �			  	: " + aluno1.getIdade());
		System.out.println("Data de Nascimento	: " + aluno1.getDataNascimento());
		System.out.println("Registro Geral	  	: " + aluno1.getRegistroGeral());
		System.out.println("CPF				  	: " + aluno1.getNumeroCPF());
		System.out.println("Nome da M�e		  	: " + aluno1.getNomeMae());
		System.out.println("Nome do Pai		  	: " + aluno1.getNomePai());
		System.out.println("Data de Matricula 	: " + aluno1.getDataMatricula());
		System.out.println("S�ria			  	: " + aluno1.getSerieMatriculado());
		System.out.println("M�dia de notas: " + aluno1.getMediaNota());
		System.out.println("O Aluno foi aprovado? " + aluno1.getAlunoAprovado());*/
		
		
		System.out.println(aluno1.toString());
		System.out.println("O Aluno foi " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));/*Usando operador tern�rio*/
		
		System.out.println("Situa��o do Aluno: " + aluno1.getAlunoAprovado2());
		
		Aluno aluno = new Aluno();
		System.out.println(aluno.toString());/*Descri��o do objeto na mem�ria*/
		
		/*Equals e Hashcode (Diferenciar e comparar objetos)*/
		
		/*Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNumeroCPF("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setNumeroCPF("1234");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos s�o iguais");
		}else {
			System.out.println("Alunos n�o s�o iguais");
		}*/
	}

}
