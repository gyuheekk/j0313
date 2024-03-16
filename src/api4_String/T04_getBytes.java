package api4_String;

import java.io.UnsupportedEncodingException;

public class T04_getBytes {
	public static void main(String[] args) {
		// 아스키코드: 영문1글자 1Byte, 한글: 2Byte
		// EUC-KR : 영문1글자 1Byte, 한글: 2Byte
		// 유니코드 : UTF-8 영문1글자 1Byte, 한글: 3Byte
		String str1 = "안녕하세요!";
		String str2 = "Hello!";
		
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		System.out.println();
		
		byte[] b1 = str1.getBytes(); //알아서 문자열을 바이트로 바꿔서 배열에 넣어줌.
		System.out.println("b1의 길이 : " + b1.length);
		
		byte[] b2 = str2.getBytes(); //17, 20번라인은 파일 업로드/다운로드할때 많이 사용함
		System.out.println("b2의 길이 : " + b2.length);
		System.out.println();

		// 인코딩(암호화)/디코딩(복호화)
		try {
			// EUC-KR
			// 한글 인코딩 <-> 디코딩
			byte[] b3 = str1.getBytes("EUC-KR");
			System.out.println("b3의 길이 : " + b3.length);
			System.out.println("b3 : " + b3.toString()); //오버라이딩 안 하면 주소 출력, toString()은 생략가능
			System.out.println("b3[0] : " + b3[0]);
			System.out.println("~~~~~~~~~~~~~~~~~전송중~~~~~~~~~~~~~~~~~");
			String str3 = new String(b3, "EUC-KR"); // 디코딩
			System.out.println("str3 : " + str3);
			System.out.println();
			
			// 영문 인코딩 <-> 디코딩
			byte[] b4 = str2.getBytes("EUC-KR");
			System.out.println("b2의 길이 : " + b2.length);
			System.out.println("b2 : " + b2.toString()); //오버라이딩 안 하면 주소 출력, toString()은 생략가능
			System.out.println("b2[0] : " + b2[0]);
			System.out.println("~~~~~~~~~~~~~~~~~전송중~~~~~~~~~~~~~~~~~");
			String str4 = new String(b4, "EUC-KR"); // 디코딩
			System.out.println("str4 : " + str4);
			System.out.println("======================================================");
			
			// UTF-8
			// 한글 인코딩 <-> 디코딩
			b3 = str1.getBytes("UTF-8");
			System.out.println("b3의 길이 : " + b3.length);
			System.out.println("b3 : " + b3.toString()); //오버라이딩 안 하면 주소 출력, toString()은 생략가능
			System.out.println("b3[0] : " + b3[0]);
			System.out.println("~~~~~~~~~~~~~~~~~전송중~~~~~~~~~~~~~~~~~");
			str3 = new String(b3, "UTF-8"); // 디코딩
			System.out.println("str3 : " + str3);
			System.out.println();
			
			// 영문 인코딩 <-> 디코딩
			b4 = str2.getBytes("UTF-8");
			System.out.println("b2의 길이 : " + b2.length);
			System.out.println("b2 : " + b2.toString()); //오버라이딩 안 하면 주소 출력, toString()은 생략가능
			System.out.println("b2[0] : " + b2[0]);
			System.out.println("~~~~~~~~~~~~~~~~~전송중~~~~~~~~~~~~~~~~~");
			str4 = new String(b4, "UTF-8"); // 디코딩
			System.out.println("str4 : " + str4);
			System.out.println();
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
