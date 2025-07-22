package chap_05_03;

public class EnumTest02 {

	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUMDAY
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day today = Day.TUESDAY;
		System.out.println("오늘은 " + today + " 입니다" );
		
		
	}

}
