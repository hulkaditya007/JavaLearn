package javaLearn;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeCode {

	public static void main(String[] args) {
		LocalDate l = LocalDate.of(1997, 02, 07);
		LocalDate curr= LocalDate.now();
		Period p = Period.between(l, curr);
		System.out.println("Years"+ p.getYears()+ "  Months"+p.getMonths()+ " Days "+p.getDays() + "  ") ;
		
		 String birthdateString = "1990-05-15T10:30";
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD'T'HH:mm");
		 LocalDateTime birthdate = LocalDateTime.parse(birthdateString, formatter);
		 
		 LocalDateTime current = LocalDateTime.now();
		 Period p21 = Period.between(birthdate.toLocalDate(), current.toLocalDate());
		 
			System.out.println("Years"+ p21.getYears()+ "  Months"+p21.getMonths()+ " Days "+p21.getDays() + "  ") ;
		
			
			
		
		
	}

}
