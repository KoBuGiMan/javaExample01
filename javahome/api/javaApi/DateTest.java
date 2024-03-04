package javaApi;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTest {

	public static void main(String[] args) {
		
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
//		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println(nowDateTime);
		
		// 날짜비교 
		LocalDate birth = LocalDate.of(1999, 6, 24);
		LocalDate now = LocalDate.of(2024, 3, 4);
		Period how = Period.between(birth, now);
		System.out.println(how );
	
		// 2024-03-04
		LocalDate date = LocalDate.now();
		DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
		System.out.println(date.format(isoDate));
		
		// 2024년 3월 4일 월요일
		DateTimeFormatter fullDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(date.format(fullDate));
		
////////////////////////////////////////////////////////////////////////////////////////////
		
		// 2024-03-04T15:56:17.339144500+09:00[Asia/Seoul]
		ZonedDateTime zNow = ZonedDateTime.now();
		System.out.println(zNow);
		
		// 24-03-04 월 64
		DateTimeFormatter dtForm = DateTimeFormatter.ofPattern("yy-MM-dd E D");
		System.out.println(zNow.format(dtForm));
		
		// 04:06:24 오후(a) KST(z) 서기(G)
		DateTimeFormatter formet1 = DateTimeFormatter.ofPattern("hh:mm:ss a z G");
		System.out.println(zNow.format(formet1));
		
		// Year:2024 / Month:3월 / Day:04 
		DateTimeFormatter formet2 = DateTimeFormatter.ofPattern("'Year:'yyyy' / Month:'MMMM' / Day:'dd' '");
		System.out.println(zNow.format(formet2));
		
		// 2024-03-04T16:15
		String dateTime = "2024-03-04 16:15";
		DateTimeFormatter timeForm1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime ldt = LocalDateTime.parse(dateTime, timeForm1);
		System.out.println(ldt);
		
		
	}
	
	
	
}
