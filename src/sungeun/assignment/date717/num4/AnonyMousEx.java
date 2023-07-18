package sungeun.assignment.date717.num4;

import java.util.ArrayList;

public class AnonyMousEx extends ArrayList {
	
	public AnonyMousEx() {
		this.add("아메리카노");
		this.add("카페라떼");
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "카페메뉴";
	}
	
	public static void main(String[] args) {
		AnonyMousEx a = new AnonyMousEx();
	}
}


