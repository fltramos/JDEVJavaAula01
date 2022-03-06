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

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Nome");
	
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-Mail");
	
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Add Lista");
	private JButton jButton2 = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	public TelaTimeThread() {
		
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
		
		jPanel.add(mostraTempo, gridBagCosntraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagCosntraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagCosntraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagCosntraints.gridy ++;
		
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
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText());
				
				
				fila.add(filaThread);
				
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {			
				
			}
		});	
		
		fila.start();
		add(jPanel, BorderLayout.WEST);
		//Sempre no final
		setVisible(true);
	}

}
