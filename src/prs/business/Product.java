package prs.business;

public class Product {

	  private int ID;
	  private int VendorID;
	  private String PartNumber;     
	  private String Name;
	  private double Price;
	  private int Unit;
	  private String PhotoPath;

	  
	  
	public Product(int iD, int vendorID, String partNumber, String name, double price, int unit) {
		super();
		ID = iD;
		VendorID = vendorID;
		PartNumber = partNumber;
		Name = name;
		Price = price;
		Unit = unit;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getVendorID() {
		return VendorID;
	}
	public void setVendorID(int vendorID) {
		VendorID = vendorID;
	}
	public String getPartNumber() {
		return PartNumber;
	}
	public void setPartNumber(String partNumber) {
		PartNumber = partNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getUnit() {
		return Unit;
	}
	public void setUnit(int unit) {
		Unit = unit;
	}
	public String getPhotoPath() {
		return PhotoPath;
	}
	public void setPhotoPath(String photoPath) {
		PhotoPath = photoPath;
	}
	 
	  
	  
	  
}
