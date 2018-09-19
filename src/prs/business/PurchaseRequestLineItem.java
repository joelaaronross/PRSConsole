package prs.business;

public class PurchaseRequestLineItem {

	  private int ID;
	  private int PurchaseRequestID;    
	  private int ProductID;      
	  private int Quantity;
	  private int IsActive;
	  private String DateCreated;

	  
	  
	  
	public PurchaseRequestLineItem(int iD, int purchaseRequestID, int productID, int quantity, int isActive,
			String dateCreated) {
		super();
		ID = iD;
		PurchaseRequestID = purchaseRequestID;
		ProductID = productID;
		Quantity = quantity;
		IsActive = isActive;
		DateCreated = dateCreated;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPurchaseRequestID() {
		return PurchaseRequestID;
	}
	public void setPurchaseRequestID(int purchaseRequestID) {
		PurchaseRequestID = purchaseRequestID;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getIsActive() {
		return IsActive;
	}
	public void setIsActive(int isActive) {
		IsActive = isActive;
	}
	public String getDateCreated() {
		return DateCreated;
	}
	public void setDateCreated(String dateCreated) {
		DateCreated = dateCreated;
	}
	  
	  
	  
	
}
