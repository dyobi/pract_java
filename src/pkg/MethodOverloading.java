package pkg;

public class MethodOverloading {

	public static void main(String[] args) {
		
		int a = 10, b = 30;

		method();
		method(a, b);

	}

	private static void method(int a, int b) {
		
		System.out.println("Args => 2 => " + (a + b));
		
	}

	private static void method() {

		System.out.println("Args => 0");
		
	}

}

//	Method duplicated
//	1. Method 이름이 같아야한다
//	2. 인자의 타입이 다르거나 갯수가 달라야한다