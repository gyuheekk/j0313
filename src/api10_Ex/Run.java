package api10_Ex;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Service service = new Service();
		VO[] data = new VO[100];
		
		int cnt = 0;
		boolean run = true;
		
		while(run) {
			VO vo = new VO();
			System.out.println("아이디를 입력하세요?");
			vo.setId(sc.next());
			System.out.println();
		}
		
		
		sc.close();
	}
}
