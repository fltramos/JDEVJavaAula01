package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread2 extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			while (true) {//Este laço vai ficar sempre rodando
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		}
	};
	
private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			while (true) {//Este laço vai ficar sempre rodando
				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	public TelaTimeThread2() {
		
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(250, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		//Primeira parte concluida
		
		GridBagConstraints gridBagCosntraints = new GridBagConstraints();
		
		gridBagCosntraints.gridx = 0;
		gridBagCosntraints.gridy = 0;
		gridBagCosntraints.gridwidth = 2;
		gridBagCosntraints.insets = new Insets(5, 10, 5, 5);
		gridBagCosntraints.anchor = gridBagCosntraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagCosntraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagCosntraints.gridy ++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagCosntraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagCosntraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagCosntraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagCosntraints.gridy ++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagCosntraints);
		
		gridBagCosntraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagCosntraints.gridy ++;
		jPanel.add(jButton, gridBagCosntraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagCosntraints.gridx ++;
		jPanel.add(jButton2, gridBagCosntraints);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {// Executa o clique no botão
				
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
				
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time.stop();
				thread2Time.stop();
				
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});
		
		jButton2.setEnabled(false);
		
		add(jPanel, BorderLayout.WEST);
		//Sempre no final
		setVisible(true);
	}

}
