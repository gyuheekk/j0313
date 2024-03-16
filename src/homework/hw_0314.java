package homework;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class hw_0314 {
	public static void main(String[] args) {
		
		String[][] data = {
				{"홍길동","2000-01-01"},
				{"김말숙","2020-12-31"},
				{"이기자","2019-05-20"},
				{"소나무","2024-03-14"},
				{"아톰맨","2022-11-22"},
				{"에이맨","2023-12-11"},
				{"오하늘","2024-03-14"},
				{"최고봉","2021-03-14"},
				{"으뜸맨","2023-05-02"},
				{"사랑이","2024-03-13"},
				{"감나무","2022-10-10"},
				{"행복맨","2000-12-12"},
				{"가나다","2024-02-28"},
				{"오솔길","2024-03-01"}
		};
		
		System.out.println("===등록한지 1년 이상 된 회원들의 명단===");
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		for(int i=0; i<data.length; i++) {
			String name = data[i][0];
			LocalDate localdate = LocalDate.parse(data[i][1],formatter);
			Period period = Period.between(localdate, currentDate);//localdate등록일,currentDate현재일
			if(period.getYears() >= 1) {
				System.out.println(name + "님은 등록한지 " +period.getYears()+"년이 경과되었습니다.");
			}
		}
		System.out.println("===최근 1달 이내 등록한 회원들의 명단===");
		LocalDate currentDate2 = LocalDate.now();
		LocalDate month = currentDate2.minusMonths(1); //1달 전 날짜 구하기
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		for(int i=0; i<data.length; i++) {
			String name = data[i][0];
			LocalDate localdate = LocalDate.parse(data[i][1],formatter);
			Period period = Period.between(localdate, currentDate);//localdate등록일,currentDate현재일
			//개월수는 타입을 바꿔줘야 함
			//if(period.getMonths() >= 1) {
				System.out.println(name + "님은 최근 한 달 이내 등록한 회원입니다. 등록일자 : " +period.getMonths());
			}
		}
		
	}
//}
