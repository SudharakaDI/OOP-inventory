package Supply;

public class InternationalSupply extends Supply{

		private String shipNumber;
		private String dateToHabour;
		private String origin;
		
		public InternationalSupply() {
			super();
			
		}
		
		public InternationalSupply(String itemType, int quantity, boolean isPending, String dateOfDepature,
				String dateOfArrival) {
			super(itemType, quantity, isPending, dateOfDepature, dateOfArrival);
			this.shipNumber = shipNumber;
			this.dateToHabour = dateToHabour;
			this.origin = origin;
			
		}
		public String getShipNumber() {
			return shipNumber;
		}
		public void setShipNumber(String shipNumber) {
			this.shipNumber = shipNumber;
		}
		public String getDateToHabour() {
			return dateToHabour;
		}
		public void setDateToHabour(String dateToHabour) {
			this.dateToHabour = dateToHabour;
		}
		
	
}
