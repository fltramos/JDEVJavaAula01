package cursojava.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
//import cursojava.interfaces.PermitirAcesso;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha: ");
		
		/*Secretario secretario = new Secretario();
		secretario.setLogin(login);
		secretario.setSenha(senha);*/
		
		//FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
		
		//PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		//if (permitirAcesso.autenticar())
		//if (autenticacao.autenticarCursoJava(permitirAcesso))
		//if (new FuncaoAutenticacao(permitirAcesso).autenticarCursoJava(permitirAcesso))

		if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			/*
			 * List<Aluno> alunosAprovados = new ArrayList<Aluno>(); List<Aluno>
			 * alunosReprovados = new ArrayList<Aluno>(); List<Aluno> alunosRecuperacao =
			 * new ArrayList<Aluno>();
			 */

			for (int qtd = 1; qtd <= 5; qtd++) {

				/* new Aluno() é uma instância de objeto - Criação de Objeto */
				/* aluno1 é uma referência para o objeto Aluno */

				String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qtd + "?");
				/*
				 * String idade = JOptionPane.showInputDialog("Qual a idade do Aluno?"); String
				 * dataNascimento =
				 * JOptionPane.showInputDialog("Data de Nascimento do nome do Aluno?"); String
				 * rg = JOptionPane.showInputDialog("RG do Aluno?"); String cpf =
				 * JOptionPane.showInputDialog("CPF do Aluno?"); String mae =
				 * JOptionPane.showInputDialog("Nome da mãe do Aluno?"); String pai =
				 * JOptionPane.showInputDialog("Nome do pai do Aluno?"); String nomeEscola =
				 * JOptionPane.showInputDialog("Nome da Escola?"); String matricula =
				 * JOptionPane.showInputDialog("Data da Matricula?"); String serie =
				 * JOptionPane.showInputDialog("Serie do Aluno?");
				 */

				/*
				 * String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?"); String
				 * nota1 = JOptionPane.showInputDialog("Nota 1");
				 * 
				 * String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?"); String
				 * nota2 = JOptionPane.showInputDialog("Nota 2");
				 * 
				 * String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?"); String
				 * nota3 = JOptionPane.showInputDialog("Nota 3");
				 * 
				 * String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?"); String
				 * nota4 = JOptionPane.showInputDialog("Nota 4");
				 */

				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);
				/*
				 * aluno1.setIdade(Integer.valueOf(idade));
				 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
				 * aluno1.setNumeroCPF(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
				 * aluno1.setNomeEscola(nomeEscola); aluno1.setDataMatricula(matricula);
				 * aluno1.setSerieMatriculado(serie);
				 */

				for (int pos = 1; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);
				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

				if (escolha == 0) {

					int continuarRemover = 0;
					int posicao = 1;

					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina: 1, 2, 3 ou 4?");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					}
				}

				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPARACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
					// alunosAprovados.add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPARACAO)) {
					maps.get(StatusAluno.RECUPARACAO).add(aluno);
					// alunosRecuperacao.add(aluno);

				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
					// alunosReprovados.add(aluno);
				}
			}

			System.out.println("----------------------------Lista dos Aprovados---------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno= " + aluno.getNome() + " Resultado= " + aluno.getAlunoAprovado2() + " Média= "
						+ aluno.getMediaNota());

			}

			System.out.println("----------------------------Lista dos em Recuperação---------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPARACAO)) {
				System.out.println("Aluno= " + aluno.getNome() + " Resultado= " + aluno.getAlunoAprovado2() + " Média= "
						+ aluno.getMediaNota());

			}

			System.out.println("----------------------------Lista dos Reprovados---------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Aluno= " + aluno.getNome() + " Resultado= " + aluno.getAlunoAprovado2() + " Média= "
						+ aluno.getMediaNota());
			}

		}else {
			JOptionPane.showConfirmDialog(null, "Acesso não permitido!!!");
		}
	}

}
