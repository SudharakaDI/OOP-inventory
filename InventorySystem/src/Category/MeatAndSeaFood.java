package Category;

public class MeatAndSeaFood extends Category{

	private float weight;

	public MeatAndSeaFood() {
		super();
	}

	public MeatAndSeaFood(int id, String itemName, float retailPrice, float discount,  float promotion,float weight) {
		super(id, itemName, retailPrice, discount, promotion);
		this.weight = weight;
	}
	

	public float getWeight() {
		return weight;
	}
	

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
