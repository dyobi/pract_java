package pkg;

class Sangpoom {
	
	String	irum;
	int		soo;
	int		dan;

//	--- Getters & Setters ---
	
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getSoo() {
		return soo;
	}
	public void setSoo(int soo) {
		this.soo = soo;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	
//	--- Constructors ---
	
	public Sangpoom() {}
	public Sangpoom(String irum, int soo, int dan) {
		this.irum = irum;
		this.soo = soo;
		this.dan = dan;
	}
	
}

public class SooDanClass {

	public static void main(String[] args) {

		Sangpoom milk = new Sangpoom();
		milk.setIrum("우유");
		milk.setSoo(20);
		milk.setDan(1000);
		System.out.println(milk.getIrum() + "\t" + milk.getSoo() + "\t" + milk.getDan());
		
		Sangpoom bread = new Sangpoom();
		bread.setIrum("빵");
		bread.setSoo(100);
		bread.setDan(500);
		System.out.println(bread.getIrum() + "\t" + bread.getSoo() + "\t" + bread.getDan());
		
		Sangpoom snacks = new Sangpoom("과자", 200, 700);
		System.out.println(snacks.getIrum() + "\t" + snacks.getSoo() + "\t" + snacks.getDan());
		
		int	sum = (milk.getSoo() * milk.getDan()) + 
				(bread.getSoo() * bread.getDan()) + 
				(snacks.getSoo() * snacks.getDan());
		
		System.out.println("총판매액= " + sum + "원");
		
	}

}
