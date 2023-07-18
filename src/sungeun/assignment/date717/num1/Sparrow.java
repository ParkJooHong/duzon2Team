package sungeun.assignment.date717.num1;

public class Sparrow extends Bird implements Flyable{
	public Sparrow() {
		this.name = "참새";
	}

	@Override
	public void sound() {
		System.out.println("짹짹");
	}

	@Override
	public void fly() {
		System.out.println("날 수 있습니다.");
	}
	
}