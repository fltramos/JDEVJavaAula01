package cursojava.executavel;

public class EstruturaRepeticaoBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int number = 0; number <= 10; number ++) {
			System.out.println(number);
			if (number == 7) {
				System.out.println("O número " + number + " foi encontrado!!");
				System.out.println("Parando a execução...");
				break;
			}
		}
	}

}
