package api5_Wrapper;

public class Test2 {
	public static void main(String[] args) {
		// 객체에 정수값 대입시, 1Byte의 저장범위인 -128 ~ 127 사이의 값은 해당 번지에 저장시키기에 '=='으로 비교하면 같은값으로 출력
		// 결론은 객체의 비교시는 equals로 비교한다.
		Integer dbjInt1 = 300;
		Integer dbjInt2 = 300;
		System.out.println("== : " + (dbjInt1 == dbjInt2));
		System.out.println("equals : " + (dbjInt1.equals(dbjInt2)));
		System.out.println();
		
		Integer dbjInt3 = 10;
		Integer dbjInt4 = 10;
		System.out.println("== : " + (dbjInt3 == dbjInt4));
		System.out.println("equals : " + (dbjInt3.equals(dbjInt4)));
		
	}
}
