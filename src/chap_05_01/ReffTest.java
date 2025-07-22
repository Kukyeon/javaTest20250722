package chap_05_01;

import java.util.Arrays;

public class ReffTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		int b;
		
		b = a;
		System.out.println(b); // -> a랑 b랑 복사 가능
		
		int[] numArr1 = null;
		int[] numArr2 = {10,20,30,40,50};
		numArr1 = numArr2;   // 비어있는 대열에 대입연산자만 복사(얕은복사), heap 영역에있는 대열은 복사 x
		
		
		// 얕은 복사는 하나를 바꾸면 같이 바뀔수도 있음. 겉값을 가져왔기에
		//Arrays.toString(numArr2);
		//numArr[0] = 100; // null pointer exception / null 값을 가르키는 에러
		System.out.println(numArr1[0]);
		
		System.out.println("numArr1의 해시 코드:" + System.identityHashCode(numArr1));
		System.out.println("numArr2의 해시 코드:" + System.identityHashCode(numArr2));
		
		System.out.println("=====================================");
		
		int[] numArr3 = null;
		int[] numArr4 = {100,200,300};
		
		numArr3 = Arrays.copyOf(numArr4, 3); // 
		for(int num : numArr3 ) { // 배열끼리의 복사방법(깊은 복사) heap 영역 대열까지 복사 o
			System.out.println(num);
			
		}
		System.out.println("numArr3의 해시 코드:" + System.identityHashCode(numArr3));
		System.out.println("numArr4의 해시 코드:" + System.identityHashCode(numArr4));
		
		System.out.println("=====================================");
		
		String str = null;
		str = "kor"; // null값에 kor 대입가능
				
		String str2 = "kor";
		str2 = null; // kor 값에 null넣게되면 연결 끊김
	}

}
