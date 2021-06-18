package Stock;

import Category.Produce;

public class TestStock {

	public static void main(String[] args) {
		
		Produce carrot = new Produce(1,"Carrot",100,10,0,0.5f);
		
		System.out.println(carrot.getItemName());
		System.out.println(carrot.getDiscount());
		System.out.println(carrot.calFinalPrice());
		carrot.setDiscount(15);
		System.out.println(carrot.getDiscount());
	}

}
