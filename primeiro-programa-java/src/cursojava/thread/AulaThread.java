package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		//Thread executando em paralelo para envio do e-mail
		new Thread() {

				public void run() {
					//C�digo que ser� executado em processamento paralelo.
					for (int i = 0; i < 10; i ++) {
						
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Enviando e-mail!...");//Executar  est� rotina com controle de tempo
						
						//Fim do c�digo					
					}
				} 
		}.start();
		
		//Divis�o das threads__________________________________
		
		//Thread executando em paralelo para envio de nota fiscal
		new Thread() {

				public void run() {
					//C�digo que ser� executado em processamento paralelo.
					for (int i = 0; i < 10; i ++) {
						
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Enviando nota fiscal!...");//Executar  est� rotina com controle de tempo
						
						//Fim do c�digo					
					}
				} 
		}.start();
		
		
		//C�digo do sistema do usu�rio continua o fluxo de trabalho
		System.out.println("Fim do c�digo de teste");
		JOptionPane.showInternalMessageDialog(null, "Sistema continua executando para o usu�rio");
	}

}
