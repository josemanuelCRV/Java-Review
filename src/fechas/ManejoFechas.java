package fechas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Date y Calendar
 * 
 * @author josem
 *
 */
public class ManejoFechas {

	public static void main(String[] args) {

		// La case Date se mantiene por retrocompatibilidad
		Date fecha = new Date();
		// Some methods are deprecated
		int year = fecha.getYear();
		int day = fecha.getDate();

		System.out.println(year + 1900 + " = getYear() + 1900");
		System.out.println(day + " = getDate()");

		// Calendar trabaja mejor con fechas.
		// Calendar - Clase Abstracta. Implica que no puedo hace un new de ella,
		// sino de una clase hija que la implemente.
		// WRONG: Calendar calendario = new Calendar();

		Calendar calendario = Calendar.getInstance(); // Método static de Clase
		int anio = calendario.get(Calendar.YEAR);
		System.out.println(anio);
		int dia = calendario.get(Calendar.DAY_OF_WEEK);
		System.out.println(dia); // sunday-monday...

		// Podemos crear una instancia de la clase Calendar utilizando la clase
		// GregorianCalendar
		Calendar calendar = new GregorianCalendar(2018, Calendar.JANUARY, 1);
		int mes = calendar.get(Calendar.MONTH);
		System.out.println("---------------\nMes número: " + mes);
		// Enero=0; Febrero=1; Marzo=2;...

		// Podemos definir GregorianCalendar de acuerdo al código del lenguaje
		Locale locale = new Locale("es");
		Calendar ical = new GregorianCalendar(locale);
		int month = ical.get(Calendar.JANUARY);
		System.out.println("Mes: " + month);
		
		// Locale locale = new Locale("es");
		// Locale locale = Locale.getDefault();
		String lang = locale.getDisplayLanguage();
		String country = locale.getDisplayCountry();

		System.out.println(locale + "\n" + lang + "\n" + country);
	}

}
