package cursojava.executavel;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String quantidade = JOptionPane.showInputDialog("Informe a quantidade: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");

		double quant = Double.parseDouble(quantidade);
		double quantPessoas = Double.parseDouble(pessoas);
		
		int divisao = (int) (quant / quantPessoas);
		double resto = (quant / quantPessoas);
		
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Quantidade de Pessoas: " + pessoas);
		
		System.out.println("Resultado da divisão - quantidade / pessoa: " + divisao);
		System.out.println("Resto da divisão: " + resto);
		
		
	}

}
