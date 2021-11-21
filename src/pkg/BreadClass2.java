package pkg;

class Bread2 {
	
	private String	name;
	private int		price;
	
	public String toString() {
		return (name + "은 " + price + "원 입니다.");
	}
	
//	--- Constructors ---
	
	public Bread2 () {}
	
	public Bread2 (String name, int price) {
		this.name = name;
		this.price = price;
	}

//	--- Getters & Setters ---
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class BreadClass2 {

	public static void main(String[] args) {

		Bread2 bread = new Bread2("크로아상", 3900);
		
		System.out.println(bread);

	}

}
