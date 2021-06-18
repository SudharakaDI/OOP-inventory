package Category;

public class Grain extends Category {
	
	private String brand;
	private float weight;
	private boolean isLocal;//local or imported

	public Grain() {
		super();
	}

	public Grain(int id, String itemName, float retailPrice, float discount,  float promotion,float weight,boolean isLocal,String brand) {
		super(id, itemName, retailPrice, discount, promotion);
		this.weight = weight;
		this.isLocal=isLocal;
		this.brand = brand;
	}
	

	public float getWeight() {
		return weight;
	}
	

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isLocal() {
		return isLocal;
	}

	public void setLocal(boolean isLocal) {
		this.isLocal = isLocal;
	}

	
	
	

}
