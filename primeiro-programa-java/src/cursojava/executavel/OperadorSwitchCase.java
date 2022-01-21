package cursojava.executavel;

public class OperadorSwitchCase {

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 100;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/* operador Switch & Case - OBS: para este tipo de calculo o switch não é recomendável!!*/
		
		switch (media) {
		case 70:
			System.out.println("Aluno Aptovado!" + media);
			break;

		default: System.out.println("Outro valor " + media);
			break;
		}
	}
}
