package api8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class T3_LocalDate {
	public static void main(String[] args) {
		// LocalDate객체
		LocalDate currentDate = LocalDate.now();
		System.out.println("오늘날짜 : " + currentDate);
		
		// 날짜 지정 셋팅
		currentDate = LocalDate.of(2024, 12, 25);
		System.out.println("지정날짜 : " + currentDate);
		
		// 시스템의 현재 시간정보 가져오기
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재시간 : " + currentTime);
		System.out.println("현재시간 : " + currentTime.toString().substring(0,8));
	
		// 시간 지정 셋팅
		LocalTime targetTime = LocalTime.of(12, 50, 30);
		System.out.println("설정 시간 : " + targetTime);
		
		// 날짜 시간 -> split사용
		LocalDateTime currentTime3 = LocalDateTime.now();
		System.out.println("오늘 날짜 시간 : " + currentTime); //확인
		String[] strToday = currentTime3.toString().split("T");
		System.out.println("오늘 날짜 : " + strToday[0]);
		System.out.println("현재 시간 : " + strToday[1].substring(0,8));
		
		// 날짜/시간 지정 셋팅
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 3, 14, 13, 5, 10);
		System.out.println("설정 날짜/시간 : " + targetDateTime);
		System.out.println();
		
		// 날짜 연산하기
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("현재 날짜/시간 : " + now.format(dtf));
		
		LocalDateTime res = now.plusYears(1);
		System.out.println("1년 더하기 : " + res.toString().substring(0,4) + "년");
		
		res = now.minusYears(1);
		System.out.println("1년 빼기 : " + res.toString().substring(0,4) + "년");
		
		res = now.plusMonths(2);
		System.out.println("2월 더하기 : " + res.toString().substring(5,7) + "월");
		
		res = now.minusMonths(2);
		System.out.println("2월 빼기 : " + res.toString().substring(5,7) +"월");
		
		res = now.plusDays(7);
		System.out.println("7일 더하기 : " + res.toString().substring(8,10) + "일");
		
		res = now.minusDays(7);
		System.out.println("7일 빼기 : " + res.toString().substring(8,10) +"일");
		System.out.println();
	}
}
