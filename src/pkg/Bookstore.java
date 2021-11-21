package pkg;

import java.util.ArrayList;

class Book {

	private String	book_name;
	private String	book_genre;
	private int		book_price;
	
	@Override
	public String toString() {
		return "[책이름] " + book_name + "\t[장르] " + book_genre + "\t[책가격] " + book_price + " 원";
	}

//	--- Getters & Setters ---
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
//	--- Constructors ---
	
	public Book() {}
	public Book(String book_name, String book_genre, int book_price) {
		this.book_name = book_name;
		this.book_genre = book_genre;
		this.book_price = book_price;
	}
	
	
}

public class Bookstore {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();

		list.add(new Book("우리는 해낼수 있다", "자기개발", 12000));
		list.add(new Book("별이빛나는 밤에", "소설", 10000));
		list.add(new Book("나무와숲", "자기개발", 5000));
		list.add(new Book("나의연극인생", "자서전", 5000));
		list.add(new Book("잠자는공주", "판타지", 3000));
		
//		--- Output 1 ---
		for (Book res:list) {
			System.out.println(res.toString());
		}
		
//		--- Output 2 ---
		for (Book res:list) {
			if (res.getBook_price() >= 7000) {
				System.out.println(res.getBook_name() + "\t" + res.getBook_genre() + "\t" + res.getBook_price());
			}
		}
		
//		--- Output 3 ---
		int cnt = 0;
		for (Book res:list) {
			if (res.getBook_price() >=7000) {
				cnt++;
			}
		}
		System.out.println(cnt + "권");
		
	}

}
