package api4_String;
// 중복되는 글자가 있을 경우, 그 글자의 위치도 전부 출력할 수 있도록 수정해보기
import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String abc; 
		String search;
		int index;
		
		boolean run = true;
		while(run) {
			System.out.println("문장을 입력해주세요? (종료시에는 '종료'라고 입력해주세요.) ");
			System.out.print("==========================>>> ");
			abc = sc.nextLine();
			
			if(abc.equals("종료")) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
				while(true) {
					System.out.println("찾는 문자를 입력하세요? ");
					System.out.print("==========================>>> ");
					search = sc.nextLine();
				
					if(abc.indexOf(search) == -1) {
						System.out.println("입력하신 문장에 없는 문자입니다. 찾으실 문자를 다시 입력해주세요.");
						System.out.println("--------------------------------------------------");
						continue;
					}
					else break;
				}
			
			int tot = 0, position = 0;
			while(true) {	
				position = abc.indexOf(search, position+1);
				if(position == -1) break;
				System.out.println((tot+1) + "번째 위치(색인번지) : " + position);
				tot++;
			}
		}
		sc.close();
	}
}
