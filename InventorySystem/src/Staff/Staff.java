package Staff;

public class Staff {

		private int userID;
		private String userName;
		private String password;
		private String fullName;
		private String joinedDate;
		
		public Staff() {
			
		}
		
		public Staff(int userID, String userName, String password, String fullName, String joinedDate) {
			this.userID = userID;
			this.userName = userName;
			this.password = password;
			this.fullName = fullName;
			this.joinedDate = joinedDate;
		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getJoinedDate() {
			return joinedDate;
		}

		public void setJoinedDate(String joinedDate) {
			this.joinedDate = joinedDate;
		}
		
		
}
