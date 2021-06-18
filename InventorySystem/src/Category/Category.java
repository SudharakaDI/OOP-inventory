package Category;

public class Category {
	
	private int id;
	private String itemName;
	private float retailPrice;
	private float discount;
	private float finalPrice;
	private float promotion;
	
	public Category() {
		
	}
	
	
	public Category(int id, String itemName, float retailPrice, float discount, float promotion) {
	
		this.id = id;
		this.itemName = itemName;
		this.retailPrice = retailPrice;
		this.discount = discount;
		this.promotion = promotion;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(float retailPrice) {
		this.retailPrice = retailPrice;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public float getFinalPrice() {
		return finalPrice;
	}
	
	public void setFinalPrice(float finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	public float getPromotion() {
		return promotion;
	}
	
	public void setPromotion(float promotion) {
		this.promotion = promotion;
	}
	
	
	public float calFinalPrice() {
		this.finalPrice = this.retailPrice - this.retailPrice*this.discount/100;
		return finalPrice;
	}
	
	
	

}
