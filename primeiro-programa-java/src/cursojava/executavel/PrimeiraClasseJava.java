package cursojava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		System.out.println("Operadores L�gicos");

		/* Operadores L�gocos com IF e Else */

		int nota1 = 90;
		int nota2 = 80;
		int nota3 = 70;
		int nota4 = 5;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Condi��es l�gicas com IF e Else */

		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recupera��o: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}

		/* Operadores tern�rios para micro v�lida��es em uma linha- neste caso o IF � representado pela ? e o Else por : */

		String saidaResultado = media >= 70 ? "Aluno Aprovado!" : (media >= 40 && media <= 69) ? "Aluno em recupera��o" : "Aluno Reprovado!?";
		System.out.println(saidaResultado);

	}
}
