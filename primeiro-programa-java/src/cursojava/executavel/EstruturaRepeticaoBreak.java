package cursojava.executavel;

public class EstruturaRepeticaoBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int number = 0; number <= 10; number ++) {
			System.out.println(number);
			if (number == 7) {
				System.out.println("O n�mero " + number + " foi encontrado!!");
				System.out.println("Parando a execu��o...");
				break;
			}
		}
	}

}
