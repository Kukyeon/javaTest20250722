package chap_05_03;

public class EnumTest001 {

		//enum  열거형
		
		enum Gender {
			MALE, FEMALE
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gender g = Gender.FEMALE;
		
		if(g == Gender.MALE) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		
		
	}

}
