package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila rodando...");
		

		while (true) {
						
			synchronized (pilha_fila) {// Bloqueia o acesso a lista por outros processos
			Iterator iteracao = pilha_fila.iterator();
				while (iteracao.hasNext()) {// Enquanto houver dados para processar

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

					/*
					 * Aqui será construida a rotina necessária como enviar milhares de emails
					 * 
					 * Notas fiscais
					 * 
					 */

					System.out.println("----------------------------------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());

					iteracao.remove();

					try {
						Thread.sleep(100);// Dar um tempo para a descarga de memória
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(1000);// Processou toda a lista e da tempo para alimpeza da memória
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		

	}

}
