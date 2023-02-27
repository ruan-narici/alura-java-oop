package java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);
		
		LocalDate rep2099 = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(rep2099);
		
		Period periodo = Period.between(dataAtual, rep2099);
		System.out.println(periodo.getDays() + " dias, " +  periodo.getMonths() + " meses e " + periodo.getYears() + " anos.");
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatador.format(dataAtual);
		System.out.println(dataFormatada);

	}
}
