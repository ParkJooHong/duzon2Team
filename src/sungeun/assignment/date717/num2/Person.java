package sungeun.assignment.date717.num2;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("980526-222222", "김성은");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		//p1.nation = "secret";    -> nation의 초기값이 Korea로 정해졌기 때문에 변경될 수 없다.
		//p1.ssn= "123456-123456"; -> ssn의 초기값이 생성될 때 정해졌기 땜누에 변경될 수 없다.
		p1.name = "변경가능";
	}
}
