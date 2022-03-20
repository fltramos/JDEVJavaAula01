import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ApiDatasDiaMesAno {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da Semana: " + localDate.getDayOfWeek());
		System.out.println("Dia do Mês: " + localDate.getDayOfMonth());
		System.out.println("Dia do Ano: " + localDate.getDayOfYear());
		System.out.println("Mês: " + localDate.getMonthValue() + " - " + localDate.getMonth());
		System.out.println("Ano: " + localDate.getYear());
	}

}
