package cursojava.executavel;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		System.out.println("Operadores L�gicos");

		/* operadores l�gicos: == <= >= != > <*/

		int nota1 = 90;
		int nota2 = 100;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (nota1 == nota2) {
			System.out.println("As notas s�o iguais: " + nota1 + " & " + nota2);
		}else {
			System.out.println("As notas s�o diferentes: " + nota1 + " & " + nota2);
		}
	}
}
