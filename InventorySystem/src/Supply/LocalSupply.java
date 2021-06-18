package Supply;

public class LocalSupply extends Supply{
	
	private String supplierName; 
	private String vehicleType;
	private String vehicleID;
	
	public LocalSupply() {
		super();
		
	}
	public LocalSupply(String itemType, int quantity, boolean isPending, String dateOfDepature, String dateOfArrival) {
		super(itemType, quantity, isPending, dateOfDepature, dateOfArrival);
		this.supplierName = supplierName;
		this.vehicleType = vehicleType;
		this.vehicleID = vehicleID;
		
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}
	
	
	
}
