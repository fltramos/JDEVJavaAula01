package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Francisco\\git\\JDEVJavaAula01\\primeiro-programa-java\\src\\arquivos\\arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); //Prepara a entrada do arquivo xls do excel
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); //Pegando a planilha
		
		Iterator<Row> linhIterator = planilha.iterator();
		
		while (linhIterator.hasNext()) {//Enquanto tiver linha
			Row linha = linhIterator.next();//Dados da pessoa na linha
			
			int numeroCelulas = linha.getPhysicalNumberOfCells();//Quantidade de celula
			
			Cell cell = linha.createCell(numeroCelulas);//Criar nova celula na linha
			cell.setCellValue("5.487,20");
		}
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada!");

	}

}
