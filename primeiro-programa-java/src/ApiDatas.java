import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ApiDatas {

	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalTime hortaAtual = LocalTime.now();
		LocalDateTime dateTimeAtual = LocalDateTime.now();
		
		System.out.println("Data atual: " + dataAtual);
		System.out.println("Hora atual: " + hortaAtual);
		System.out.println("Data e hora atual: " + dateTimeAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm.ss")));
		
		
	}

}
