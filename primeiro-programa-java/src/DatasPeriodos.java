import java.time.LocalDate;
import java.time.Period;

public class DatasPeriodos {

	public static void main(String[] args) {
		LocalDate dataAntiga = LocalDate.of(2022, 3, 20);
		
		LocalDate dataNova = LocalDate.of(2022, 10, 7);
		
		/* LocalDate dataAntiga = LocalDate.parse("2022-03-20");
		
		LocalDate dataNova = LocalDate.parse("2022-10-7"); pode ser usado desta maneira*/
		
		System.out.println("Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova) + " ");
		
		System.out.println("Data antiga é menor que data nova: " + dataAntiga.isBefore(dataNova) + " ");
		
		System.out.println("Data antiga é igual a data nova: " + dataAntiga.isEqual(dataNova) + " ");
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Total de meses: " + periodo.toTotalMonths());
		
		System.out.println("Período é: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses" + " e " + periodo.getDays() + " dias");

	}

}
