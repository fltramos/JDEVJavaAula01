package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Francisco");
		aluno.setNomeEscola("JDev");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");		
		double[] notas = {8.8, 9.7, 7.6, 6.8};
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Python");		
		double[] notas2 = {9.8, 8.9, 9.9, 9.8};		
		disciplina2.setNota(notas2);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (int pos = 0; pos < arrayAlunos.length; pos ++) {
			System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());
			
			for (Disciplina d:arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é: " + d.getDisciplina());
				
				for (int posNota = 0; posNota < d.getNota().length; posNota ++) {
					System.out.println("A nota " + (posNota+1) + " é: " + d.getNota()[posNota]);
				}
				System.out.println("A média final foi: " + d.getMediaNotas());
			}

				
		}
		
		/*System.out.println("Nome do Aluno: " + aluno.getNome() + ", inscrito no curso: " + aluno.getNomeEscola());
		
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("-------------------- Disciplinas do Aluno --------------------");
			System.out.println("Disciplina: " + d.getDisciplina());
			System.out.println("As notas da disciplina " + d.getDisciplina() + " são: ");
			
			double notaMax = 0.0;
			double notaMin = 0.0;
			
			for (int pos = 0; pos < d.getNota().length; pos ++) {
				System.out.println("Nota " + (pos+1) + " é igual: " + d.getNota()[pos]);
				
				if (pos == 0) {
					notaMax = d.getNota()[pos];
				}else
					if (d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				
				if (pos == 0) {
					notaMin = d.getNota()[pos];
				}else
					if (d.getNota()[pos] < notaMin) {
						notaMin = d.getNota()[pos];
					}
											
			}
			System.out.println("A média final foi: " + d.getMediaNotas());
			System.out.println("A maior nota da Disciplina " + d.getDisciplina() + " foi :" + notaMax);
			System.out.println("A menor nota da Disciplina " + d.getDisciplina() + " foi :" + notaMin);
		}*/
		
	}
		
		//Criando um Array dinamicamente
		
		/*String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter? ");
		
		
		//double notas[] = new double[4]; O array pode ser declarado assim ou:
		double[] notas = new double[Integer.parseInt(posicoes)];
		String[] dados = {"Francisco", "Casa", "Telefone"};//Declarando e criando o array.
		
		for (int pos = 0; pos < notas.length; pos ++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + pos);
			notas[pos] = Double.valueOf(valor);
		}
		
		/*notas[0] = 9.8;
		notas[1] = 8.4;
		notas[2] = 9.1;
		notas[3] = 7.6;*/
		
		/*for (int pos = 0; pos < notas.length; pos ++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]); //Começa da posição 0 mas imprime 1
		}
		
	}*/
}
