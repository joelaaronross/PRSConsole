package prs.business;

public class User {

	private int ID;         
	private String UserName;       
	private int Password;
	private String FirstName;	 
	private String LastName;	 
	private int PhoneNumber;	 
	private String Email;		 
	private int IsReviewer;	 
	private int IsAdmin;
		

	public User(int iD, String userName, int password, String firstName, String lastName, int phoneNumber, String email,
			int isReviewer, int isAdmin) {
		super();
		ID = iD;
		UserName = userName;
		Password = password;
		FirstName = firstName;
		LastName = lastName;
		PhoneNumber = phoneNumber;
		Email = email;
		IsReviewer = isReviewer;
		IsAdmin = isAdmin;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getIsReviewer() {
		return IsReviewer;
	}

	public void setIsReviewer(int isReviewer) {
		IsReviewer = isReviewer;
	}

	public int getIsAdmin() {
		return IsAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		IsAdmin = isAdmin;
	}	
	
	
	
	
}
