package Category;

public class Produce extends Category {

		private float weight;

		public Produce() {
			super();
		}

		public Produce(int id, String itemName, float retailPrice, float discount,  float promotion,float weight) {
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
