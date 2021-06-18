package Category;

public class FrozenFood extends Category {
	
	private String brand;
	private int numOfItems;
	private boolean isLocal;//local or imported

	public FrozenFood() {
		super();
	}

	public FrozenFood(int id, String itemName, float retailPrice, float discount,  float promotion,int numOfItems,boolean isLocal,String brand) {
		super(id, itemName, retailPrice, discount, promotion);
		this.numOfItems = numOfItems;
		this.isLocal=isLocal;
		this.brand = brand;
	}
	

	

	public int getNumOfItems() {
		return numOfItems;
	}

	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
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
