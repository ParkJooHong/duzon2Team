package sungeun.assignment.date717.num2;

class Counter {
	static int count = 0;
    Counter() {
        count++;
        System.out.println(count); 
    }
}
public class StaticEx {
	public static void main(String[] args) {
		 Counter c1 = new Counter();
	     Counter c2 = new Counter();
	}
}
