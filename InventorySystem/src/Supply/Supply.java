package Supply;

public class Supply {
	
	private String itemType;
	private int quantity;
	private boolean isPending;
	private String dateOfDepature;
	private String dateOfArrival;
	
	public Supply() {
		
	}
	
	public Supply(String itemType, int quantity, boolean isPending, String dateOfDepature, String dateOfArrival) {
		super();
		this.itemType = itemType;
		this.quantity = quantity;
		this.isPending = isPending;
		this.dateOfDepature = dateOfDepature;
		this.dateOfArrival = dateOfArrival;
	}

	public String getItemType() {
		return itemType; 
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isPending() {
		return isPending;
	}

	public void setPending(boolean isPending) {
		this.isPending = isPending;
	}

	public String getDateOfDepature() {
		return dateOfDepature;
	}

	public void setDateOfDepature(String dateOfDepature) {
		this.dateOfDepature = dateOfDepature;
	}

	public String getDateOfArrival() {
		return dateOfArrival;
	}

	public void setDateOfArrival(String dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}
	
	
	
}
