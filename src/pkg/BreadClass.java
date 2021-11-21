package pkg;

class Bread {
	
	private String	name;
	
	private int		price;
	
	public void		selling() {
		System.out.println(this.getName() + "이 " + this.getPrice() + "원에 팔렸습니다.");
	}
	
	public void		print() {
		System.out.println(this.name + "이 " + this.price + "원에 팔렸습니다.");
	}
	
	public String	toString() {
		return this.name + "이 " + this.price + "원에 팔렸습니다.";
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

public class BreadClass {

	public static void main(String[] args) {

		Bread bread = new Bread();
		
		bread.setName("피자빵");
		bread.setPrice(29000);
		
		bread.selling();
		bread.print();
		System.out.println(bread);

	}

}
