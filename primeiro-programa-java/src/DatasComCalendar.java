import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DatasComCalendar {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();//Pega a data atual
		//Simular que a data vem do BD		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("19-03-2022"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		//Date dataPassada = (Date) new SimpleDateFormat("dd/MM/yyyy").parse("25/03/2022");
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-03-01"), LocalDate.now());
		
		System.out.println("Data atual: " + LocalDate.now());
		System.out.println("Possuí "+ dias + " dias entre a faixa de data");
		
	}

}
