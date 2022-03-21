package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Francisco\\git\\JDEVJavaAula01\\primeiro-programa-java\\src\\arquivos\\arquivo_excel.xls");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
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
		
		try (HSSFWorkbook hssfworkbook = new HSSFWorkbook()) {
			HSSFSheet linhasPessoa = hssfworkbook.createSheet("Planilha de pessoas JDev Treinamento");//Criar a planilha
			
			int numeroLinha = 0;
			for (Pessoa p : pessoas) {
				Row linha = linhasPessoa.createRow(numeroLinha ++);//criando a linha na planilha
				
				int celula = 0;
				
				Cell celNome = linha.createCell(celula ++);
				celNome.setCellValue(p.getNome());
				
				Cell celEmail = linha.createCell(celula ++);
				celEmail.setCellValue(p.getEmail());
				
				Cell celIdade = linha.createCell(celula ++);
				celIdade.setCellValue(p.getIdade());
			}
			
			FileOutputStream saida = new FileOutputStream(file);
			hssfworkbook.write(saida);//escreve a planilha em arquivo
			
			saida.flush();
			saida.close();
			
		}
		
		System.out.println("Planilha foi criada!");

	}

}
