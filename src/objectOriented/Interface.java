package objectOriented;

interface Restaurant {		//	대충 설계도라 코드를 못씀
	public void packing();	//	상속받는 자식에서 코딩을 해줘야함
}

interface Uber {
	public void delivery();
}

class Chef {
	public void cook() {
		System.out.println("Chef cooks well");
	}
}

class Manager extends Chef implements Restaurant, Uber {
	
	public void cook() {
		System.out.println("Manager cooks well");
	}
	
	@Override
	public void packing() {
		System.out.println("Manager also packs well");
	}

	@Override
	public void delivery() {
		System.out.println("Manager also delivers well");
	}
	
}



public class Interface {

	public static void main(String[] args) {

		

	}

}
