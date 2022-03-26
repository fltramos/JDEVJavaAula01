package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi3 {

	public static void main(String[] args) throws IOException {
		FileInputStream entrada = new FileInputStream("C:\\Users\\Francisco\\git\\JDEVJavaAula01\\primeiro-programa-java\\src\\arquivos\\arquivo_excel.xls");
		try (HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada)) {
			HSSFSheet planilha = hssfWorkbook.getSheetAt(0);//Pega a primeira planilha do nosso arquivo excel
			Iterator<Row> linhaIterator = planilha.iterator();
			List<Pessoa> pessoas = new ArrayList<>();
			
			while (linhaIterator.hasNext()) {//Enquanto tiver linha
				Row linha = linhaIterator.next();
				Iterator<Cell> celulas = linha.iterator();
				
				Pessoa pessoa = new Pessoa();
				
				while (celulas.hasNext()) {//Percorrer as celulas
					Cell cell = celulas.next();
					switch (cell.getColumnIndex()) {
					case 0:
						pessoa.setNome(cell.getStringCellValue());
						break;
					case 1:
						pessoa.setEmail(cell.getStringCellValue());
						break;
					case 2:
						pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
						break;
					default:
						break;
					}
				}
				pessoas.add(pessoa);
			}
			entrada.close();
			
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa);
			}
		}

	}

}
