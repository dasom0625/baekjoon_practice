package dasom_202203;

import java.util.Arrays;

public class mar_20 {

	public static void main(String[] args) {
		// Hello Java! 프린트하기

		//1. 첫번쩨 방법 - 그냥 프린트하기
		System.out.println("Hello Java!");

		//2. 두번재 방법  - String타입으로 추출
		String a = "Hello";
		String b = " Java!";
		System.out.println(a+b);

		//3. 세번째 방법 - 배열로 프린트하기
		String[]c = {"Hello Java!"};
		System.out.println(Arrays.toString(c));



	}

}
