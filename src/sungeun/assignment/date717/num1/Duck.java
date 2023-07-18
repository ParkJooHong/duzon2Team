package sungeun.assignment.date717.num1;

public class Duck extends Bird implements Swimable{
	public Duck() {
		this.name = "오리";
	}

	@Override
	public void sound() {
		System.out.println("꽥꽥");
	}

	@Override
	public void swim() {
		System.out.println("수영할 수 있습니다");
	}
	
	
	
	
}
