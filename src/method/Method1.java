package method;

public class Method1 {

	public static void main(String[] args) {

		choki();	//메소드 1형식 호출문
		mainWork();
		mamoori();

	}

	private static void mamoori() {

		System.out.println("마무리작업100줄!");
		
	}

	private static void mainWork() {

		System.out.println("주요작업1000줄!");
		
	}

	private static void choki() {

		System.out.println("초기작업20줄!");
		
	}

}

//	메소드 1형식
