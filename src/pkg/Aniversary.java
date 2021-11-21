package pkg;

import java.util.Date;

public class Aniversary {

	public static void main(String[] args) {

		Date date = new Date();
		
		date.setDate(date.getDate() + 99);

		System.out.println(date);

	}

}
