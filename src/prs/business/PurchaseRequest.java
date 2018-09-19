package prs.business;

public class PurchaseRequest {

	  private int ID;
	  private int USERID;
	  private String Description;     
	  private String Justification;
	  private String DateNeeded;
	  private String DeliveryMode;
	  private String Status;
	  private double Total;
	  private String SubmittedDate;
	
	  
	public PurchaseRequest(int iD, int uSERID, String description, String justification, String dateNeeded,
			String deliveryMode, String status, double total, String submittedDate) {
		super();
		ID = iD;
		USERID = uSERID;
		Description = description;
		Justification = justification;
		DateNeeded = dateNeeded;
		DeliveryMode = deliveryMode;
		Status = status;
		Total = total;
		SubmittedDate = submittedDate;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getUSERID() {
		return USERID;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getJustification() {
		return Justification;
	}
	public void setJustification(String justification) {
		Justification = justification;
	}
	public String getDateNeeded() {
		return DateNeeded;
	}
	public void setDateNeeded(String dateNeeded) {
		DateNeeded = dateNeeded;
	}
	public String getDeliveryMode() {
		return DeliveryMode;
	}
	public void setDeliveryMode(String deliveryMode) {
		DeliveryMode = deliveryMode;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	public String getSubmittedDate() {
		return SubmittedDate;
	}
	public void setSubmittedDate(String submittedDate) {
		SubmittedDate = submittedDate;
	}	
	  
	  
	  
	  
	  
}
