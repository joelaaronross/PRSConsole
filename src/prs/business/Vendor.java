package prs.business;

public class Vendor {

	  private int ID;
	  private String Code;
	  private String Name;
	  private String Address;
	  private String City;
	  private String State;
	  private int Zip;
	  private int PhoneNumber;
	  private String Email;
	  private int IsPreApproved;
	
	 
	
	public Vendor(int iD, String code, String name, String address, String city, String state, int zip, int phoneNumber,
			String email, int isPreApproved) {
		super();
		ID = iD;
		Code = code;
		Name = name;
		Address = address;
		City = city;
		State = state;
		Zip = zip;
		PhoneNumber = phoneNumber;
		Email = email;
		IsPreApproved = isPreApproved;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZip() {
		return Zip;
	}
	public void setZip(int zip) {
		Zip = zip;
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
	public int getIsPreApproved() {
		return IsPreApproved;
	}
	public void setIsPreApproved(int isPreApproved) {
		IsPreApproved = isPreApproved;
	}
	
	  
}
