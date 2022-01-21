package cursojava.executavel;

public class OperadoresLogicosAninhados {

	public static void main(String[] args) {
		System.out.println("Operadores Lógicos");

		/* Operações lógicas aninhadas (nested) - São operações dentro de operações*/

		int nota1 = 90;
		int nota2 = 100;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno está aprvado direto! Parabéns!!! " + media);
				}else {
					System.out.println("Aluno está aprvado direto! " + media);
				}
			}else {
				System.out.println("Aluno está em recuperação! " + media);
			}
		}else {
			System.out.println("Aluno Reprovado!? " + media);
		}

	}
}
