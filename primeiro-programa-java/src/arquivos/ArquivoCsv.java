package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoCsv {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Francisco Ramos");
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(54);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Richard Ramos");
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(15);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Emmanuel Ramos");
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(23);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		File arquivo = new File("C:\\Users\\Francisco\\git\\JDEVJavaAula01\\primeiro-programa-java\\src\\arquivos\\arquivo.csv");
		
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		//escrever_no_arquivo.write("Meu texto escrito no arquivo.");
		//escrever_no_arquivo.write("\n");
		//escrever_no_arquivo.write("Minha segunda linha.");
		//escrever_no_arquivo.write("\n");
		
		//for (int i = 1; i<=10; i ++) {
			//escrever_no_arquivo.write("Texto da minha linha " + i + " \n");
		//}
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
		}
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
