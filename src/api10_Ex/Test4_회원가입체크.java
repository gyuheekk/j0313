package api10_Ex;

import java.util.regex.Pattern;

/*
 	아이디 : 영문(대/소), _ , - , 숫자    ===>>> 4자 이상
 	비밀번호 : 영문(대/소), ~!@#$%^&*()_+-= , 숫자 ===>>> 6자 이상
 	성명 : 영문(대/소),한글
 	나이 : 숫자
  전화번호 : 02-123-4567, 010-123-4567, 010-1234-5678, 043-123-4567, 043-1234-5678
  이메일 : 영문(대/소), 숫자 ->3,12자리 / @ / 영문(대/소) -> 1,7자리 / . /영문(소)
  주민번호 : 123456-1234567 (8번째는 1/2/3/4)
 */

public class Test4_회원가입체크 {
	public static void main(String[] args) {
		String id = "^[a-zA-Z0-9_-]{4,}+$"; 
		String password = "^[a-zA-Z0-9~!@#$%^&*()_+-=]{6,}+$"; 
		String name = "^[a-zA-Z가-힣]+";
		String age = "^[0-9]+";
		String phonenumber = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$";
		String email = "^[a-zA-Z0-9_-]{3,12}@[a-zA-Z0-9]{1,7}+\\.[a-z]+$";
		String jumin = "^[0-9]{6}-[1-4]{1}[1-9]{6}$";
		
		String strid = "kh010129";
		String strpassword = "0129Dlrbgml#";
		String strname = "이규희";
		String strage = "24";
		String strphonenumber = "010-9085-0129";
		String stremail = "kh010129@naver.com";
		String strjumin = "010129-4123456"; 
		
		System.out.println("1. " + Pattern.matches(id, strid));
		System.out.println("2. " + Pattern.matches(password, strpassword));
		System.out.println("3. " + Pattern.matches(name, strname));
		System.out.println("4. " + Pattern.matches(age, strage));
		System.out.println("5. " + Pattern.matches(phonenumber, strphonenumber));
		System.out.println("6. " + Pattern.matches(email, stremail));
		System.out.println("7. " + Pattern.matches(jumin, strjumin));
		
	}
}
