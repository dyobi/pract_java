package pkg;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int pp = 100;	//Stack memory
//		String aaa = "ondal";	//Heap memory

//		String ppp=null;	//null pointer error
//		String qqq="";	//빈문자열 (길이가0인 문자열)

//		System.out.println(ppp.length()>0);	//null point error
//		System.out.println(qqq.length()>0);	//false

		String aa = "ondal";
		String bb = "ondal";

		if (aa == bb) {
			System.out.println(aa + "\t" + bb);
		}

		if (aa.equals(bb)) {
			System.out.println(aa + "\t" + bb);
		}

	}

}
