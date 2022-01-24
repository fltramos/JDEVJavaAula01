package cursojava.classes;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		/* new Aluno() é uma instância de objeto - Criação de Objeto */
		/* aluno1 é uma referência para o objeto Aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do Aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento do nome do Aluno?");
		String rg = JOptionPane.showInputDialog("RG do Aluno?");
		String cpf = JOptionPane.showInputDialog("CPF do Aluno?");
		String mae = JOptionPane.showInputDialog("Nome da mãe do Aluno?");
		String pai = JOptionPane.showInputDialog("Nome do pai do Aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola?");
		String matricula = JOptionPane.showInputDialog("Data da Matricula?");
		String serie = JOptionPane.showInputDialog("Serie do Aluno?");
		
		/*String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("Nota 4");*/
		
		
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
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina: 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
		}
		
		/*Disciplina disciplina_1 = new Disciplina();
		disciplina_1.setDisciplina("Banco de Dados");
		disciplina_1.setNota(90);
		
		/*aluno1.getDisciplinas().add(disciplina_1);*/
		
		/*Disciplina disciplina_2 = new Disciplina();
		disciplina_2.setDisciplina("Matemática");
		disciplina_2.setNota(90);
		
		/*aluno1.getDisciplinas().add(disciplina_2);*/
		
		/*Disciplina disciplina_3 = new Disciplina();
		disciplina_3.setDisciplina("Geográfia");
		disciplina_3.setNota(80);
		
		/*aluno1.getDisciplinas().add(disciplina_3);*/
		
		/*Disciplina disciplina_4 = new Disciplina();
		disciplina_4.setDisciplina("Java WEB");
		disciplina_4.setNota(80);
		
		/*aluno1.getDisciplinas().add(disciplina_4);*/
		
		/*aluno1.getDisciplinas().add(disciplina_1);
		aluno1.getDisciplinas().add(disciplina_2);
		aluno1.getDisciplinas().add(disciplina_3);
		aluno1.getDisciplinas().add(disciplina_4);
		
			
		/*aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));		
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));		
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));		
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);*/
		
		/*System.out.println("Nome é			  	: " + aluno1.getNome());
		System.out.println("Idade é			  	: " + aluno1.getIdade());
		System.out.println("Data de Nascimento	: " + aluno1.getDataNascimento());
		System.out.println("Registro Geral	  	: " + aluno1.getRegistroGeral());
		System.out.println("CPF				  	: " + aluno1.getNumeroCPF());
		System.out.println("Nome da Mãe		  	: " + aluno1.getNomeMae());
		System.out.println("Nome do Pai		  	: " + aluno1.getNomePai());
		System.out.println("Data de Matricula 	: " + aluno1.getDataMatricula());
		System.out.println("Séria			  	: " + aluno1.getSerieMatriculado());
		System.out.println("Média de notas: " + aluno1.getMediaNota());
		System.out.println("O Aluno foi aprovado? " + aluno1.getAlunoAprovado());*/
		
		System.out.println(aluno1);
		System.out.println("Média do Aluno= " + aluno1.getMediaNota());
		System.out.println("Resultado= " + aluno1.getAlunoAprovado2());		
		
		
		/*System.out.println(aluno1.toString());
		System.out.println("O Aluno foi " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));/*Usando operador ternário*/
		
		/*System.out.println("Situação do Aluno: " + aluno1.getAlunoAprovado2());
		
		Aluno aluno = new Aluno();
		System.out.println(aluno.toString());/*Descrição do objeto na memória*/
		
		/*Equals e Hashcode (Diferenciar e comparar objetos)*/
		
		/*Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNumeroCPF("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setNumeroCPF("1234");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}*/
	}

}
