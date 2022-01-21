package cursojava.executavel;

public class EstruturaWhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;

		/* No While primeiro é feita a verificação e depois o código executa. */

		while (numero <= 10) {
			System.out.println("O número atual é: " + numero);
			numero++;
		}

		/* NO Do primeiro executa e depois testa. */

		int number2 = 0;
		do {
			System.out.println("O número atual é: " + number2);
			number2++;
		} while (number2 <= 60);
	}

}
