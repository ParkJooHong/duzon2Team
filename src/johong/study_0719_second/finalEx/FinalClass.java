package johong.study_0719_second.finalEx;

public class FinalClass {
	public static void main(String[] args) {
		
		MyTall a = new MyTall();
		
		a.yourTall = 188.2;
		System.out.println("당신의 키는 : " +a.yourTall);
		//a.MY_TALL = 190.3; final이라서 변경할 수 없다.
	
		// MyTall 클래스가 final을 가지기 때문에 상속 불가.
		//MySonTall son = new MySonTall();
		//son.mySonFuture();
	}
}
