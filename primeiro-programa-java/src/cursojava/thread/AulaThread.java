package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		//Thread executando em paralelo para envio do e-mail
		new Thread() {

				public void run() {
					//Código que será executado em processamento paralelo.
					for (int i = 0; i < 10; i ++) {
						
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Enviando e-mail!...");//Executar  está rotina com controle de tempo
						
						//Fim do código					
					}
				} 
		}.start();
		
		//Divisão das threads__________________________________
		
		//Thread executando em paralelo para envio de nota fiscal
		new Thread() {

				public void run() {
					//Código que será executado em processamento paralelo.
					for (int i = 0; i < 10; i ++) {
						
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Enviando nota fiscal!...");//Executar  está rotina com controle de tempo
						
						//Fim do código					
					}
				} 
		}.start();
		
		
		//Código do sistema do usuário continua o fluxo de trabalho
		System.out.println("Fim do código de teste");
		JOptionPane.showInternalMessageDialog(null, "Sistema continua executando para o usuário");
	}

}
