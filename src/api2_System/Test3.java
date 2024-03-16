package api2_System;

public class Test3 {
	public static void main(String[] args) {
		int i, tot=0;
		
		for(i=1; i<=1000000000; i++) {
			tot += i;
			if(tot >= 10000) {
				System.out.println("합이 10000이상일 때 i값은? " + i);
				//break;
				//return;
				System.exit(0); //jvm에서 끝내버림. 밑에 시스템 수행 안 함. 정말 끝내고싶을땐 엑시트가 효과적(리턴과 엑시트 명령 차이 정리하기)
			}
		}
		System.out.println("작업끝");
	}
}
