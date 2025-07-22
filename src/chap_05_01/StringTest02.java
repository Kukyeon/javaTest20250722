package chap_05_01;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "kor";
		String str2 = "kor";
		 // 기존 문자열이 존재하는지 검색 후에 똑같은 문자열이 존재하면 같은 주소를 참조하는 방식
		String str3 = new String("kor"); //무조건 메모리에 새로운 문자열을 생성
		
		// 문자열 변수는 참조타입이므로 해당 조건식은 str1과 str2의 값을 비교하는 것이 아니라
		// str1과 str2가 가지고 있는 실제 문자열이 저장되어 있는 메모리의 번지를 비교하는것이다.
		if(str1 == str3) { // 문자열 비교는 == 부등호 사용 안됨 !@!#ㅑ)!()
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(str1.equals(str2)) { // 문자열 비교는 꼭 equals() 를 사용
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		
		}
		
		System.out.println("String의 해시 코드:" + System.identityHashCode(str1));
		System.out.println("String의 해시 코드:" + System.identityHashCode(str2));
		System.out.println("String의 해시 코드:" + System.identityHashCode(str3));
		// 메모리 자체의 고유 번호
	}

}
