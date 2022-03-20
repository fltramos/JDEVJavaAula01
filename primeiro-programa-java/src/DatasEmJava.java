import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		Calendar data = Calendar.getInstance();
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(date);
		
		System.out.println(data.getFirstDayOfWeek());
		
		System.out.println(data.getTime());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual: " + simpleDateFormat.format(date));
		
		System.out.println("Objeto Date: " + simpleDateFormat.parse("07/10/1967 14:30.30"));
		
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Calendar dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Calendar dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Calendar Data atual em formato padrão String: " + simpleDateFormat.format(calendar.getTime()));
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dateVencimentoBoleto = simpleFormat.parse("10/04/2022");
		
		Date dataAtualHoje = simpleFormat.parse("10/04/2022");
		
		if (dateVencimentoBoleto.after(dataAtualHoje)) {
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido - URGENTE");
		}
		
		if (dateVencimentoBoleto.before(dataAtualHoje)) {
			System.out.println("Boleto vencido - URGENTE");
		}else {
			System.out.println("Boleto não vencido");
		}
	}
}
