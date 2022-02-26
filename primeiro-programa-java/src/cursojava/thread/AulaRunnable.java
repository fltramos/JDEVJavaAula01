package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaRunnable {

	public static void main(String[] args) {
		
		//Thread executando em paralelo para envio do e-mail
			Thread threadEmail = new Thread(thread1);
			threadEmail.start();
				
				//Divisão das threads__________________________________
				
				//Thread executando em paralelo para envio de nota fiscal
			
			Thread threadNota = new Thread(thread2);
			threadNota.start();				
				
				//Código do sistema do usuário continua o fluxo de trabalho
				System.out.println("Fim do código de teste");
				JOptionPane.showInternalMessageDialog(null, "Sistema continua executando para o usuário");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
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
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
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
	};

}
