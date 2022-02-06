package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
		//Criando um Array dinamicamente
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter? ");
		
		
		//double notas[] = new double[4]; O array pode ser declarado assim ou:
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos ++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + pos);
			notas[pos] = Double.valueOf(valor);
		}
		
		/*notas[0] = 9.8;
		notas[1] = 8.4;
		notas[2] = 9.1;
		notas[3] = 7.6;*/
		
		for (int pos = 0; pos < notas.length; pos ++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]); //Começa da posição 0 mas imprime 1
		}
		
	}
}
