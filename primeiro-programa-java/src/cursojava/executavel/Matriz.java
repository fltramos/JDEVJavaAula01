package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;
			
		
		for (int poslinha = 0; poslinha < notas.length; poslinha ++) {//Parcorre as linhas.
			
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna ++ ) {//Percorre as colunas.
				System.out.println("Valor da matriz: " + notas[poslinha][poscoluna]);
			}
		}

	}

}
