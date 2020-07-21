
public class Hardware extends OfficeItem 
{
	//add data member
	public String statusH;
	public String locationH;
	public String personInChargeH;
	public int quantityH;
	
	//default constructor
	public Hardware()
	{
		super();
		this.statusH = "";
		this.locationH = "";
		this.personInChargeH = "";
		this.quantityH = 0;
	}
	
	//normal constructor
	public Hardware(String statusH, String locationH, String personInChargeH, int quantityH)
	{
		super();
		this.statusH = statusH;
		this.locationH = locationH;
		this.personInChargeH = personInChargeH;
		this.quantityH = quantityH;
	}
	
	public String getStatusH()
	{
		return statusH;
	}
	public void setStatusH(String statusH)
	{
		this.statusH = statusH;
	}
	
	public String getLocationH()
	{
		return locationH;
	}
	public void setLocationH(String locationH)
	{
		this.locationH = locationH;
	}
	
	public String getPersonInChargeH()
	{
		return personInChargeH;
	}
	public void setPersonInCharge(String personInChargeH)
	{
		this.personInChargeH = personInChargeH;
	}
	
	public int getQuantityH()
	{
		return quantityH;
	}
	public void setQuantityH(int quantityH)
	{
		this.quantityH = quantityH;
	}

	@Override
	public String toString() {
		return "Hardware [statusH=" + statusH + ", locationH=" + locationH + ", personInChargeH=" + personInChargeH
				+ ", quantityH=" + quantityH + "]";
	}
	
	

}
