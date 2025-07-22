package chap_05_03;

public class EnumTest03 {

	enum Season{
		SPRING, SUMMER, FALL, WINTER
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Season nowTime = Season.SUMMER;
		
		switch (nowTime) {
		case SPRING: 
			System.out.println("꽃이 피는 봄 입니다.");
			break;
		case SUMMER: 
			System.out.println("진짜 여름 개덥다요!");
			break;	
		case FALL: 
			System.out.println("선선한 날씨의 가을");
			break;	
		case WINTER: 
			System.out.println("러시아 보다 추운 겨울");
			break;	
			
		}
		
	}

}
