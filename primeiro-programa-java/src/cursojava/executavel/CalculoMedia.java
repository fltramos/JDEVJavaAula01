package cursojava.executavel;

import javax.swing.JOptionPane;

public class CalculoMedia {

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4: ");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if (media >= 50) {
			if (media >=70) {
				JOptionPane.showInternalMessageDialog(null, "Aluno est� aprovado com m�dia: " + media);
			}else {
				JOptionPane.showInternalMessageDialog(null, "Aluno em recupera��o com media: " + media);
			}
		}else {
			JOptionPane.showInternalMessageDialog(null, "Aluno est� reprovado com media: " + media);
		}
			
		
	}
}
