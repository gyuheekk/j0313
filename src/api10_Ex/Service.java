package api10_Ex;

public class Service {

	public void membership (VO[] data, int cnt) {
		System.out.println("=============================");
		System.out.println("아이디\t비밀번호\t성명\t나이\t전화번호");
		System.out.println("------------------------------");
		for(int i=0; i<cnt; i++) {
			System.out.println(data[i].getId()+"\t"+data[i].getPassword()+"\t");
		}
	}
	
}
