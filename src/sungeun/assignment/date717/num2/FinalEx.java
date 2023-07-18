package sungeun.assignment.date717.num2;

class FinalMethodTest{
	int result = 10;
	public final void printResult() {
		System.out.println(result);
	}
}

public class FinalEx extends FinalMethodTest{
/*	@Override   
    public final void printResult() { // Error: 오버라이딩을 할 수 없다.
 
    }*/
}
