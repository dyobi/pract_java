package pkg;

import java.util.ArrayList;

class Product {
	
	String	product;
	int		price;
	
	@Override
	public String toString() {
		return "상품이름은 " + product + " 이고 " + "상품가격은" + price + " 입니다.";
	}
	
//	--- Constructors ---
	public Product() {}
	public Product(String product, int price) {
		this.product = product;
		this.price = price;
	}
	
//	--- Getters & Setters ---
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

public class ProductArrayList {

	public static void main(String[] args) {

		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product("Apple", 2900));
		list.add(new Product("Banana", 1800));
		list.add(new Product("Peach", 2100));
		list.add(new Product("Tomato", 1900));
		list.add(new Product("Strawberry", 3500));
		list.add(new Product("Melon", 4100));
		list.add(new Product("Grape", 1600));
		list.add(new Product("Orange", 1300));
		
		for (int i = 0; i < list.size(); i++) {		// 전체 상품이름 출력
			System.out.print(list.get(i).getProduct() + " ");
		}
		
		for (int i = 0; i < list.size(); i++) {		// 2000원 이하인 상품 이름과 가격 출력
			if (list.get(i).getPrice() <= 2000)
				System.out.println(list.get(i).getProduct() + " : " + list.get(i).getPrice());
		}
		
		for (Product res:list) {		//	For-colon
			System.out.println(res);
		}

	}

}

//상품, 가격 속성이 있는 SMarket 클래스를 활용하여
//main() 에서 8개 정도 객체를 만들어 arraylist 컬렉션에 넣은다음
//1) toString() 사용하지 않고 상품이름 모두 출력하고
//2) toString() 사용하지 않고 2000원 이하인 상품명과 상품가격을 모두 출력
//3) 또한 for-colon 을 사용하여 전체 상품명과 상품 가격을 출력
//for-colon 시 toString()자동 사용됨